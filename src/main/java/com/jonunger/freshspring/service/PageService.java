package com.jonunger.freshspring.service;

import com.jonunger.freshspring.domain.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * PageService
 * PageService is responsible for accessing the json data and building a page for the application.
 * @author junger8
 * Created by junger on 10/4/2015.
 */
public class PageService {

    Logger logger = LogManager.getLogger();

    private Page page;

    /**
     * Page Service Constructor
     * @param slug
     */
    public PageService(String slug) {
        this.page = setPage(slug);
    }

    /**
     * Get Page
     * @return Page
     */
    public Page getPage(){
        return page;
    }

    /**
     * Set Page based on a slug
     * @param slug
     * @return Page
     */
    private Page setPage(String slug) {
        JSONParser parser = new JSONParser();
        List<String> routeList = new ArrayList<String>();
        List<Tout> toutList = new ArrayList<Tout>();
        String headline = "";
        String subheadline ="";
        Long copyYear = 0L;
        String siteName = "";
        String footerMessage = "";

        try {

            Object obj = parser.parse(new FileReader("c:\\coder\\data.json"));

            JSONObject jsonObject = (JSONObject) obj;

            siteName = (String) jsonObject.get("name");
            footerMessage = (String) jsonObject.get("footerMessage");
            copyYear = (Long) jsonObject.get("year");

            // Find Routes
            JSONArray pages = (JSONArray) jsonObject.get("pages");
            Iterator<JSONObject> pagesIt = pages.iterator();
            while (pagesIt.hasNext()) {
                JSONObject page = pagesIt.next();
                String route = (String) page.get("title");
                routeList.add(route);

                if (route.equalsIgnoreCase(slug)){
                    headline = (String) page.get("headline");
                    subheadline = (String) page.get("subheadline");

                    //Get Touts
                    JSONArray touts = (JSONArray) page.get("touts");
                    Iterator<JSONObject> toutsIt = touts.iterator();
                    while (toutsIt.hasNext()) {
                        JSONObject tout = toutsIt.next();
                        String toutHeader = (String) tout.get("header");
                        String toutBtnMsg = (String) tout.get("buttonMessage");
                        String toutContent = (String) tout.get("content");

                        Tout toutf = new Tout(toutHeader,toutContent,toutBtnMsg);
                        toutList.add(toutf);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            logger.error(e);
        } catch (IOException e) {
            logger.error(e);
        } catch (ParseException e) {
            logger.error(e);
        }

        Header header = new Header(headline, subheadline);
        Content content = new Content(header, routeList, toutList);
        Footer footer = new Footer(copyYear,siteName,footerMessage);
        return new Page(header, content, footer);

    }
}
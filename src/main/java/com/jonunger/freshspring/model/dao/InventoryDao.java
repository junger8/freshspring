package com.jonunger.freshspring.model.dao;

/**
 * Created by junger on 10/2/2015.
 */
public class InventoryDao extends AbstractDao {
    private int id;
    private int productId;
    private int invcount;
    private boolean available;

    public InventoryDao(int id, int productId, boolean available) {
        this.id = id;
        this.productId = productId;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getInvcount() {
        return invcount;
    }

    public void setInvcount(int invcount) {
        this.invcount = invcount;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

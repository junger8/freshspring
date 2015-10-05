<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>${title}</title>

	<!-- Bootstrap -->
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">

	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
	<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->
</head>

<body>
<header>
<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<ul class="nav navbar-nav">
			<li><a class="navbar-brand" href="/about">
				<span class="glyphicon glyphicon-leaf" aria-hidden="true"></span>
			</a></li>
			<c:forEach items="${routes}" var="route">
				<li><a href="${route}">${route}</a></li>
			</c:forEach>
		</ul>

	</div>
</nav>
</header>

<div class="jumbotron">
	<div class="container">
		<h1>${headline}</h1>
		<p>${subheadline}</p>
	</div>
</div>

<div class="container">
	<!-- Example row of columns -->
	<div class="row">
	<c:forEach items="${toutList}" var="tout">
			<div class="col-md-4">
				<h2>${tout.header}</h2>
				<p>${tout.message}</p>
				<p><a class="btn btn-default" href="#" role="button">${tout.buttonMessage} &raquo;</a></p>
			</div>
	</c:forEach>

	</div>

	<hr>

	<footer>
		<p>&copy; ${footer}</p>
	</footer>


<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>
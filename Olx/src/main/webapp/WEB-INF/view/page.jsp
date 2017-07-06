<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/resources/css" var="css"></spring:url>
<spring:url value="/resources/js" var="js"></spring:url>
<spring:url value="/resources/images" var="images"></spring:url>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping - ${title}</title>

<!-- Bootstrap Core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Readable theme CSS -->
<link href="${css}/bootstrap-readabletheme-local.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="${css}/myapp.css" rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

<script type="text/javascript">
	window.menu = '${title}';
</script>

</head>

<body>

	<div class="wrapper">

		<!-- Navigation -->
		<%@include file="./share/navbar.jsp"%>

		<!-- Page Content -->
		<div class="content">
			<c:if test="${userClickHome==true}">
				<%@include file="home.jsp"%>
				<!-- /.container -->
				
			</c:if>

			<c:if test="${userClickAbout==true}">
				<%@include file="about.jsp"%>
				<!-- /.container -->
			</c:if>

			<c:if test="${userClickContact==true}">
				<%@include file="contact.jsp"%>
				<!-- /.container -->
			</c:if>
			
			<c:if test="${userClickAllProducts==true or userClickCategoryProducts==true}">
				<%@include file="listProduct.jsp"%>
				<!-- /.container -->
			</c:if>
			
		</div>
		<!-- Footer comes here -->
		<%@include file="./share/footer.jsp"%>


		<!-- jQuery -->
		<script src="${js}/jquery.js"></script>

		<!-- Bootstrap Core JavaScript -->
		<script src="${js}/bootstrap.min.js"></script>
		<!--  Self COded Javascript -->
		<script src="${js}/myapp.js"></script>
	</div>
</body>

</html>

<%@ page import="com.treasurehunter.server.persistence.model.City" %>
<%--
  Created by IntelliJ IDEA.
  User: Dani
  Date: 7/4/2014
  Time: 6:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Index - Treasure Finder</title>
</head>
<body>

	<H1>Test Page</H1>

	<%
		City city = new City();

		city.setName("Budapest");
		city = (City)city.save();
	%>

	<strong>City <%= city.getName() %> has been persisted!</strong>
</body>
</html>

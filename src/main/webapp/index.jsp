<%@ page import="com.treasurehunter.server.persistence.model.City" %>
<%@ page import="com.treasurehunter.server.persistence.dao.CityDAO" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Index - Treasure Finder</title>
</head>
<body>

	<H1>Test Page</H1>

	<%
		City city = CityDao.getInstance().addCity("Budapest");
	%>

	<strong>City <%= city.getName() %> has been persisted!</strong>
</body>
</html>

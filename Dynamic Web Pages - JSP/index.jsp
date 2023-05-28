<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Dynamic Pages - JSP</title>
  </head>

  <%@ page import="java.util.Date" %>

  <body>
    <% response.setIntHeader("Refresh", 3); %>
    <h1><center>Date and Time</center></h1>
    <h3><center>Sytem Date</center></h3>
    <p><center><%=new Date() %></center></p>
  </body>
</html>

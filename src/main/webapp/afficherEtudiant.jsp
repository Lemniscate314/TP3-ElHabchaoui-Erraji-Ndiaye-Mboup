<%--
  Created by IntelliJ IDEA.
  User: issom
  Date: 1/30/2022
  Time: 5:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Afficher les informations des étudiants</title>
</head>
<body>
<form action = "Serv">
    <%@ page import =" com.example.serv.ScolariteManager"%>
    <%@ page import="com.example.serv.Etudiant" %>
    <%@ page import="static com.example.serv.ScolariteManager.listEtu" %>
    <% listEtu.toArray();



    %>

</form>
</form>
</body>
</html>

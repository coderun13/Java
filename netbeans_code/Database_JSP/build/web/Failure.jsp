<%-- 
    Document   : Failure
    Created on : 13 Aug, 2025, 3:41:34 PM
    Author     : Snehal Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
            String s1= (String)session.getAttribute("name");
            out.println("Not Welcome "+s1);
        %>
    </body>
</html>

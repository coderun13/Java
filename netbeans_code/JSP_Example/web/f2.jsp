<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome screen</title>
    </head>
    <body>
        <%
            String s1= request.getParameter("name");
            out.println("Welcome "+s1);
        %>
    </body>
</html>

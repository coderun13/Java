<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Registration</title>
</head>
<body>
<%
    String emp_id = request.getParameter("emp_id");
    String name = request.getParameter("emp_name");
    String sal = request.getParameter("emp_salary");
    session.setAttribute("name", name);

    name = name.replace("'", "''"); // Escape single quotes

    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "javasql");
        Statement stmt = con.createStatement();
        String ql = "INSERT INTO employee_details VALUES ('" + emp_id + "', '" + name + "', " + sal + ")";
        int x = stmt.executeUpdate(ql);
        con.close();

        if (x > 0) {
%>
    <jsp:forward page="Success.jsp"/>
<%
        } else {
%>
    <jsp:forward page="Failure.jsp"/>
<%
        }
    } catch (Exception e) {
        out.println("<p>Error: " + e.getMessage() + "</p>");
    }
%>
</body>
</html>
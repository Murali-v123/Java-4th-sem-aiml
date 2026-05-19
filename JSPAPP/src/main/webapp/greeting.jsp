<%-- Page directive: import Java classes --%>
<%@ page language="java" contentType="text/html" %>
<%@ page import="java.time.LocalTime" %>

<!DOCTYPE html>
<html>
<head><title>Greeting</title></head>
<body style="font-family:Arial; padding:40px">

<%-- Scriptlet: run Java code --%>
<%
    // Read URL parameter: greeting.jsp?name=Ravi
    String name = request.getParameter("name");
    if (name == null || name.isEmpty()) name = "Guest";

    // Decide greeting based on current time
    LocalTime now = LocalTime.now();
    String greeting;
    if      (now.getHour() < 12) greeting = "Good Morning";
    else if (now.getHour() < 17) greeting = "Good Afternoon";
    else                           greeting = "Good Evening";
%>

<%-- Expression: output the variable value --%>
<h1 style="color:#1565C0"><%= greeting %>, <%= name %>! 👋</h1>
<p>Current hour: <%= now.getHour() %></p>

</body>
</html>
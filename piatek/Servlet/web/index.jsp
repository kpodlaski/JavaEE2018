<%--
  Created by IntelliJ IDEA.
  User: Krzysztof Podlaski
  Date: 12.10.2018
  Time: 08:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
  <table border="1">
  <%
    for (int i=0; i<10; i++){
  %>
  <tr><td>
  <%
        out.println(i);
  %>
  </td></tr>
  <%
    }
  %>

    <%= "Ala ma kota".length()%>
  </table>
  </body>
</html>

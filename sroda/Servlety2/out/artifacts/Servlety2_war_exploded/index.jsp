<%--
  Created by IntelliJ IDEA.
  User: Krzysztof Podlaski
  Date: 10.10.2018
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java"
         import="model.Person"%>
<html>
  <head>
    <title>Sokoły</title>
  </head>
  <body>
  <table>
    <tr>
      <td> Sokół 1 </td><td><img src="img/sokol.jpg"></td>
    </tr>
    <tr>
      <td> Sokół 2 </td><td><img src="img/sokol.png"></td>
    </tr>
  </table>
  <%
      for (int i=0; i<10; i++){
          out.println(i);
      }
      Person osoba = new Person("Adam","Adamiak");
  %>
  <b>
  <%=2*3+17
  %>
  <%  for(int i=0; i<3; i++){

  %>
      <%=osoba.desc()%>
  <%
     }
  %>
  </b>
  </body>
</html>

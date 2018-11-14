<%@ page import="dao.db.ram.RamDAOImpl" %>
<%@ page import="dao.DAO" %>
<%@ page import="model.Person" %><%--
  Created by IntelliJ IDEA.
  User: Krzysztof Podlaski
  Date: 19.10.2018
  Time: 09:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="dao" class="dao.db.ram.RamDAOImpl"
    scope="session"/>
<%
    String sid = request.getParameter("pid");
    if (sid==null) sid="1";
    int id = Integer.parseInt(sid);
    Person person = dao.getPersonById(id);
    //Person p = new Person("Ala","Aleksandowska");
    //p.setId(3);
    //dao.getAllPersons().add(p);
%>

<html>
<head>
    <title><%= person.getName()%> <%= person.getSurname()%></title>
</head>
<body>
    <img src="<%= person.getPhoto()%>" >

</body>
</html>

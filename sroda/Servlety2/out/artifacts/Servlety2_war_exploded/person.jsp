<%@ page import="dao.dao.basicimpl.RamDAO" %>
<%@ page import="dao.DAO" %>
<%@ page import="model.Person" %><%--
  Created by IntelliJ IDEA.
  User: Krzysztof Podlaski
  Date: 17.10.2018
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib
        uri="http://java.sun.com/jsp/jstl/core"
        prefix="c" %>
<jsp:useBean id="pp" class="model.Person" scope="session">

</jsp:useBean>

<%
    DAO dao = new RamDAO();
    int id =   Integer.parseInt(request.getParameter("id"));
    Person p = dao.getPersonById(id);
    pp.setName(p.getName());
    pp.setSurname(p.getSurname());
    pp.setFoto(p.getFoto());
%>

<html>
<head>
    <title>${pp.name} ${pp.surname} </title>
</head>
<body>
<table>
    <tr>
    <td>
    <table>
        <tr>
            <td>Imie: </td><td>${pp.name}</td>
        </tr>
        <tr>
            <td>Nazwisko: </td><td>${pp.surname}</td>
        </tr>
    </table>
    </td>
    <td>
        <img src="${pp.foto}" >
    </td></tr>
</table>
<jsp:useBean id="my_dao" class="dao.dao.basicimpl.RamDAO"/>
<c:forEach var="person" items="${my_dao.allPersons}">
    Item <c:out value="${person.name}"/><p>
    </c:forEach>
</body>
</html>

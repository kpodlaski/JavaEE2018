<%--
  Created by IntelliJ IDEA.
  User: Krzysztof Podlaski
  Date: 26.10.2018
  Time: 08:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c" %>
<jsp:useBean id="dao" class="dao.db.ram.RamDAOImpl"
             scope="session"/>
<jsp:useBean id="data" class="model.communication.SimpleData"/>
<jsp:setProperty name="data" property="*" />

<html>
<head>    <title>Title</title></head>
<body>
<c:forEach var="i" begin="1" end="12">
    <b>${i}</b><br/>
</c:forEach>
<c:forEach var="person" items="${dao.allPersons}">
    ${person.name}<br/>
</c:forEach>
    ${data.name} ${data.value}
</body>
</html>

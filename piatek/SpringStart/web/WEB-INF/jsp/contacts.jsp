<%--
  Created by IntelliJ IDEA.
  User: Krzysztof Podlaski
  Date: 20.12.2018
  Time: 09:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="person" items="${persons}">
    ${person.name}<br/>
    ${person.email}<br/>
    <hr>
</c:forEach>
</body>
</html>

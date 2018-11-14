<%--
  Created by IntelliJ IDEA.
  User: Krzysztof Podlaski
  Date: 24.10.2018
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="pagepar" class="model.PageParameters"
             scope="request"/>
<jsp:setProperty name = "pagepar" property="*" />

<html>
<head>
    <title>Title</title>
</head>
<body>
${pagepar.name} ${pagepar.value} ${pagepar.id}
</body>
</html>

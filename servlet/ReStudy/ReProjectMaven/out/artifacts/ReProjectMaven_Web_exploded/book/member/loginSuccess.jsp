<%@ page import="member.vo.Member" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-07-26
  Time: 오후 4:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <% Member member = (Member)request.getAttribute("member"); %>
    <title>success!</title>
    <%= member.getName() %>님 환영합니다.

</head>
<body>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-06-22
  Time: 오후 4:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String userid = request.getParameter("userid");
%>
<h1>당신의 아이디는 <%=userid%>입니다.</h1>
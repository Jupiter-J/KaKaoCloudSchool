<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-06-23
  Time: 오전 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String username = request.getParameter("username");
    String phone = request.getParameter("phone");
    String email = request.getParameter("email");
%>
<%=username%><br>
<%=phone%><br>
<%=email%><br>
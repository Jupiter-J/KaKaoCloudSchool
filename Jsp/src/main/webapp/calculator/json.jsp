<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-06-22
  Time: 오후 5:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

    int x = Integer.parseInt(request.getParameter("x"));
    int y = Integer.parseInt(request.getParameter("y"));
    String oper = request.getParameter("oper");
    int result = 0;

    if (oper.equals("btn1"))
        result = x+y;
    else if(oper.equals("btn2"))
        result = x-y;
    else if(oper.equals("btn2"))
        result = x+y;
    else
        result = x/y;
%>
<%--<h3>결과는 <%=result%> 입니다</h3>--%>

{"result":"success", "value": "<%=result%>"}


<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-07-26
  Time: 오후 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%  request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("userName"); %>
    <title>JSP PAGE</title>
</head>
<body>
    소리없는 아우성의 JSP <br><br>
    받은 데이터는 : <%= name%>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-06-23
  Time: 오전 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.json.*"%>
<%@ page import="org.json.simple.JSONArray" %>
<%@ page import="org.json.simple.JSONObject" %>
<%
    JSONArray jsonArray = new JSONArray();

    for (int i=1; i<=10; i++){
        JSONObject jo = new JSONObject();
        jo.put("id", i+"");
        jo.put("title", "제목"+i);
        jo.put("writer", "작성자"+i);
        jo.put("hit", 100+1);
                    //put
        jsonArray.add(jo);
    }

    JSONObject result = new JSONObject();
    result.put("totalCount", 10);
    result.put("data", jsonArray);
    //html문서는 out을 사용하기!
    out.println(result);

%>
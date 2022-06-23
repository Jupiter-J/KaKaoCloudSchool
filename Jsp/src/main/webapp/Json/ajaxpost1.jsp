<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-06-23
  Time: 오전 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    이름 : <input type="text" name="username" id="username"><br>
    전화번호 : <input type="text" name="phone" id="phone"><br>
    이메일 : <input type="text" name="email" id="email"><br>
    <button type="button" id="btnSend"> 보내기 </button>


</body>
</html>
<script>
    window.onload=function (){
        document.getElementById("btnSend").addEventListener("click", function(){

            let xhttp = new XMLHttpRequest();
            xhttp.onload = function(){
                console.log(this.responseText);
            }

            xhttp.open("POST", "receive1.jsp");
            xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
            let temp = "username=" + document.getElementById("username").value;
            temp += "&phone="+ document.getElementById("phone").value;
            temp += "&email=" + document.getElementById("email").value;
            console.log(temp);
            xhttp.send(temp);
        });





    }
</script>
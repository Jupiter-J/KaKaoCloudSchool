<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-06-22
  Time: 오후 4:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    아이디 : <input type="text" name="userid" id="userid"> <br>
    <button id="btnSend" type="button"> 보내기 </button>
    <div id="result"></div>

</body>
</html>
<script>
    window.onload=function (){
        document.getElementById("btnSend").addEventListener("click", loadData);
    }

    function loadData() {
        var xhttp = new XMLHttpRequest();
        xhttp.onload = function (){
            console.log(this.responseText);
            document.getElementById("result").innerHTML = this.responseText;
        }

        let url = "receiveon.jsp?userid=" + document.getElementById("userid").value;
        console.log(url);
        xhttp.open("GET", url, true);
        xhttp.send();
    }
</script>
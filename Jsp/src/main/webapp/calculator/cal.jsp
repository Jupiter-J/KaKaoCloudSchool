<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-06-22
  Time: 오후 5:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    x값 : <input type="text" name="xvalue" id="xvalue"> <br>
    y값 : <input type="text" name="yvalue" id="yvalue"> <br>
    <button id="btn1" type="button" > + </button>
    <button id="btn2" type="button" > - </button>
    <button id="btn3" type="button" > x </button>
    <button id="btn4" type="button" > / </button>
    <div id="result"></div>

</body>
</html>
<script>
    window.onload = function (){
        for (i=1; i<=4; i++)
        document.getElementById("btn"+i).addEventListener("click", cal);

    }

    function cal(event){
        var x = document.getElementById("xvalue").value;
        var y = document.getElementById("yvalue").value;
        var oper = event.target.id;

                //호출하고자 하는 파일
        var url = "json.jsp?x="+x+"&y="+y +"&oper="+oper;
        console.log(url);

        var xhttp = new XMLHttpRequest();
        xhttp.onload = function (){
            document.getElementById("result").innerHTML = this.responseText;
        }

        xhttp.open("GET", url, true);
        xhttp.send();

    }


</script>
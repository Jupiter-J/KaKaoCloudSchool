<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-06-22
  Time: 오전 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
</head>
<body>
    <form id="form">
        <input type="hidden" name="seq" id="seq" value="1000"> <br>
        <div id="result"></div>
        <button id="btnPress" type="button">히든 값 읽기</button>
        <br>
        이름 : <iniput type="text" name="username"></iniput><br>
        이메일: <iniput type="text" name="email"></iniput><br>

        <h1> radio button</h1>
        나이: <br>
            <input type="radio" name="age" value="10">10대
        <input type="radio" name="age" value="10">10대
        <input type="radio" name="age" value="10">10대
        <input type="radio" name="age" value="10">10대
        <input type="radio" name="age" value="10">10대
        <br>

        <h1>관심분야(checkbox)</h1>
        <input type="checkbox" name="interest" value="1"> 프로그래밍
        <input type="checkbox" name="interest" value="2"> 웹 프로그래밍
        <input type="checkbox" name="interest" value="3"> Database
        <input type="checkbox" name="interest" value="4"> 빅데이터
        <input type="checkbox" name="interest" value="5"> 인공지능

        <br>
        <h1>좋아하는 색(select)</h1>
        <select name="color">
            <option value=""> --선택하세요--</option>
            <option value="red">red</option>
            <option value="green">green</option>
            <option value="blue">blue</option>

        </select>

    </form>

</body>
</html>
<script>

    $(()=>{
        $("#btnPress").click(()=>{
            $("input[type=hidden][name=seq]").val(123456);
            $("#result").html($("input[type=hidden][name=seq]").val());
        })
    })

    function loadData(){
        $("input[type=text][name=username]").val("홍길동");
        $("input[type=text][name=email]").val("aajaj@naver.com");

        //radio 버튼은 인덱스 대신에 eq(1)
        $("input[type=radio][name=age]").eq(1).prop("checked",true); //1번방 데이터를 선택하라

    }
</script>
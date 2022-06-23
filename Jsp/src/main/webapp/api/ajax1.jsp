<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-06-23
  Time: 오전 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>

</head>
<body>
    <div id="result"></div>
    <button type="button" id="btnCall">파일 불러오기</button>

</body>
</html>
<script>
    $(()=> {
        $("#btnCall").click(()=>{
            $.ajax(
                {
                    url:"ajax_test.txt",
                    method:"GET",
                    dataType:"text"
                    }
                )
                .done(
                    (result)=> {
                        $("#result").html(result);
                    }
                )
                .fail( (jqXhr, error)=>{
                console.log(error);
            })
        })
    })

</script>
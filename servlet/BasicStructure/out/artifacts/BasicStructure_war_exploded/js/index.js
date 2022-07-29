

function myFunc(){
    alert("클릭이 되었어요!");
    /**
     제이쿼리 사용
     1. 내가 원하는 Element를 찾아서 Jquery 객체로 변경
     2. Selector를 사용하면 된다


     */
    // $("*").css("color", "red"); 전체 선택자
    // alert($("div").text()); 태그 선택자
    // $("div").text("깔깔깔") 태그사이의 글자를 인자를 이용해서 변환
    // $("#myLi").remove() 아이디 선택자
    // $(".haha")클래스 선택자 .뒤에 붙인다
    $(".haha").css("background-color", "yellow");

}
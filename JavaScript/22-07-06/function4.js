
function foo(){}

//함수에 property를 붙임 - primitive value
foo.myName = '홍길동';
// 함수도 넣기 
foo.getName = function(){
            //this foo 객체
    console.log(this);
}


//foo(); //함수 호출

//new foo(); //생성자 함수 호출

foo.getName(); //메서드 호출
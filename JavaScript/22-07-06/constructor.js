
//함수 선언문
function foo(){}  //함수가 하는일 아무것도 없음

//함수 표현식
var bar = function(){};

//일반 객체 - 객체의 property로 함수가 할당
const brax = {
    x: function(){}
}


//new로 호출할 수 있는 이유는 foo 함수객체가 
//내부 메소드 [[Constructor]]을 가지고 있기 때문
new foo();
new bar();
new brax.x();

const arrow = () => {} 
// new arrow();

const obj = {
    x(){

    }
}
new obj.x();
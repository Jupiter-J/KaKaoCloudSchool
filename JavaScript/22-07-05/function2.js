
foo(); //호출된다
add(); //error : not a function

//함수 선언문 -> 런타임 이전에 만들어짐
function foo(){
    console.log('foo 함수');
}

//함수 표현식 -> 런타임 후에 만들어진다
var add = function bar(){
    console.log('bar함수');
}


(function bar(){
    console.log('bar 함수');
})

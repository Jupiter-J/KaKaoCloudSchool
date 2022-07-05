

var x = 1; //전역 scope의 전역 변수

function foo(){
    var x = 10; //지역 scope의 지역 변수
    bar();
}

function bar(){
    console.log(x);
}

foo();
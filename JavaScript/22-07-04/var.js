


var x = 1;  //전역변수
function myFunc(){
    var x = 100;  //함수lv 스코프임으로 함수의 값으로 출력 (function-level scope)
    console.log(x);
}

console.log(x); //1
myFunc(); // 100

//처음부터 존재함
function calc(x,y){
    return x + y;
}

//이 라인에 도달했을 때 add 라는 변수에 함수의 주소를 저장한다
let add = function(x,y){
    return x + y;
}

console.log(calc(10,20));
console.log(add(5,7)); //자바스크립트는 비동기 모드를 지원함
/**
 * 
비동기 처리는 보통의 함수처럼 하나의 일을 시작하고 일을 마무리한 다음에 다른 일을 처리하지 않고
일을 시작하고 바로 리턴하고 백그라운드에서 시스템이 계쏙 일을 수행함
백그라운드에서 일을 계속 처리하다가 모든 일이 완료할 시점에 완료를 알뤄야 하는데
이때 사용되는 방법이 콜백함수이다 
콜백함수 생성 -> 주소 전달 -> 시스템이 호출 
*/

function callFunction(func){
    func()
}

callFunction( function(){console.log("Hello")} );
callFunction( ()=>{console.log("Hello")} );

let sigma = function(limit=10){
    let i, sum=0;
    for(i=1; i<=10; i++)
    {
        sum += i;
    }
    return sum;
}

console.log(sigma());
console.log(sigma(10));



//함수 선언문
function sayHello(){
    console.log('Hello');
}
sayHello();

//함수 표현식
let sayHello = function(){
    console.log('HEllo');
}
sayHello();

//화살표 함수
// 1
const add = function(num1, num2){
    return num1 + num2;
}

// 2
add = (num1, num2)=>{
return num1 + num2;
}  

//3 - 코드 본문이 한줄이고 리턴이 있기 때문에 일반 괄호로 변경가능
add = (num1, num2) => (num1 + num2)
//4 - 리턴문이 한줄이라면 괄호도 없어도 됨4
add = (num1, num2) => num1 + num2;

//인수가 하나인 화살표 함수는 앞의 괄호도 생략 가능 
let sayHello = name => 'Hello, ${name}';

//인수가 없는 화살표 함수
let sayERror = ()=>{ alert('error!'); }
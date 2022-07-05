
//함수 선언문
function add(){
    // arguments [2,4,6]
    let sum=0;
    for(let i=0; i<arguments.length; i++){
        sum += arguments[i];
    }
    return sum;
}

console.log(add(2,5)); //7 
console.log(add(2)); //NaN(연산불가) - 호출가능
console.log(add(2,4,6)); //NaN(연산불가) - 호출가능
//함수 내부에 들어가 있는 인자를 보관하는 변수 - arguments 라는 property가 있다

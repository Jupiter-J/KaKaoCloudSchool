
let add = function(a, b){
    return a + b;
}

function div(x,y){
    return x/y;
}

function myfunction(callback, x, y){
    result = callback(x,y); //매개변수로 전달받은 함수 호출하기 
    console.log(`${x}, ${y}, ${result}`);

}

myfunction(add, 10 , 20);
myfunction((x,y)=>{return x -y});
myfunction(function(x,y){return x*y}, 10, 20);
myfunction(div, 10, 20);

let funArr = [(x,y) => x +y, (x,y) => x -y, (x,y) => x *y, (x,y) => x /y]
console.log(funArr[0](3,4));
console.log(funArr[1](3,4));
console.log(funArr[2](3,4));
console.log(funArr[3](3,4));


//funArr.forEach(myfunction()=> console.log(myfunction));
for(i in funArr)
    console.log(funArr[i](7,3));

for(fun of funArr)
    console.log(fun(6,3));

//콜백함수가 첫번째 매개변수 - 배열의 요소, 두번째 매개변수 - 인덱스, 값 반환 불가 
funArr.forEach((fun, index)=>{
    console.log(fun(3,4))
})

console.log("////////////////");

funArr.forEach((fun)=>{
    console.log(fun(3,4))
})


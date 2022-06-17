

let arr=[3,2,1,4,7,8,9,11,12,19,16]; //배열 - 대괄호를 써서 배열을 만든다
function odd(x){
   return x%2 === 1;
}
let result = arr.filter(odd) 
console.log(result);

result = arr.filter(function(x){return x%2==1});
console.log(result);

                    //변수명 x는 마음대로! 
result = arr.filter( x=> x % 2==1);
console.log(result);
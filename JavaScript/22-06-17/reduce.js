

var arr = [9,2,8,5,7];
var sum=0;

sum = arr.reduce((pre, curr)=>{
    console.log( `pre : ${pre}`); //앞선값 
    console.log( `curr : ${curr}`); //뒤의값 

    return pre + curr; 
}, 10);
console.log(sum);


//찍수의 개수를 세어보자
cnt = arr.reduce((pre, curr)=>{
    if(curr%2==0)
        return pre +1;
    else
        return pre;
}, 0);

console.log(cnt);



let words = ["school", "rain", "rainbow", "sales", "marketing"];
// total = words.reduce((pre, curr) => {
//         return pre  +curr;
// });
// console.log(total);

temp = words.reduce((prev, curr) => {
    return  prev+" " + curr;
}, "");
console.log(temp);

let add = (x,y)=>{return x+ y}

let sigma = (limit=10)=>{
    if(limit<1)
        return;  //자바라면 에러지만 자바스크립트는 undefined반환하며 끝낸다

    let i, sum =0;
    for(i=1; i<=limit; i++)
    {
        sum += i;
    }
    return sum;
}

console.log(add(10,20));
console.log(sigma());
console.log(sigma(-1));
console.log(sigma(100));
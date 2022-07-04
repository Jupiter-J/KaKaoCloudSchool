
//블록 lv임으로 다른값으로 인식
let score = 100;
{
    let score = 10; 
    let myVar = 1;
}

console.log(myVar); //블록이 끝나면 사라진다. 즉 외부에서 호출이 안된다 



//전역 변수(전역 스코프)
//var은 함수로 실행됨
var x = 100;

// if(true){
//     var x = 1000;
// }

console.log(x); //1000

for(var i=0; i<5; i++){
    console.log(i);
}

console.log(i);
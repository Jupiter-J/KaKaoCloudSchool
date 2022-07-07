
'user strict'


function foo(){
    x = 10; // implicit global (묵시적 전역)
            // 전역 변수화 (whindow 객체의 property로 붙는다)
}

foo();

console.log(x);
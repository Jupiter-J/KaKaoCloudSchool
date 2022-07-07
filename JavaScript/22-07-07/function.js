


function foo(){
    //외부함수의 식별자를 참조하지 않고 있음으로 클로저가 아니다 
    const x = 1;
    const y = 2;

    //clouser가 아니다 3번을 부합하지 않음 
    //중첩함수 + 내부함수 
    function bar(){
        const z = 3;
        console.log(z);
    }
    return bar;
}
const bar = foo();
bar();

//외부함수의 식별자를 레퍼런스 하고 있느냐 없느냐

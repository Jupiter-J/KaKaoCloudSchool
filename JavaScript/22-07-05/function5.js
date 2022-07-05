

var x = 100; //global scope (전역변수)
var y = 200; //global scope (전역변수)

//outer function
function outer(){
    let x = 0; // function level scope(지역변수)
    
    //inner function
    function inner(){
        let x = 10; // function level scope(지역변수)
        console.log(y);
    }
}

//모든 스코프는 체인으로 얽혀있다
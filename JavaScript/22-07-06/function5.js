

//고차함수 allback
function foo(f){
    return f();
}

function bar(){
    return `aller:` * bar.caller}

    console.log(bar()); // aller:null
    foo(bar)
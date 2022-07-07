


function foo(){
    const x = 1;
    const y = 2;

 
    function bar(){
        const z = 3;
        console.log(z);
    }
    return bar;
}
const bar = foo();
bar();



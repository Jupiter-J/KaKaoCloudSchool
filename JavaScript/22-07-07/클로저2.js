
const counter = (function(){
    let num =0;

    return {
        //메소드
        increase(){
            return ++num;
        },
        decrease(){
            return --num;
        }
    }
}());
console.log(counter.increase());
console.log(counter.increase()); 
console.log(counter.increase()); 

console.log(counter.decrease());
console.log(counter.decrease());
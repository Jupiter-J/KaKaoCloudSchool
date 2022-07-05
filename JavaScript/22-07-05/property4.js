
//객체 리터럴 확장 표현 방식
//식별자를 이용해서 key 생성
let x = 1;
let y = 2;

const obj = {x, y}
console.log(obj); //{ x: 1, y: 2 }

let myObj = {
    name: '홍길동',
    printName : function(){
        console.log(this.name);
    }
}
myObj.printName();

let youObj = {
    name: '홍길동',
    printName(){
        //javascript의 명시적 메소드 (축약 표현이 된것)
        console.log(this.name);
    }
}
youObj.printName();
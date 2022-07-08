

class Base{
    constructor(name){
        this.name = name;
    }
    sayHello(){
        return "안녕하세요";
    }
}

class Derived extends Base{
    sayHello(){
        return super.sayHello() + this.name;
    }
}

const derived = new Derived('홍길동');
console.log(derived.sayHello());




function Person(name){
    this.name = name
}

Person.prototype = {
    sayHello(){
        console.log('안녕하세요! ');
    }
}

const me = new Person('홍길동');
console.log(me.constructor === Object);   //true
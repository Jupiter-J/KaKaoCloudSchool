


function Person(name){
    this.name = name;
    //인스턴스 메소드
    this.getName = function(){

    }
}

//prototype 메소드 선언
//prototype 객체에 함수를 붙이면 prototype 함수라고 한다 
Person.prototype.sayHello = function(){
    console.log(`안녕하세요. ${this.name}`);
}

// 인스턴스 생성
const me = new Person('홍길동');

// 오버라이딩
//만약 오버라이딩이 발생하면 이 발생된 ooveriding에 의해서
//숨겨진 protottype 메소드를 property shadowing 되었다고 말한다 
me.sayHello = function(){
    console.log(`Hello ${this.name}`);
}
me.sayHello();
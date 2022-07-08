

class Person{
    //constructor
    constructor(name){
        //instance의 초기화
        //instance의 property를 설정
        this.name = name;
    }

    //prototpye 메소드
    sayHello(){
        console.log('안녕하세요');
    }

    //static 메소드
    //생성자 자체에 붙음 
    static sayHi(){
        console.log('요건 static');
    }
}

const me = new Person('홍길동');
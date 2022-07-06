
var tmp = 100; //window property로 붙인다 

// 생성자 함수로 사용할 목ㅈ거으로 만들었다 
// 함수 선언문
function Person(name){
    
    //property를 재정의
    //생성자 함수로 만들어질 instance가 가지는
    //property를 설정한다
    this.name = name;
    //생성자의 this는 앞으로 내가 만들 객체를 가르킴

}

const person = new Person('홍길동');
person.name;
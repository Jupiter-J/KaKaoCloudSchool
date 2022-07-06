

//함수 선언문으로 사용자 함수 만들기
//이름 식별자는 pascalCase - 대문자{관용적으로 생성자 함수는 대문자를 사용한다}
function Person(){

    //함수에서 return문을 적지 않으면 undefined로 리턴된다 
}


//리터럴로 만든 객체
const person1 = Person();
console.log(person1); //undefined

//생성자로 만든 객체 (인스턴스)
const person2 = new Person();
console.log(person2); //Person {}

//객체 리터럴
var person3 = {} 
console.log(person3); // {}
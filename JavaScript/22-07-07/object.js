

//객체를 생성하는 방법
//객체를 생성할때 객체의 상위 프로토타입 객체를 직접 지정할 수 있다 
const obj = Object.create(null)

console.log(obj.__proto__); //undefined
//Object가 가지고 있는 method를 이용하는게 좋다


//상위메소드를 호출
console.log( Object.getPrototypeOf(obj)); //null 
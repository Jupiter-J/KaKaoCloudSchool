

//생성자 함수에서 return 구문이 있을때
// primitive value를 리턴하면 안에서 만든 this.암묵적으로 리턴된다
function Person(name){
    this.name = name;
    this.getName = function(){
        return `내 이름은 ${this.name}`;
    }
    //생성자 함수를 할때는 return구문이 없는게 맞다
    return 100;
}

const person1 = new Person('아이유');
const person2 = new Person('김연아');

console.log(person1.getName());
console.log(person2.getName());

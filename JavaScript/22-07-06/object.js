
'user strict';
 
const person = {
    name: 'lee'
};

// 객체가 확장이 가능한지 - property 추가가 가능한지
console.log(Object.isExtensible(person)); //true

person.age = 20;
console.log(person); //{ name: 'lee', age: 20 }

// 확장을 금지시켜보기
Object.preventExtensions(person);
person.addres = '서울';
console.log(perosn);

Object.seal(person);
delete person.name;
console.log(person);

Object.freeze(person);
person.name = '아이유'
console.log(person);


//property attribute를 확인해보아요
const person = {
    name: 'lee',
    age: 20
}

// person이라는 객체에 name이라는 attribute를 가져와라 
console.log(Object.getOwnPropertyDescriptor(person, 'name'));
// log : { value: 'lee', writable: true, enumerable: true, configurable: true }
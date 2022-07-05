


const person = {
    age: 20
};

// person.name = '홍길동';
//defineProperty 하나의 프로퍼티만 설정 
Object.defineProperty(person, 'name', {
    value: '홍길동',
    writable: false,
    enumerable: false, //열거
    configurable: true //재할당
});

console.log(person);
console.log(Object.getOwnPropertyDescriptor(person, 'name'));

person.name = '아이유';
console.log(person);
console.log( Object.keys(person));

for(let idx in person){
    console.log(idx); //property key
}

for(let value of person){
    console.log(value); //property value
}
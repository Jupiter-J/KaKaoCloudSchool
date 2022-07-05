

//primitive value는 값이 복사됨
//레퍼런스는 메모리를 가르킴 (같은것을 가르킨다)
let person = {name: 'lee'}
let copy = person;

console.log(copy); //{ name: 'lee' }
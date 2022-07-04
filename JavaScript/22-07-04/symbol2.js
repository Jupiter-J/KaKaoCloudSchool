


const s1 = Symbol.for('mySymbol');
//global Symbol regiistry라는 곳이 있다
//일단 거기에서 해당 인자를 키로 가지고 있는 symbol을 찾는다 
//만약 존재하지 않으면 symbol을 만들고 
//global symbol registry에 등록하고 symbol을 리턴

const s2 = Symbol.for('mySymbol');
console.log(s1 === s2); //true

console.log(Symbol.keyFor(s2));

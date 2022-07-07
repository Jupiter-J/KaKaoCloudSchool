


//함수 표현식
var foo = function(){};
console.log( foo.__proto__ === Function.prototype); //true

console.log( foo.prototype.__proto__ === Object.prototype); //true

console.log( Object.prototype.__proto__); //null

            //constcutor 상속받음
console.log( foo.constructor === Function );
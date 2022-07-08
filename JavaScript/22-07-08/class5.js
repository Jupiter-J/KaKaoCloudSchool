

const person = {
    firstName: '길동',
    lastName: '홍',

    //get을 이용하면 반드시 return구문이 존재해야 한다 
    get fullName(){
        return `${this.lastName}${this.firstName}`
    }
    ,
    getName : function(){
        return this.lastName + this.firstName
    }
}

//지양한다
person.firsName = 'rla'

person.fullName = '김연아'
console.log(person.fullName);
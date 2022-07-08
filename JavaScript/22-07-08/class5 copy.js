

class Person{
  
    constructor(firstName, lastName){
        rhis.firstName = firsName;
        this.lastName = lastName;
    }

    //get을 이용하면 반드시 return구문이 존재해야 한다 
    get fullName(){
        return `${this.lastName}${this.firstName}`
    }
    
    set fullName(name){
        [this.lastName, this.firstName] = name.split(' ')
    }

}

//지양한다
const me = new Person('길동', '홍');
me.fullName = '김연아'
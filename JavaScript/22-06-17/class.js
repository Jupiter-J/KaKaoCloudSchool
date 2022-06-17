

class User{
    //생성자에서 변수 
    constructor(name){
        console.log("생성자");
        this.name = name;
      
    }

    sayHi(){
      console.log("hi" + this.name);
       
    }
}

let user = new User("TOM");
user.sayHi();
user.age = 12;
console.log(user.age);
console.log(user);
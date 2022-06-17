
let person = {
    name : "홍길동", age:23, phone:"010-0000-0001",
    display:function(){
        console.log(this.name, this.age, this.phone);
    //     console.log(name, age, phone);
    },
    // display2: ()=> {
    //     console.log(this.name, this.age, this.phone);
    // }
    
    setValue:function(name="", age=10, phone=""){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
}

person.display();
person.setValue("임꺽정", 33, "011 - 2222 -1111");
person.display(); 


console.log("----상속-----")

//상속을 받아보자
let students = {name: "장길산", kor:90, eng:80, mat:70,
__proto__:person}
console.log(students);
console.log(students.phone, students.ege);
students.setValue("임꺽정", 33, "010-0000-0000");
students.display();
console.log(students);

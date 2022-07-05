


//property key에는 메서드가 들어갈 수 있다 
var obj = {
    'name': '홍길동',
    'printName': function myPrint(){
        //현재 사용하는 객체를 지칭하는 것 this
        console.log(`내이름은 ${this.name}`);
    },
    myphone : '10-484848',
    "@myphone" : '10-484848'

};

console.log(typeof obj);  //object

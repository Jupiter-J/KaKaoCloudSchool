


// sattic property/ method
function Person(name){
    this.name = name;
    //인스턴스 메소드
    this.callme = function(){
        
    }
}

//상속이 일어나는 prototype 메소드
Person.prototype.sayHello = function(){
    console.log('안녕하세염');
}

//sattic method
Person.sataticMethod = function(){
    console.log('하이하이');
}
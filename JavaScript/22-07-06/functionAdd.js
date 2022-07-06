//함수호출과 생성자 호출에 따른 this가 다르다 

//함수 선언
function add(x,y){
    return x + y;
}

var inst = new add();
console.log(inst); //내부에 property가 없다 

function createUser(name, role){
    return {name, role};
}

inst = new createUser();
console.log(inst); //{ name: undefined, role: undefined }

//생성자 함수
function Circle(radius){
    this.radius = radius;
    this.getDiameter = function(){
        return 2 * this.radius;
    }
}

const circle = Circle(5);

console.log(radius); //5
console.log(circle); //undefined 
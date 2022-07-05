


var myFunc = function add(x,y){
    return x + y;
}

//js에서 함수는 함수 내에서만 사용 가능하다
console.log(add(3,5)); //error: not defined

//식별자를 사용해야 호출이 가능
console.log(myFunc(3,5)); //8



//함수는 함수 이름으로 호출하는게 아니라 식별자로 호출한다
var myFunc = function (x,y){
    return x + y;
}

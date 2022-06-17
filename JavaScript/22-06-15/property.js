
let n = "name";
let a = "age";

const user = {
    [n]: "Mike",
    [a]: 30,
    [1+4]: 5,
};

console.log(user);


function makeObj(key,value){
    //객체 리턴
    return {
        [key] : value
    }
}
                    //어떤게 키가 될지 모를때 유용하다
const obj = makeObj("나이", 33);
console.log(obj);


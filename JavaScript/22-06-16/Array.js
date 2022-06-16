

let arr = [1,2,3,4,5];

let result = arr.find((item) =>{
    return item % 2 === 0;
});

console.log(result);


let userList = [
    {name : "Mike", age:30},
    {name : "Jane", age:27},
    {name : "Tom", age:10},
];
                //함수를 받아 특정 기능을 실행하고 새로운 배열을 반환
let newUserList = userList.map((user, index)=>{
            //객체복사 (참조값만 복사함) 
    return Object.assign({}, user, {
        id: index + 1,
        isAdult: user.age>19
    });
});

console.log(newUserList);



result = userList.find((user) => {
    if(user.age < 19){
        return true;
    }
    return false;
});

console.log(result);


//배열을 합쳐서 문자열 만들기 - Join, Split
arr = ["안녕", "나는", "철수야"];
result = arr.join(" "); //쉼표를 없애고 싶으면 공백넣기!
console.log(result);


//split
const users = "Mike,Jane,Tom,Tony";
result = users.split(",");
console.log(result);
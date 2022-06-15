/**
 * 심볼은 유일한 식별자다 
 전체의 코드중 딱 하나이다.

 
 * 
 * 
*/



// 다른 개발자가 만들어 놓은 객체
const user = {
    name: "Mike",
    age: 30,

};

//내가 작업 => 심볼을 사용하여 콘솔에 안보이게 할수 있다
//user.showName = function(){};
const showName = Symbol("show name");
user[showName] = function(){
    console.log(this.name);
};

user[showName]();


// 사용자가 접속하면 보는 메세지
for(let key in user){
    console.log(`His ${key} is ${user[key]}. ` );
}
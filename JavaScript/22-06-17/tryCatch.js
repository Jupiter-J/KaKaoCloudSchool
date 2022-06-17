

let json = "{bad json}";

try{
    let user = JSON.parse(json);
    alert(user.name);
}catch(e){
    console.log(e.message);
}finally{
    console.log("에러가 발생하지 않아도 여기는 반드시 거친다");
}
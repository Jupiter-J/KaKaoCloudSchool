


let numArry= [10,20,3,5,7,-1,9,12,-15,4,6];
let wordArray = ["School", "hospital", "assembly", "compile", "default"
                , "constructor", "desk", "object", "calss", "function",
                , "procedure", "alt", "bread", "milk"];

let stuArray = [
    {"class" : "1", "name":"A", kor:90, eng:90, mat:90},
    {"class" : "2", "name":"B", kor:80, eng:60, mat:90},
    {"class" : "1", "name":"C", kor:70, eng:90, mat:90},
    {"class" : "2", "name":"D", kor:100, eng:80, mat:90},
    {"class" : "1", "name":"E", kor:95, eng:90, mat:90},
    {"class" : "2", "name":"F", kor:75, eng:40, mat:90},
];

let result = numArry.find(x =>x%2 ==0); //첫번째 찾은 데이터 하나만 반환한다
console.log(result, typeof(result));

result = numArry.filter(x => x%2 ==0); //true를 만족하는 모든 데이터를 배열로 만들어서 반환한다 
console.log(result, typeof(result)); //반환한다 
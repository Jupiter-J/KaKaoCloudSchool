


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



//총점 평균 구하여 배열에 넣기 (키값 생성)
stuArray.forEach((s)=> {s.total = s.kor + s.eng + s.mat ; s.avg=s.total/3 });
console.log(stuArray);


console.log("///////MAP////////");

//MAP 사용
temp1 = numArry.map((objet, i) => {
    console.log(objet, i);
    return objet;
});
console.log(temp1);


console.log("///////2차원 배열////////");
//2차원 배열
let arr2D = [
    [1,2,3,4],
    [5,6,7,8],
    [9,10,11,12]
];

arr2D.forEach((arr, index)=> {
    console.log(arr, index);
});

arr2D.forEach((arr, index)=>{
    console.log("-------------")
    arr.forEach((item, index) => {
        console.log(item, index)
    });
});


console.log("------TEST------");
//첫번째 1차원 배열에 2를 곱하고, 두번재 1차원 배열은 3을 곱하고, 세번쩨는 4를 곱한다
//MAP사용 

let k=2;
let result = arr2D.map((arr, i)=> {
    let temp = arr.map((a)=>{
        return a*k; //요소를 하나씩 다 반환하고
    })
    k++;
    return temp; //배열을 반환하고 
});

console.log(result);


console.log("내림차순");
stuArray.sort((a,b)=> {
    if(a.total < b.total)
        return -1;
    else if(a.total == b.total)
        return 0;
    else
        return 1;

})
console.log(stuArray);
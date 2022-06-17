
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


//1. numArray 음수만 찾아내기
console.log(numArry.filter(num => num<0));

//2. wordArray에서 단어 길이가 6글자 이상인것만 추출하기
console.log(wordArray.filter(word=> word.length >= 6));

//3. class가 1인 학생들과 2인 학생들 분리하기 
console.log(stuArray.filter(stud => stud.class == "1"));
console.log(stuArray.filter(stud => stud.class == "2"));

//4. 총점 평균 구하여 배열에 넣기 (키값 생성)
stuArray.forEach((s)=> {s.total = s.kor + s.eng + s.mat ; s.avg=s.total/3 });
console.log(stuArray);

//해체하기
let {name, kor, eng, total} = stuArray[0];
console.log(name, kor, eng, total);


console.log("///////////////////");

numArry.filter(a=> a<0)
       .forEach((a)=> console.log(a));

              //fitler -> 추출용(T,F)   map 값 바꿀때 , forEach-> 출력용      
wordArray.filter(a => a.length >= 6)
         .map((a) => a.toUpperCase()) //요소에 연산을 수행해서 원본데이터는 냅두고 
         .forEach((a)=> {             //연산된 결과셋을 반환한다  
            console.log(a);
         });

let temp = numArry.map( x=>x*x);
console.log(temp);
console.log(numArry);


                    //내림차순 정렬 
numArry.sort((a,b)=> {return b -a; });
console.log(numArry);

console.log("오름차순");
//오름차순 객체 정렬
stuArray.sort((a,b) => a.total - b.total);
console.log(stuArray);

console.log("내림차순");
//내림차순 객체 정렬
stuArray.sort((a,b) => a.total - b.total);
console.log(stuArray);




//forEach
let arr = ["Mike", "Tom", "Jane"];

arr.forEach((name, index)=> {
    console.log(`${index +1}. ${name}`);
});


//find/ findIndex
arr = [1,2,3,4,5];
const result = arr.find((item)=>{
    return item % 2 === 0;
});
console.log(result);

//arr.sort : 배열 재정렬 배열 자체가 변경된다~!
arr = [1,5,4,2,3];
arr.sort();
console.log(arr);
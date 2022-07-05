
//잘만든 함수가 존재하는데 이 함수의 기능을 변경하는 방법
// 1. 원래 그 함수를 수정한다
// 2. 함수를 새로 만든다
// 3. 함수를 추상화 시켜서 인자로 받아들여서 사용
// 고차함수 Higher-Ordered Function

function repeat(n, z){
    for(var i=0; i<n; i++){
        //입력으로 들어온값을 추상화 시켜서 사용 
       z(i);
    }
}

//함수 표현식 
let logAll = function(j){
    console.log(j);
}

let logOdd = function(k){
    if(k%2){
        console.log(k);
    }
}

            //식별자로 주솟값을 넘겨서 실행시킨다 
repeat(6, logOdd);
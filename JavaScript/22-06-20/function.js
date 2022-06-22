


function add1(x,y){
    return x + y;
}

//함수의 이름을 변수명으로 
const add2 = (x,y) => {
    return x + y;
};

//중괄호 다음에 바로 리턴이 될 경우 중괄호 없앨수 있음 
const add3 = (x, y) => x + y;

                    //그러나 헷갈릴수 있어서 괄호로 대체 
const add4 = (x,y) => (x +y);


function not1(x){
    return !x;
}

function not2 = y => !y;
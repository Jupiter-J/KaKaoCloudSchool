


var obj = {
    myName: '홍길동'
}

// javaScript Property 추가 
    //1. 일반적인 key값은 (.)을 사용
    obj.myAge = 20;
    //2. 식별자 네이밍과 맞지 않을 경우 [] 을 사용 
    obj['!myPhone'] = '456-4568'
console.log(obj); //{ myName: '홍길동', myAge: 20, '!myPhone': '456-4568' }

//javaScript Property 삭제
delete obj.myAge;
console.log(obj); //{ myName: '홍길동', '!myPhone': '456-4568' }

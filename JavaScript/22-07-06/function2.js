

//함수 선언문으로 사용자 함수 만들기
//이름 식별자는 pascalCase - 대문자{관용적으로 생성자 함수는 대문자를 사용한다}
function Person(){
    //this
    // this라는 keyword는 생성자 함수 일 경우에도 있고
    // 일반 함수인 경우에도 있다
    // 생성자 함수에서의 this => 생성자 함수에 의해서 
    // 만들어질 instance를 가리키는 reference
    // 일반 함수에서의 this => window
    console.log(this);
}

Person(); 
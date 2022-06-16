
## JavaScript
자바스크립트에서 변수를 선언할 때 변하지 않는 값은 const, 변할 수 있는 값은 let으로 선언한다

* alert : 알려줌
* prompt : 입력받음 -> 문자열이다
* confirm : 확인받음 (확인과 취소버튼 둘다 있다)

### 형변환
* String() -> 문자열 변환
* Number() -> 숫자형 변환
    Number("문자열")일 경우 NaN을 반환
    Number(null)일 경우 0을 반환
* Boolean() -> 불린형으로 변환
    0, ", null, undefined, NaN일 경우 false
    * Boolean(0) //false
    * Boolean('0') //true
    * Boolean('') //false
    * Boolean(' ') //true

### 비교 연산자, 조건문
* == 동등 연산자: 숫자형, 문자형 같이 비교했을때 같은 값인지 확인
* === 일치 연산자: 타입까지 비교
### 논리 연산자 
* || (OR)
여러개 중 하나라도 true면 true
즉, 모든 값이 false 일 때만 false를 반환 
OR는 첫번째 true를 발견하는 즉시 평가를 멈춘다
ex) 스티브 잡스는 한국인 이거나 남자이다 -> true
* && (AND)
모든 값이 true면 true
즉, 하나라도 false 면 false를 반환
AND는 첫번째 false를 발견하는 즉시 평가를 멈춘다
ex) 스티브 잡스는 한국인 이고 남자이다 -> false
* ! (NOT)
true 면 false
false 면 true

### 함수
* 함수 선언문: 어디서든 호출이 가능하다
* 함수 표현식: 코드에 도달하면 생성

### 배열
* push(): 배열 끝에 추가
* pop(): 배열 끝 요소 제거
* shift: 배열 앞에 제거
* unshift: 배열 앞에 추가

### 변수
* var는 한번 선언된 변수를 다시 선언할 수 있다
* let은 재선언 불가 -> 상수와 같은 개념
* var는 선언하기 전에 사용할 수 있다

* 호이스팅 : 스코프 내부 어디서든 변수 선언은 최상위에 선언된 것 처럼 행동
* 이유는 ? TDZ - Temporal Dead Zone
    TDZ영역에 있는 함수는 호이스팅을 사용할 수 없다
* let, Const는 TDZ영향을 받는다

* 변수의 생성과정
1. 선언 단계
2. 초기화 단계
3. 할당 단계

* Var의 생성과정
1. 선언과 초기화가 동시에 된다
2. 할당 단계

* let의 생성과정
1. 선언 단계
2. 초기화 단계
3. 할당 단계

* const의 생성과정
1. 선언 + 초기화 + 할당 -> 동시에 해야함


### 스코프
var : 함수 스코프
let, const : 블록 스코프 (함수, if문, while문, try/catch문 등)

### 생성자 함수
생성자 함수의 함수명의 첫글자는 대문자로 
new 연산자를 사용하여 호출

### 객체 메서드
* computed property : 함수밖에서 변수를 선언했을때 함수안의 변수를 지칭할수 있게 []를 사용한다. , 계산식도 가능
* Object.assign() : 객체 복제
    동일하게 복제하기 위해서는
    * const newUser = Object.assign({}, user);
         {}: 빈객체는 초기값이다, USER가 {}안으로 복제되어 들어옴  
* Object.entries() : 키/값 배열 반환
* Object.fromEntries() : 키/값 배열을 객체로

### Symbol : 유일성 보장
전체의 코드중에 딱 하나이다 
* property key : 심볼형일경우 건너 뛴다
원본데이터는 건들이지 않고 보고싶을때 
* Symbol.for() : 전역심볼
하나의 심볼만 보장받을 수 있다
없으면 만들고 있으면 가져오기 때문
Symbol 함수는 매번 다른 Symbol 값을 생성하지만, 
Symbol.for 메소드는 하나를 생성한 뒤 키를 통해 같은 Symbol을 공유한다


### 백틱 `` (작은따옴표 아님! 주의)
`${1+6}` 연산이 가능, 쿼리사용시 유용



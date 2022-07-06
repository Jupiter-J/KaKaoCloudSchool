


//생성자함수
function Circle(radius){
    this.radius = radius;

    Circle.prototype.getDiameter = function(){
        return 2 * this.radius;
    }

    //모든 인스턴스가 공유하는 변수 만들기
    //공용변수
    Circle.prototype.name = '홍길동'
}

const circle1 = new Circle(5); // new 함수가 여러개 만들어진다 
const circle2 = new Circle(10);


//공유가 되는지확인
console.log(circle1.name, circle2.name); 

//circle1의 이름을 바꾸면 2도 바뀔까? -> 바뀌지 않는다. 
                            //원하는 객체가 없으면 상위로 올라가서 수정하지 않고 추가된다
circle1.name = '아이유';

// circle1.__proto__.name = '아이유';
// Circle.prototype.name = 'ㅏㅏㅏ';
console.log(circle1.name, circle2.name);


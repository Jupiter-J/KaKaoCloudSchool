

//생성자함수
function Circle(radius){
    this.radius = radius;

    Circle.prototype.getDiameter = function(){
        return 2 * this.radius;
    }

}
const circle1 = new Circle(5); // new 함수가 여러개 만들어진다 
const circle2 = new Circle(10);

            //같은 값 인지 확인 , 메모리 주소 값이 같은지 확인 
console.log(circle1.getDiameter === circle2.getDiameter); //false - 인스턴스가 생성될때마다 함수도 따로 생성됨
                                              //함수하나가 만들어지면 그와 관련된 값들도 추가생성됨 -> 메모리 낭비


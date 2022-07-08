



class Animal{
    constructor(age, weigh, kk){
        //인스턴스의 property ,  매개변수
        this.age = age;
        this.weight = weight;
    }
    eat(){
        return '밥을 먹어요!';
    }
    move(){
        return '움직여요';
    }
}

class Bird extends Animal{
    constructor(){
        //상위 클래스의 constructor 호출
        super(args)
    
    
    fly()
        return 'skfkddy~';
    }
}

const bird = new Bird(10.30,100)
console.log(bird instanceof Bird);
console.log(bird);
console.log(bird instanceof Animal);
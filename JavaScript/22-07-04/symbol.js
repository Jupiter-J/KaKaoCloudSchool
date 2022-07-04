

//인자 없이 심볼 값 만들기
const mySymbol = Symbol();
        
console.log(typeof mySymbol); //symbol
console.log(mySymbol); //Symbol()값이 노출되지 않는다

//인자주고 심볼값 만들기 
const mySymbol1 = Symbol('소리없는 아우성1');
const mySymbol2 = Symbol('소리없는 아우성2');

console.log(mySymbol1 == mySymbol2); //false
console.log(mySymbol1.description); //symbol값과는 연관성이 없는 꼬리표 

//symbole이 인자로 들어올수도 있다 , 대신 다른값으로 캐스팅이 안된다
if(mySymbol1){
    console.log('있어요!');
}
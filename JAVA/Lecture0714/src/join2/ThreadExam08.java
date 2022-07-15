package join2;

//편하게 만들기 위해
class ThreadEx08_1 extends Thread{
    //static: 인스턴스 안만들어도됨 -> final: 재할당안됨
    //메모리의 총량은 1000이다
    final static int MAX_MEMORY = 1000; //상수는 전부 대문자화 + SnakeCase 사용
    //실제로 사용하는 메모리(변수)
    int usedMemory = 0;

    @Override
    public void run() {
        //무한루프
        while(true){
            //sleep을 사용하려면 try-catch가 강제됨
            try {
                //thread 클래스가 가지는 static 메소드
                Thread.sleep(10000); //10초동안 자라
            }catch (Exception e){
                System.out.println("interrupt()에 의해서 깨어남");
            }
            gc();
            System.out.println("메모리 청소 완료! 현재 사용가능한 메모리 량은 : "
                    + freeMemory());
        }
    }
    //내부에서만 사용하는 메소드임으로 원래 private가 맞다
    //garbge collector을 사용 10초마다 청소해준다
    public void gc(){
        usedMemory -= 300;
        if (usedMemory < 0){
            //사용중인 메모리양을 마이너스가 되지 않도록 조치
            usedMemory = 0;
        }
    }

    //프로그램에서 사용하는 전체 메모리량을 리턴
    public int totalMemory(){
        return MAX_MEMORY;
    }

    //남은 용량 (사용가능한 메모리량)을 리턴
    public int freeMemory(){
        return MAX_MEMORY - usedMemory;
    }

}
public class ThreadExam08 {
    public static void main(String[] args) {
        ThreadEx08_1 t = new ThreadEx08_1();
        t.setDaemon(true);
        t.start();

       int requiredMemory = 0;
       for(int i=0; i<20; i++){
           requiredMemory = (int)(Math.random() * 10)*20;
                            //0보다 크고 200보다 작은 정수

           //필요한 memory가 사용할 수 있는 양보다 크거나
           //현재 전체 메모리양의 60% 이상을 사용하고 있을때 gc를 실행
           //if - 지금 내가 필요한 메모리가 가용메모리보다 큰 경우
           if ((requiredMemory > t.freeMemory()) ||
                   (t.freeMemory() < t.totalMemory() * 0.4)){
               t.interrupt(); /**gc()실행이 끝날때까지 기다리지 않는다*/
               //join을 건다 - gc가 main보다 먼저 수행되도록 하기 위해서
               try{
                   t.join(100);
               }catch (Exception e){

               }
           }
           //현재 사용하는 메모리에 위쪽에서 사용하려는 메모리양을 추가
           t.usedMemory += requiredMemory;
           System.out.println("현재 사용된 메모리 량: " + t.usedMemory);

           //전체 메모리량은 1000인데 main이 random 하게 계속 사용함
           //if에서 가비지가 청소를 한다 (이미 60%사용하거나 사용하려는 메모리량보다 가용메모리가 적을때)
       }
    }

}

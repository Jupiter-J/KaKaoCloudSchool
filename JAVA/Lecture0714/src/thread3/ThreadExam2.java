package thread3;

public class ThreadExam2 implements Runnable
{
    static boolean autoSave = false;
    public static void main(String[] args) {

        Thread t = new Thread(new ThreadExam2());
        t.setDaemon(true);
        t.start();

        for (int i = 0; i < 10; i++) {

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(i);
        if(i==5) {
            autoSave = true;
            }
        }
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(3000);
            }catch (  InterruptedException e){
            }
            if (autoSave){
                System.out.println("자동저장되었어요!");
            }
        }
    }
}

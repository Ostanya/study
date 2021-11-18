package threads;

public class WalkThread extends Thread{
    public void run() {
        try{
            for (int i = 0; i < 7; i++) {
                System.out.println("walk" + i);
                try{
                    Thread.sleep(1);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }finally {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

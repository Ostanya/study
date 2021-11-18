package threads;

public class MyThread extends Thread{
    public MyThread(String name) {
        this.setName(name);
    }
    public void run() {
        try{
            sleep(100);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }play();
    }
    private void play() {
        System.out.println(getName());
        System.out.println(getName());
    }

    public static void main(String[] args) {
        Thread tableThread = new Thread("Table");
        Thread tennisThread = new Thread("Tennis");
        tableThread.start();
        tennisThread.start();
    }
}

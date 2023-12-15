package Classes;

public class MyThread extends Thread{

    //inheritance

    @Override
    public void run() {

        for (int i = 10; i > 0 ; i--) {
            System.out.println("Thread # 1:" + i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("This Thread #1 is finished");
    }
}

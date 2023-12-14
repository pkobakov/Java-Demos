package Classes;

public class MyRunnable implements  Runnable{

    //inheritance

    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Thread # 2: " + i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Thread # 2 is finished.");
    }
}

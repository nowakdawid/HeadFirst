package _536;

public class RunThreads implements Runnable {

    public static void main(String[] args) {

        Runnable runnable = new RunThreads();
        Thread alpha = new Thread(runnable);
        Thread beta = new Thread(runnable);
        alpha.setName("Alpha thread");
        beta.setName("Beta thread");
        alpha.start();
        beta.start();

    }

    @Override
    public void run() {

        for(int i = 0; i < 5; i++) {

            System.out.println(Thread.currentThread().getName() + " is running");

        }

    }

}

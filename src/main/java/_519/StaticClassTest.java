package _519;

public class StaticClassTest implements Runnable {

    @Override
    public void run() {
        System.out.println("Started a new thread...");
    }

    public static void main(String[] args) {

        StaticClass staticClass = new StaticClass();
        staticClass.go();
        staticClass.setX(staticClass.getX() - 1);
        staticClass.go();

        StaticClass staticClass1 = new StaticClass();

        staticClass1.go();
        staticClass1.setX(staticClass1.getX() - 1);
        staticClass1.go();

        Runnable runnable = new StaticClassTest();
        Thread myThread = new Thread(runnable);
        myThread.start();

    }

}

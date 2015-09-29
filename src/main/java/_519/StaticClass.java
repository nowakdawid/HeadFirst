package _519;

public class StaticClass {

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        StaticClass.x = x;
    }

    private static int x = 5;

    public static void go() {

        System.out.println("The value of x: " + getX());

    }

}

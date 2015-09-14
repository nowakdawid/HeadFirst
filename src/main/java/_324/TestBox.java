package _324;

public class TestBox {
    Integer i;
    int j;

    public static void main (String[] args) {
        TestBox t = new TestBox();
        //t.go();

        String s = String.format("I have %.2f, bugs to fix.", 476578.09876);
        System.out.println(s);

    }

    public void go() {
        j=i;
        System.out.println(j);
        System.out.println(i);
    }
}

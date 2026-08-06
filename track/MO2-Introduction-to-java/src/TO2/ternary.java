
public class ternary {

    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 30;
        String res = (a > b && a > c) ? " a is greter" : (b > a && b > c) ? "b is greter" : "c is greter";

        System.out.println(res);

    }
}

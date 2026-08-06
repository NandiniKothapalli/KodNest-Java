
public class assign {

    public static void main(String arg[]) {
        int a = 3;
        int res = a++ + ++a + ++a + a++;
        System.out.println(res);
        System.out.println(a);
    }
}

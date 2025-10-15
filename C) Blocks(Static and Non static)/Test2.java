public class Test2 {
    static int a=10;
    {
        a=40;
    }
    public static void main(String[] args) {
        System.out.println(a);
        Test2 d=new Test2();
        System.out.println(a);
    }
}

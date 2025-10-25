public class Test5 {
    final int i=10;
    public static void main(String[] args) {
        Test5 T=new Test5();
        System.out.println(T.i);
    }
}

/*
public class Test5 {
    final int i;
    {
    i=10;//(NON-STATIC BLOCK)
    }
    public static void main(String[] args) {
        Test5 T=new Test5();
        System.out.println(T.i);
    }
}
 */
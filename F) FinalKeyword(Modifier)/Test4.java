public class Test4 {
    final static int i=10;
    public static void main(String[] args) {
        System.out.println(Test4.i);
    }
}
//Static final var should be initialized while declaring or should have to create a static block and have to initialize it

/* 
public class Test4 {
    final static int i;
    static {
    i=10;     //Static block
    }
    public static void main(String[] args) {
        System.out.println(i);
    }
}
 */
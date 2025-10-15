class A{
    static{
        System.out.println("SB in A");
    }
    {
        System.out.println("NSB in A");
    }
    A(){
        System.out.println("DC in A");
    }
    static void m1(){
        System.out.println("m1 in A");
    }
}
public class Prac1 {
    static{
        System.out.println("SB in Test1");
    }
    public static void main(String[] args) {
        System.out.println("Main starts");
        A.m1();
        new A();
        new A();
        new A();
        System.out.println("main ends");

    }
}

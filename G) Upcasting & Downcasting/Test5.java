//Super class
class A{
    String PM="Narendra Modi";
}
//Sub-class
public class Test5 extends A {
    String CM="Siddu";
    public static void main(String[] args) {
        //UPCASTING
        A a=new Test5();
        System.out.println(a.PM);
        //DOWNCASTING
        Test5 T=(Test5) a;
        System.out.println(T.PM);
        System.out.println(T.CM);
    }
}

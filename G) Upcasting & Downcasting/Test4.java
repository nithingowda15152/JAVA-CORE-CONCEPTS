class A {
    int x=10;
}
public class Test4 extends A {
    int y=20;
    public static void main(String[] args) {
        //Upcasting(only can acces super class prorperty)
        A a=new Test4();
        System.out.println(a.x);
        //Normal inheritence
        Test4 t=new Test4();
        System.out.println(t.x);
        System.out.println(t.y);
        //Downcasting
        Test4 T=(Test4) a;
        System.out.println(T.x);
        System.out.println(T.y);
        }
}

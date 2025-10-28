class A{
    int x=20;
}
class B extends A{
    int y=10;
}
public class Test1 {
    public static void main(String[] args) {
        A a=new B();
        System.out.println(a.x);
        //System.out.println(a.x);->compile time error
    }
}
//while upcasting we can access only super-class property,not subclass property
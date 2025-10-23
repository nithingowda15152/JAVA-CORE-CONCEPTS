class A{
    int n=20;
}
class B extends A{
    int y=100;
}
public class Test4 extends B {
    int x=10;
    public static void main(String[] args) {
        Test4 T=new Test4();
        System.out.println(T.n);
        System.out.println(T.y);
        System.out.println(T.x);
        }
}


//MULTI-LEVEL-INHERITENCE
class A{
    static void add(){
        System.out.println(10+10);
    }
}
public class Test3 extends A {
    static void add(){
        System.out.println(10+30);
    }
    public static void main(String[] args) {
        Test3 T=new Test3();
        T.add();
        A a=new Test3();
        a.add();
    }
}
//add is a static method,so choose ref(Early binding).

class A{
    void add(){
        System.out.println(10+10);
    }
}
public class Test6 extends A {
    void add(){
        System.out.println(10+30);
    }
    public static void main(String[] args) {
        Test6 T=new Test6();
        T.add();
        A a=new Test6();
        a.add();
    }
}
//add is a non-static method,so choose obj(late binding).
class A{
    void m1(){
        System.out.println("m1 in A");
    }
}
class B extends A{
    void m2(){
        System.out.println("m2 in B");
    }
}
class C extends B{
    void m3(){
        System.out.println("m3 in C");
    }
}
public class Test2 {  
    public static void main(String[] args) {
        C c=new C();
        c.m1();
        c.m2();
        c.m3();

        B b=c;
        b.m1();
        b.m2();
        //b.m3();  Cannot acces subclass property
    }
}
//main method is created in extra class Test2
//When upcasted -cannot access the subclass property,only super class property
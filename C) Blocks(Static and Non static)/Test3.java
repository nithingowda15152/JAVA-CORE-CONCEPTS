class A{
    {
        System.out.println("NSB");
    }
    A(){
        System.out.println("Default cons");
    }
    A(int i){
        System.out.println("Int arg cons");
    }
}
public class Test3 {
    public static void main(String[] args) {
        new A();
        System.out.println("-----");
        new A(10);
        }
}

class A{
    A(){
        System.out.println("Default-Constructors");
    }
    A(int i){
        this();
        System.out.println("Parameterized-Constructors");
    }
}
public class TestB {
    public static void main(String[] args) {
        A a1=new A(10);
    }
}

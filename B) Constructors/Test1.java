class B{
    B(){
        System.out.println("constructor");
    }
}
public class Test1 {
    public static void main(String[] args) {
        new B();
        System.out.println("--------");
        new B();
    }
} 

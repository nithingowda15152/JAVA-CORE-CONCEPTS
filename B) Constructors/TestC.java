class A{
    int i;
    int j;
    A(){
        i=10;
    }
    A(int arg){
        this();
        j=arg;
    }
}
public class TestC{
    public static void main(String[] args) {
        A a1=new A(20);
        System.out.println(a1.i);
        System.out.println(a1.j);
    }
}
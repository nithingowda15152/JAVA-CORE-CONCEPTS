class A{
          //DEFAULT CONSTRUCTOR WILL BE CREATED FROM JAVA COMPLILER(when object is created)
}
class B{
    B(int i){
        System.out.println(i);//PARAMETERIZED CONSTRUCTOR(Runs when object is created)
    }
}
public class Test3 {
    public static void main(String[] args) {
        new A();
        new B(10);
        //new B();-->compile time error

    }
}

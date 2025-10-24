class w1{
    void call(){
        System.out.println("Audio-call");
    }
    void message(){
        System.out.println("text-message");
    }


}
public class Test1 {
    void call(){
        System.out.println("Audio+vedio call");
    }
    void message(){
        System.out.println("text-message+img msg");
    }
    public static void main(String[] args) {
        Test1 T=new Test1();
        T.call();
        T.message();
    }
}
//This is the basic example for method overriding
//inheriting non static method from super class to sub class with same declaration,but differeece in implementation is called MO
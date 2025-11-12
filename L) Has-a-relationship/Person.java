class heart{
    void pump(){
        System.out.println("heart started pumping");
    }
}
public class Person {
    heart h;
    Person(){
        h=new heart();
    }
    void startbreath(){
        h.pump();
        System.out.println("started breathing");
    }
    public static void main(String[] args) {
        Person p=new Person();
        p.startbreath();
    }
}

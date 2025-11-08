interface A{
    void socialmedia();
}
class B implements A{
    public void socialmedia(){
        System.out.println("Instagram");
    }
}
class C implements A{
    public void socialmedia(){
        System.out.println("whatsapp");
    }
}
class mobile{
    void entertainment(A a){
        System.out.println("MObile is being used");
        a.socialmedia();
    }
}
public class Test6 {
    public static void main(String[] args) {
    mobile m=new mobile();
    m.entertainment(new B());
    m.entertainment(new C());
    }
}
//Mobile has a method entertainment() that takes an object of type A (so it can accept both B and C).
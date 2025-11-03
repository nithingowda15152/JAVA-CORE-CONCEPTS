class car{

}
class benz extends car{

}
class audi extends car{

}
class Driver{
    void drive(car c){
        System.out.println("driver logic executed");
    }
}
public class Test3 {
    public static void main(String[] args) {
        benz b1=new benz();
        audi a1=new audi();
        Driver d1=new Driver();
        d1.drive(b1);
        d1.drive(a1);
    }
}
/*
Its a another ex for upcasting
useful to achieve polymorphism
 */
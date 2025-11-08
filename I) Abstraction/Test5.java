abstract class Car{
    abstract void speed();
}
class BMW extends Car{
    @Override
    void speed(){
        System.out.println("Top speed is 250km/hr");
    }
}
class Audi extends Car{
    @Override
    void speed(){
        System.out.println("Top speed is 200km/hr");
    }
}
class Driver{
    void drive(Car c){
        c.speed();
    }
}
public class Test5 {
    public static void main(String[] args) {
        Driver d=new Driver();
        d.drive(new BMW());
        d.drive(new Audi());
    }
}

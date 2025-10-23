class Vehicle{
    void start(){
    System.out.println("Vehicle starts");
    }
    void stop(){
    System.out.println("Vehicle stops");
    }

}
class Bike extends Vehicle{
    int cc=350;
    int cost=100000;
    public static void main(String[] args) {
        Bike b=new Bike();
        b.start();
        System.out.println(b.cc);
        System.out.println(b.cost);
        b.stop();

    }
}
public class car extends Vehicle{
    int cc=2000;
    int cost=154321534;
    public static void main(String[] args) {
        car c=new car();
        c.start();
        System.out.println(c.cc);
        System.out.println(c.cost);
        c.stop();   
    }
}

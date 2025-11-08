//example of abstraction + runtime polymorphism
abstract class Animal{
    abstract void makesound();
}
class cat extends Animal{
    @Override
    void makesound(){
        System.out.println("MEOW MEOW");
    }
}
class dog extends Animal{
    @Override
    void makesound(){
        System.out.println("BOW BOW");
    }
}
class hospital{
    void vaccination(Animal a){
        System.out.println("Vaccination is given");
        a.makesound();
    }
}
public class Test4 {
    public static void main(String[] args) {
        hospital h=new hospital();
        h.vaccination(new cat());
        h.vaccination(new dog());
    }
}

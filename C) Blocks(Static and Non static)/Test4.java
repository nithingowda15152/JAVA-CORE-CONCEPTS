class Car{
    int regNum;
    String colour;
    static int num=1000;

    {
        regNum=num;
        num++;
    }
    Car(){
        colour="white";
    }
    Car(String C){
        colour=C;
    }
    void display(){
        System.out.println("REGISTRATION NUM="+regNum);
        System.out.println("colour="+colour);
        System.out.println("------------");
    }
}
public class Test4 {
    public static void main(String[] args) {
        Car c=new Car();
        c.display();

        Car c1=new Car("BLACK");
        c1.display();
    }
}

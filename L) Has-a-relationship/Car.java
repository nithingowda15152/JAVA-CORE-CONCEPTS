class engine{
    void start(){
        System.out.println("Engine has started");
    }
}
class Car{
    engine e;
    Car(){
        e=new engine();
    }
    void startcar(){
        e.start();
        System.out.println("car also started");
    }
    public static void main(String[] args) {
        Car c=new Car();
        c.startcar();
    }
}
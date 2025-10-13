class D{
    D(){
        System.out.println("No-arg constructors");
    }
    D(int i){
        System.out.println(i);
    }
}
class Test6 {
    public static void main(String[] args) {
        new D();
        new D(10);
    }
}
//Constructors with diff parameters are known as constructor overloading
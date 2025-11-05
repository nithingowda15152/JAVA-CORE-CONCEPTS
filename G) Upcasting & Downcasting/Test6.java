class Zomato{
    int id=1234;
    int pass=0000;
    void login(){
        if(id==1234 && pass==0000){
            System.out.println("login succesfully");
        }else{
            System.out.println("failed");
        }
    }
}
//Sub class 1
class Veg extends Zomato{
    String food="Gobi";
    void display(){
        System.out.println("food ordered is gobi");
    }
    public static void main(String[] args) {
        Zomato z=new Veg();
        System.out.println(z.id);
        System.out.println(z.pass);
        z.login();
        Veg v=(Veg)z;
        System.out.println(v.food);
        v.display();
    }

}
//Sub class 2
public class Test6 extends Zomato{
    String food="Biriyani";
    void display(){
        System.out.println("food ordered is biriyani");
    }
    public static void main(String[] args) {
        Zomato z=new Test6();
        System.out.println(z.id);
        System.out.println(z.pass);
        z.login();
        Test6 t=(Test6)z;
        System.out.println(t.food);
        t.display();
        }
    
}

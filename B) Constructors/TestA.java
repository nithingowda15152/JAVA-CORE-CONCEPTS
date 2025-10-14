class Rectangle{
    int length;
    int breadth;

    Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    Rectangle(Rectangle r){
        length=r.length;
        breadth=r.breadth;
    }
    void display(){
        System.out.println("length="+length+"breadth="+breadth);
    }
}
public class TestA {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(10,20);
        r1.display();
        Rectangle r2=new Rectangle(r1);
        r2.display();
    }
}
//Creating new constructors same as existing constructors with same exact parameter,then we have to pass the current object(which contain values)as reference to the new object

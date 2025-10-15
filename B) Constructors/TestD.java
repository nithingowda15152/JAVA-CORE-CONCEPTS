class box{
    int length;
    int width;
    int breadth;

    box(int l,int w,int b){
        length=l;
        width=w;
        breadth=b;
    }

    box(int d){
        this(d,d,d);
    }
    void display(){
        System.out.println("[lenght="+length+",width="+width+",breadth="+breadth+"]");
    }
}
public class TestD {
    public static void main(String[] args) {
        box b1=new box(10);
        b1.display();
    }
}

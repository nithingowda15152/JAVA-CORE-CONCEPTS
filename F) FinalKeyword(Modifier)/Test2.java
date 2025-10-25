class circle{
    int radius=10;
}
public class Test2 {
    public static void main(String[] args) {
        final circle c1=new circle();
        System.out.println(c1.radius);
        c1.radius=20;
        System.out.println(c1.radius);
        // c1=new circle();
        // c1=new();
    }
}

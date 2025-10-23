class college{
    String cname="RIT";
}
class Dept extends college{
    String Dname="CSE";
}
public class Test5 extends Dept {
    public static void main(String[] args) {
        Test5 T=new Test5();
        System.out.println(T.cname);
        System.out.println(T.Dname);
    }
}
//Example of Multi-level-inheritence
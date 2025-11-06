class A{
    int y=10;
}
class Test2 extends A{
    int y=20;
    public static void main(String[] args) {
        Test1 T=new Test1();
        System.out.println(T.y);
        A a=new Test1();
        System.out.println(a.y);
    }
}
//y is a non-static var,so choose ref(Early binding).
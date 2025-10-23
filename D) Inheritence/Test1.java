class A{
    int x=10;
}
class Test1 extends A{
    int y=20;
    public static void main(String[] args) {
        Test1 T=new Test1();
        System.out.println(T.y);
        System.out.println(T.x);
    }
}


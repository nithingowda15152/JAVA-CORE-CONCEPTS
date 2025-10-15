class Demo{
    static int a;
    int b;
    static{
        System.out.println("SB1");
        Demo d=new Demo();
    }
    static{
        System.out.println("SB2");
        a=30;
        System.out.println(a);
        Demo d1=new Demo();
    }
    {
        System.out.println("NSB1");
        b=25;
        a=30;
    }

    public static void main(String[] args) {
        System.out.println("main starts");
        Demo d=new Demo();
        System.out.println(d.b);
        System.out.println(Demo.a);
        Demo d1=new Demo();
        System.out.println(d1.b);
    }
    {
        System.out.println("NSB2");
        System.out.println(a);
        b=140;
        }
    
}

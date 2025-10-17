public class StaticVarCalling{
    static int i=10;
    public static void main(String []args){
        System.out.println(i);
        StaticVarCalling.m1();
        int i=30;
        System.out.println(i);
        System.out.println(StaticVarCalling.i);
    }
    public static void m1(){
            int i=20;
            System.out.println(i);
        }
    } 

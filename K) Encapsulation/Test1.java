class student{
    private int id=01;
    private String name="nithin";
    private int age=22;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

}
public class Test1 extends student {
    public static void main(String[] args) {
        Test1 T=new Test1();
        System.out.println(T.getId());
        System.out.println(T.getName());
        System.out.println(T.getAge());

        T.setName("gagan");
        T.setId(02);
        T.setAge(22);

        System.out.println(T.getId());
        System.out.println(T.getName());
        System.out.println(T.getAge());

    }
}

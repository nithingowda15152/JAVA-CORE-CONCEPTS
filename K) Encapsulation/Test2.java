class doctor{
    private String name="nithin";
    private int salary=100;
    private int age=22;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

}
public class Test2 extends doctor {
    public static void main(String[] args) {
        Test2 T=new Test2();
        System.out.println(T.getName());
        System.out.println(T.getSalary());
        System.out.println(T.getAge());

        T.setName("bhuvan");
        T.setSalary(200);
        T.setAge(30);

        System.out.println(T.getName());
        System.out.println(T.getSalary());
        System.out.println(T.getAge());

    }
}

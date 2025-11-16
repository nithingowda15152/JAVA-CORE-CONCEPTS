//This is the example for aggression
class Employee{
    String name;
    Employee(String name){
        this.name=name;
    }
}
public class Company {
    
        String cname;
        Employee e;
        Company(String name,Employee e){
            this.cname=cname;
            this.e=e;
        }
          public static void main(String[] args) {  
            Employee e=new Employee("Raju");
            Company c=new Company("TCS",e);
            c.display();
        }
        void display(){
            System.out.println("The employee is"+ e.name +"working in"+c.cname);
        }
    }
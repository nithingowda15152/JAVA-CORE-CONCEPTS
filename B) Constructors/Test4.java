class student{
    String name;
    int phoneNum;
    static int count;
    student(String n,int p){
        name=n;
        phoneNum=p;
        count++;
    }
    void display(){
        System.out.println("name="+name);
        System.out.println("Phonenum="+phoneNum);
        System.out.println("-------");

    }
}
public class Test4 {
    public static void main(String[] args) {
        student s1=new student("nithin",63630);
        student s2=new student("nikki",7897);
        s1.display();
        s2.display();
        System.out.println("count of the student="+student.count);
        
    }
}
//Real-world of example of where constructors are used
/*
Here students name and phonenum are non static variable which are initialized through the constructors in the time of object creation
count is the static variable-initially 0,with the help of count++ it increments and called with the hep of class name
n is the arguments passed in the time of object creation,which will transfer to name-same for phonenum

 */

//Example for Compile time polymorphism
class Student {
    String name;
    int age;

    Student(String n) {
        name = n;
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student("Amit");
        Student s2 = new Student("Riya", 20);
        s1.display();
        s2.display();
    }
}

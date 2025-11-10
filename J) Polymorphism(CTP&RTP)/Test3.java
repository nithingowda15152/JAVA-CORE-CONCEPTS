//Example for Runtime polymorphism
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Test3 {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        a.sound();            // Calls Dog's sound() at runtime
    }
}

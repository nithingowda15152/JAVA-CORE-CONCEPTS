// Parent class
class Animal {
    int legs = 4;

    void makeSound() {
        System.out.println("Animal is making sound");
    }
}

// Child class 1
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow Meow");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        System.out.println("Cat:");
        c.makeSound();
        System.out.println("Legs: " + c.legs);
    }
}

// Child class 2
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark Bark");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println("Dog:");
        d.makeSound();
        System.out.println("Legs: " + d.legs);
    }
}

// Child class 3
class Lion extends Animal {
    @Override
    void makeSound() {
        System.out.println("Roar Roar");
    }

    public static void main(String[] args) {
        Lion l = new Lion();
        System.out.println("Lion:");
        l.makeSound();
        System.out.println("Legs: " + l.legs);
    }
}
//here Parent class and child class have same property(leg)so method overriding is used
//same method name ,but diff implementation
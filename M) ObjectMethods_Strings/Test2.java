class Circle{
    int radius;
    public Circle(int r){
        radius=r;
    }
    @Override
    public boolean equals(Object arg) {
        if(!(arg instanceof Circle))return false;
        return radius==((Circle)arg).radius;
    }
    
}
public class Test2 {
    public static void main(String[] args) {
        Circle c1=new Circle(50);
        Circle c2=new Circle(50);
        System.out.println(c1.equals(c2));
    }
}
/*
Overriding the equals() method

You override equals() from class Object.
Default equals() checks reference equality (same object).
By overriding, you define logical equality (same radius).

Using instanceof for type checking
Ensures that the passed object is also a Circle.

Comparing object states instead of references
c1 and c2 are different objects, but logically equal.
*/
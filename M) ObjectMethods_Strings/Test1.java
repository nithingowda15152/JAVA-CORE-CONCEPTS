class Circle{
    int radius;
    public Circle(int r){
        radius=r;
    }
    @Override
    public String toString() {
        return "Circle with radius = " + radius;
}
public class Test1{
    public static void main(String[] args) {
        Circle c=new Circle(20);
        System.out.println(c);
    }
}
}
/*
tostring()
*This example is showing non-primitive (reference) data type behavior in Java.
*does not print the radius,Instead, Java prints the default string representation of the object.
*The format is: ClassName@HexadecimalHashCode
*Because we did not override the toString() method in our Circle class.
*Add a toString() method(overriden) inside Circle,Now it shows the desired output(details).
 */
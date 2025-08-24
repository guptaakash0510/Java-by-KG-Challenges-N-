package in.kgcoding.challenge_83;

public class TestShapes {
    public static void main(String[] args) {
       // Shape shape = new Shape();  // we can't create shape class object bcz it is an abstract class.
        Circle circle = new Circle(5);
        Square square = new Square(10.3);

        System.out.printf("Area of Circle is %5.2f \n",circle.calculateArea());
        System.out.printf("Area of Square is %5.2f \n",square.calculateArea());
    }
}

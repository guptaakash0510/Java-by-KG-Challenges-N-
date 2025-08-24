package in.kgcoding.challenge_77.utils;

// import in.kgcoding.challenge_77.geomatry.*;

import in.kgcoding.challenge_77.geomatry.Circle;
import in.kgcoding.challenge_77.geomatry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10, 5);

        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        double rectArea = rect.breadth * rect.length;

        System.out.printf("Area of the circle is: %f, Area of the rectangle is %f",
                cirArea, rectArea);
    }
}

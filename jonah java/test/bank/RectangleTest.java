package bank;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void testRectangle() {
        Rectangle rectangle = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        print("Rectangle");
        print("The width is: " + rectangle.getWidth());
        print("The height is: " + rectangle.getHeight());
        print("The area is: " + rectangle.getArea());
        print("The perimeter is: " + rectangle.getPerimeter());

        print("");

        print("Rectangle2");
        print("The width is: " + rectangle2.getWidth());
        print("The height is: " + rectangle2.getHeight());
        print("The area is: " + rectangle2.getArea());
        print("The perimeter is: " + rectangle2.getPerimeter());
    }

    private static void print(String message) {
        System.out.println(message);
    }


}

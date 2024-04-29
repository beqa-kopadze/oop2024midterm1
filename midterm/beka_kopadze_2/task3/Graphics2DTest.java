package midterm.beka_kopadze_2.task3;

public class Graphics2DTest {
    public static void main(String[] args) {
        testCircle();
        testRectangle();
    }

    private static void testCircle() {
        System.out.println("Testing Circle class");

        Circle circle1 = new Circle(10, 20, 5);
        circle1.draw();
        System.out.println("Circle 1 area: " + circle1.getArea());
        System.out.println("Circle 1 perimeter: " + circle1.getPerimeter());

        System.out.println();
    }

    private static void testRectangle() {
        System.out.println("Testing Rectangle class");

        Rectangle rectangle1 = new Rectangle(30, 40, 10, 15);
        rectangle1.draw();
        System.out.println("Rectangle 1 area: " + rectangle1.getArea());
        System.out.println("Rectangle 1 perimeter: " + rectangle1.getPerimeter());

        System.out.println();
    }
}
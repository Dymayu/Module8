package HW2;

public class ShapeTest {

    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.setName("circle");
        ShapePrinter.print(circle);
        System.out.println(circle.toString());
    }

}

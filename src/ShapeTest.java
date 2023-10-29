public class ShapeTest {
    public static void main(String[] args) {

        Shape circle = new Circle("circle");
        Shape quad = new Quad("quad");
        Shape square = new Square("square");
        Shape triangle = new Triangle("triangle");
        Shape trapeze = new Trapeze("trapeze");


        System.out.println(circle.getName());

        System.out.println(quad.getName());
        System.out.println(square.getName());
        System.out.println(triangle.getName());
        System.out.println(trapeze.getName());
        System.out.println("----------");
        ShapePrinter.print(circle);


    }
}

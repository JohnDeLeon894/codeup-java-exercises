package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;
        Measurable maShape;
        myShape = new Square(5);
        maShape = new Rectangle(16, 9);
        System.out.println( myShape.getArea());
        System.out.println( myShape.getPerimeter());

        System.out.println( maShape.getArea());
        System.out.println( maShape.getPerimeter());
        System.out.println( maShape.getClass());
    }
}

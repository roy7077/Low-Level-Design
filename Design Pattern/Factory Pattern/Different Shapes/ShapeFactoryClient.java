import Factory.ShapeFactory;
import Shapes.Shape;

public class ShapeFactoryClient {
    public static void main(String[] args) {
        ShapeFactory fact = new ShapeFactory();

        Shape sh1 = fact.returnShape("Circle");
        Shape sh2 = fact.returnShape("Rectangle");
        Shape sh3 = fact.returnShape("Square");

        sh1.draw();
        sh2.draw();
        sh3.draw();
    }
}
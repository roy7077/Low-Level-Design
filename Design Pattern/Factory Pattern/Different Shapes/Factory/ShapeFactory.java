package Factory;

import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Shape;
import Shapes.Square;

public class ShapeFactory {
    public Shape returnShape(String input){
        switch (input) {
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            case "Rectangle":
                return new Rectangle();
            default:
                throw new IllegalArgumentException("Invalid shape type: " + input);
        }
    }
}
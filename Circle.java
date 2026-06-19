
package cholatem.shapesystem;

public class Circle extends Shape {

    private double radius;

    // Constructor
    public Circle(double radius) throws InvalidShapeException {
        if (radius <= 0) {
            throw new InvalidShapeException("Radius must be greater than 0");
        }
        this.radius = radius;
    }

    // Area = πr²
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Perimeter = 2πr
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Resize (scale radius)
    @Override
    public void resize(double factor) throws InvalidShapeException {
        if (factor <= 0) {
            throw new InvalidShapeException("Resize factor must be greater than 0");
        }
        radius *= factor;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}

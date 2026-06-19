
package cholatem.shapesystem;

public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    // Constructor
    public Triangle(double a, double b, double c) throws InvalidShapeException {

        // Check positive values
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new InvalidShapeException("All sides must be greater than 0");
        }

        // Triangle inequality rule
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new InvalidShapeException("Triangle inequality violated");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Area using Heron's formula
    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Perimeter
    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    // Resize (scale all sides)
    @Override
    public void resize(double factor) throws InvalidShapeException {

        if (factor <= 0) {
            throw new InvalidShapeException("Resize factor must be greater than 0");
        }

        a *= factor;
        b *= factor;
        c *= factor;
    }

    @Override
    public String toString() {
        return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
    }
}

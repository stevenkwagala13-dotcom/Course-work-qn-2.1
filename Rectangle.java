
package cholatem.shapesystem;

public class Rectangle extends Shape {

    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) throws InvalidShapeException {

        if (width <= 0 || height <= 0) {
            throw new InvalidShapeException("Width and height must be greater than 0");
        }

        this.width = width;
        this.height = height;
    }

    // Area = width × height
    @Override
    public double getArea() {
        return width * height;
    }

    // Perimeter = 2(w + h)
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Resize (scale both dimensions)
    @Override
    public void resize(double factor) throws InvalidShapeException {

        if (factor <= 0) {
            throw new InvalidShapeException("Resize factor must be greater than 0");
        }

        width *= factor;
        height *= factor;
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }
}

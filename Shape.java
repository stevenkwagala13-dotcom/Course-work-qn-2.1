
package cholatem.shapesystem;

public abstract class Shape {

    protected String color = "white";
    protected boolean filled;

    // Default constructor
    public Shape() {
        this.color = "white";
        this.filled = false;
    }

    // Parameterized constructor
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Abstract methods
    public abstract double getArea();
    public abstract double getPerimeter();

    // IMPORTANT FIX: must include throws because subclasses use it
    public abstract void resize(double factor) throws InvalidShapeException;

    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}
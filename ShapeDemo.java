
package cholatem.shapesystem;

public class ShapeDemo {

    // Method to print areas (POLYMORPHISM)
    public static void printAreas(Shape[] shapes) {
        for (Shape s : shapes) {
            System.out.println(s.toString() + " | Area = " + s.getArea());
        }
    }

    // Method to find largest shape
    public static Shape largest(Shape[] shapes) {
        Shape max = shapes[0];

        for (Shape s : shapes) {
            if (s.getArea() > max.getArea()) {
                max = s;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        try {
            Shape[] shapes = new Shape[3];

            shapes[0] = new Circle(5);
            shapes[1] = new Rectangle(4, 6);
            shapes[2] = new Triangle(3, 4, 5);

            System.out.println("=== PRINT AREAS ===");
            printAreas(shapes);

            System.out.println("\n=== LARGEST SHAPE ===");
            System.out.println(largest(shapes));

            // TEST EXCEPTION (invalid shape)
            System.out.println("\n=== TEST INVALID TRIANGLE ===");
            Shape badTriangle = new Triangle(1, 2, 50); // will throw exception

        } catch (InvalidShapeException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
    }
}

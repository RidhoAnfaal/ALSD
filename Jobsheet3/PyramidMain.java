import java.util.Scanner;

public class PyramidMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create array of objects
        Object[] shapes = new Object[2];

        // Input attributes for SquarePyramid
        System.out.print("Enter base side for Square Pyramid:");
        double baseSide = sc.nextDouble();
        System.out.print("Enter height for Square Pyramid:");
        double height = sc.nextDouble();
        shapes[0] = new SquarePyramid(baseSide, height);

        // Input attributes for Sphere
        System.out.print("Enter radius for Sphere:");
        double radius = sc.nextDouble();
        shapes[1] = new Sphere(radius);

        // Display the surface area and volume of each shape
        for (Object shape : shapes) {
            if (shape instanceof SquarePyramid) {
                SquarePyramid pyramid = (SquarePyramid) shape;
                System.out.println("Square Pyramid: Volume = " + pyramid.getVolume() + ", Surface Area = "
                        + pyramid.getSurfaceArea());
            } else if (shape instanceof Sphere) {
                Sphere sphere = (Sphere) shape;
                System.out.println(
                        "Sphere: Volume = " + sphere.getVolume() + ", Surface Area = " + sphere.getSurfaceArea());
            }
        }
    }
}

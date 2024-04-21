import java.util.Scanner;

public class ArrayOfObjects {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the number of rectangles: ");
                int numberOfRectangles = sc.nextInt();

                Rectangle[] rectangleArray = new Rectangle[numberOfRectangles];

                for (int i = 0; i < numberOfRectangles; i++) {
                        rectangleArray[i] = new Rectangle();
                        System.out.println("Rectangle " + (i + 1));

                        System.out.print("Input length: ");
                        rectangleArray[i].length = sc.nextInt();

                        System.out.print("Input width: ");
                        rectangleArray[i].width = sc.nextInt();
                }

                for (int i = 0; i < numberOfRectangles; i++) {
                        System.out.println("Rectangle " + (i + 1));
                        System.out.println(
                                        "Width: " + rectangleArray[i].width + ", Length: " + rectangleArray[i].length);
                }

                sc.close();
        }
}

/*
 * rectangleArray[0] = new Rectangle();
 * rectangleArray[0].length = 110;
 * rectangleArray[0].width = 30;
 * 
 * rectangleArray[1] = new Rectangle();
 * rectangleArray[1].length = 80;
 * rectangleArray[1].width = 40;
 * 
 * rectangleArray[2] = new Rectangle();
 * rectangleArray[2].length = 100;
 * rectangleArray[2].width = 20;
 */

/*
 * System.out.println(
 * "First rectangle, widht: " + rectangleArray[0].width + ", length: "
 * + rectangleArray[0].length);
 * System.out.println(
 * "Second rectangle, widht: " + rectangleArray[1].width + ", length: "
 * + rectangleArray[1].length);
 * System.out.println(
 * "Third rectangle, widht: " + rectangleArray[2].width + ", length: "
 * + rectangleArray[2].length);
 */
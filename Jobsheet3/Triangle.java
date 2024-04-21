public class Triangle {
    public int base;
    public int height;

    public Triangle(int a, int t) {
        base = a;
        height = t;
    }

    public double countArea() {
        return 0.5 * base * height;
    }

    public double countPerimeter() {
        return 3 * base;
    }

    public static void main(String[] args) {
        Triangle[] trArray = new Triangle[4];
        trArray[0] = new Triangle(10, 4);
        trArray[1] = new Triangle(20, 10);
        trArray[2] = new Triangle(15, 6);
        trArray[3] = new Triangle(25, 10);

        for (int i = 0; i < trArray.length; i++) {
            double area = trArray[i].countArea();
            double perimeter = trArray[i].countPerimeter();
            System.out.println("Triangle " + (i + 1) + ":");
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
        }
    }
}
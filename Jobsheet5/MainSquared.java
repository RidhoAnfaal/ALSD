import java.util.Scanner;

public class MainSquared {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.print("Input the number of elements you want to count : ");
        int elemen = sc.nextInt();
        int choose = 0;

        Squared[] png = new Squared[elemen];

        for (int i = 0; i < elemen; i++) {
            png[i] = new Squared();
            System.out.print("Input the value to be squared to-" + (i + 1) + " : ");
            png[i].num = sc.nextInt();
            System.out.print("Input the squared value to-" + (i + 1) + " : ");
            png[i].squared = sc.nextInt();
        }

        System.out.println("1. Brute force");
        System.out.println("2. Divide and conquer");
        System.out.println("Choose method :");
        choose = sc.nextInt();

        switch (choose) {
            case 1:
                System.out.println("============================================================");
                System.out.println("Result with brute force squared");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Value " + png[i].num + " squared " + png[i].squared + " is ; "
                            + png[i].squaredBF(png[i].num, png[i].squared));

                }
                break;

            case 2:
                System.out.println("============================================================");
                System.out.println("Results with divide and conquer squared");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Value " + png[i].num + " squared " + png[i].squared + "  : "
                            + png[i].squaredDC(png[i].num, png[i].squared));
                }
                System.out.println("============================================================");

            default:
                break;
        }
        sc.close();
    }
}
import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.print("Input the number of elements you want to count : ");
        int elemen = sc.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Input the data value to-" + (i + 1) + " : ");
            fk[i].num = sc.nextInt();
        }

        System.out.println("========================================================");
        System.out.println("Factorial result with brute force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Factorial of value " + fk[i].num + " is " + fk[i].faktorialkBF(fk[i].num));
        }
        System.out.println("========================================================");
        System.out.println("Factorial result with divide and conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Factorial of value " + fk[i].num + " is : " + fk[i].faktorialkDC(fk[i].num));
        }
        System.out.println("========================================================");

        sc.close();
    }
}
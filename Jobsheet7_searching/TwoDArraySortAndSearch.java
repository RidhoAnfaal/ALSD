import java.util.Scanner;

public class TwoDArraySortAndSearch {
    public static void main(String[] args) {
        int[][] data = {
                { 45, 78, 7, 200, 80 },
                { 90, 1, 17, 100, 50 },
                { 21, 4, 40, 18, 65 }
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int search = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == search) {
                    System.out.println("Found " + search + " at position [" + i + "][" + j + "]");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println(search + " not found in the array.");
        }
        sc.close();
    }
}

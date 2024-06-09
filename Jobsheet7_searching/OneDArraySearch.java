import java.util.Arrays;

public class OneDArraySearch {
    public static void main(String[] args) {
        int[] data = { 12, 17, 2, 1, 70, 50, 90, 17, 2, 90 };

        int biggestValue = Arrays.stream(data).max().getAsInt();
        System.out.println("The biggest value is: " + biggestValue);

        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == biggestValue) {
                count++;
                System.out.println("Found at position: " + i);
            }
        }

        System.out.println("Amount of biggest value available: " + count);

        Arrays.sort(data);
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        String[] KODE = { "A", "B", "D", "E", "F", "G", "H", "L", "N", "T" };
        String[][] KOTA = {
                { "BANTEN" },
                { "JAKARTA" },
                { "BANDUNG" },
                { "CIREBON" },
                { "BOGOR" },
                { "PEKALONGAN" },
                { "SEMARANG" },
                { "SURABAYA" },
                { "MALANG" },
                { "TEGAL" }
        };

        Map<String, String> plateMap = new HashMap<>();
        for (int i = 0; i < KODE.length; i++) {
            plateMap.put(KODE[i], KOTA[i][0]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the plate number code:");
        String code = sc.next().toUpperCase();

        if (plateMap.containsKey(code)) {
            System.out.println("The city is: " + plateMap.get(code));
        } else {
            System.out.println("Invalid code.");
        }

        sc.close();
    }
}

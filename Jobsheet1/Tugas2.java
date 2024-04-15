import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1/2/3/4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    public static void hitungKecepatan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jarak (dalam meter): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan waktu (dalam detik): ");
        double waktu = scanner.nextDouble();

        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan: " + kecepatan + " m/s");
        System.out.println();
    }

    public static void hitungJarak() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kecepatan (dalam m/s): ");
        double kecepatan = scanner.nextDouble();
        System.out.print("Masukkan waktu (dalam detik): ");
        double waktu = scanner.nextDouble();

        double jarak = kecepatan * waktu;
        System.out.println("Jarak: " + jarak + " meter");
        System.out.println();
    }

    public static void hitungWaktu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jarak (dalam meter): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan kecepatan (dalam m/s): ");
        double kecepatan = scanner.nextDouble();

        double waktu = jarak / kecepatan;
        System.out.println("Waktu: " + waktu + " detik");
        System.out.println();
    }

}
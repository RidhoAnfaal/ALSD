import java.util.Scanner;

public class ArrayofGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas: ");
        int nilaiTugas = scanner.nextInt();
        if (nilaiTugas < 0 || nilaiTugas > 100) {
            System.out.println("Nilai tidak valid.");
            return;
        }

        System.out.print("Masukkan nilai kuis: ");
        int nilaiKuis = scanner.nextInt();
        if (nilaiKuis < 0 || nilaiKuis > 100) {
            System.out.println("Nilai tidak valid.");
            return;
        }

        System.out.print("Masukkan nilai UTS: ");
        int nilaiUTS = scanner.nextInt();
        if (nilaiUTS < 0 || nilaiUTS > 100) {
            System.out.println("Nilai tidak valid.");
            return;
        }

        System.out.print("Masukkan nilai UAS: ");
        int nilaiUAS = scanner.nextInt();
        if (nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai tidak valid.");
            return;
        }

        double nilaiAkhir = 0.2 * nilaiTugas + 0.2 * nilaiKuis + 0.3 * nilaiUTS + 0.4 * nilaiUAS;
        String nilaiHuruf = convertNilaiAngkaToNilaiHuruf(nilaiAkhir);
        String keterangan = "";

        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+")
                || nilaiHuruf.equals("C")) {
            keterangan = "LULUS";
        } else {
            keterangan = "TIDAK LULUS";
        }

        System.out.printf("Nilai akhir: %.2f%n", nilaiAkhir);
        System.out.printf("Nilai huruf: %s%n", nilaiHuruf);
        System.out.printf("Keterangan: %s%n", keterangan);
    }

    private static String convertNilaiAngkaToNilaiHuruf(double nilaiAngka) {
        if (nilaiAngka >= 80) {
            return "A";
        } else if (nilaiAngka >= 73) {
            return "B+";
        } else if (nilaiAngka >= 65) {
            return "B";
        } else if (nilaiAngka >= 60) {
            return "C+";
        } else if (nilaiAngka >= 50) {
            return "C";
        } else if (nilaiAngka >= 39) {
            return "D";
        } else {
            return "E";
        }

    }

}
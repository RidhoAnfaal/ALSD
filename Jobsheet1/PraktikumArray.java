import java.util.Scanner;

public class PraktikumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai Angka untuk MK Pancasila: ");
        double pancasila = scanner.nextDouble();
        System.out.print("Masukkan nilai Angka untuk MK KTI: ");
        double konsepTI = scanner.nextDouble();
        System.out.print("Masukkan nilai Angka untuk MK CTPS: ");
        double criticalThinking = scanner.nextDouble();
        System.out.print("Masukkan nilai Angka untuk MK MATDAS: ");
        double matematika = scanner.nextDouble();
        System.out.print("Masukkan nilai Angka untuk MK BING: ");
        double bahasaInggris = scanner.nextDouble();
        System.out.print("Masukkan nilai Angka untuk MK DASPRO: ");
        double dasarPemrograman = scanner.nextDouble();
        System.out.print("Masukkan nilai Angka untuk MK P.DASPRO: ");
        double praktikumPemrograman = scanner.nextDouble();
        System.out.print("Masukkan nilai Angka untuk MK K3: ");
        double k3 = scanner.nextDouble();

        double[] nilaiAngka = { pancasila, konsepTI, criticalThinking, matematika, bahasaInggris, dasarPemrograman,
                praktikumPemrograman, k3 };
        String[] nilaiHuruf = { "", "", "", "", "", "", "", "" };
        double[] bobotNilai = { 0, 0, 0, 0, 0, 0, 0, 0 };

        for (int i = 0; i < nilaiAngka.length; i++) {
            if (nilaiAngka[i] >= 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            } else if (nilaiAngka[i] >= 73 && nilaiAngka[i] < 80) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] >= 65 && nilaiAngka[i] < 73) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if (nilaiAngka[i] >= 60 && nilaiAngka[i] < 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
                bobotNilai[i] = 3;
            } else if (nilaiAngka[i] >= 60 && nilaiAngka[i] < 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
                bobotNilai[i] = 3;
            } else if (nilaiAngka[i] >= 60 && nilaiAngka[i] < 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
                bobotNilai[i] = 3;
            } else if (nilaiAngka[i] >= 60 && nilaiAngka[i] < 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
                bobotNilai[i] = 3;
            } else if (nilaiAngka[i] >= 60 && nilaiAngka[i] < 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
                bobotNilai[i] = 3;
            } else if (nilaiAngka[i] >= 60 && nilaiAngka[i] < 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
                bobotNilai[i] = 3;
            } else if (nilaiAngka[i] >= 50 && nilaiAngka[i] < 60) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            }
        }

        System.out.println("\n| No | Mata Kuliah | Nilai Angka | Nilai Huruf | Bobot Nilai |");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < nilaiAngka.length; i++) {
            System.out.printf("| %-2d | %-12s | %-9.1f | %-9s | %-9.1f |\n", i + 1, getMataKuliah(i), nilaiAngka[i],
                    nilaiHuruf[i], bobotNilai[i]);
        }
        System.out.println("------------------------------------------------------------");

        double ip = hitungIP(bobotNilai, nilaiAngka);
        System.out.printf("\nIPK: %.2f", ip);
    }

    private static double hitungIP(double[] bobotNilai, double[] nilaiAngka) {
        double ip = 0;
        double jumlahBobot = 0;
        for (int i = 0; i < bobotNilai.length; i++) {
            jumlahBobot += bobotNilai[i];
            ip += nilaiAngka[i] * bobotNilai[i];
        }
        return ip / jumlahBobot;
    }

    private static String getMataKuliah(int i) {
        switch (i) {
            case 0:
                return "Pancasila";
            case 1:
                return "KTI";
            case 2:
                return "CTPS";
            case 3:
                return "MATDAS";
            case 4:
                return "BING";
            case 5:
                return "DASPRO";
            case 6:
                return "P.DASPRO";
            case 7:
                return "K3";
            default:
                return "";
        }
    }
}
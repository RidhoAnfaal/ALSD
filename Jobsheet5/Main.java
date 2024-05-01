import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for Calculating Total Profits");
        System.out.print("Input the Number Of Companies : ");
        int numCompanies = sc.nextInt();
        Sum[] companies = new Sum[numCompanies];

        for (int j = 0; j < numCompanies; j++) {
            System.out.print("Input the Number Of Months for Company " + (j + 1) + " : ");
            int totElemen = sc.nextInt();
            companies[j] = new Sum(totElemen);
            companies[j].elemen = totElemen;

            // Membuat loop untuk mengisi jumlah keuntungan sesuai dengan jumlah bulan yang
            // dimasukkan
            System.out.println("============================================================");
            for (int i = 0; i < companies[j].elemen; i++) {
                System.out.print("Input profit of the month to - " + (i + 1) + " for Company " + (j + 1) + " : ");
                companies[j].profit[i] = sc.nextDouble();
            }

            // Menampilkan hasil perhitungan melalui objek yang telah dibuat untuk kedua
            // algoritma (Brute Force dan Divide Conquer)
            System.out.println("============================================================");
            System.out.println("Algoritma Brute Force for Company " + (j + 1));
            System.out.println("Total profit of the company for " + companies[j].elemen + " month is "
                    + companies[j].totalBF(companies[j].profit));
            System.out.println("Algoritma Divide Conquer for Company " + (j + 1));
            System.out.println("Total profit of the company for " + companies[j].elemen + " month is "
                    + companies[j].TotalDC(companies[j].profit, 0, companies[j].elemen - 1));
            System.out.println("============================================================");
        }
    }
}
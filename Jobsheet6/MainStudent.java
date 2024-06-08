import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        StudentList data = new StudentList();
        int n = 5;

        for (int i = 0; i < n; i++) {
            System.out.print("Name = ");
            String name = s2.nextLine();
            System.out.print("Entrance year = ");
            int year = s1.nextInt();
            System.out.print("Age = ");
            int age = s1.nextInt();
            System.out.print("GPA = ");
            double gpa = s1.nextDouble();
            System.out.println();

            Student s = new Student(name, year, age, gpa);
            data.add(s);
        }

        System.out.println("Unsorted student list: ");
        data.print();

        System.out.println("\n");
        System.out.println();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk=");
        data.bubbleSort(); // dari kebesar ke terkecil
        data.print();

        System.out.println();

        System.out.println("Ascending sorted student list");
        data.selectionSort(); // dari terkecil kee terbesar
        data.print();

        System.out.println();

        System.out.println("Insertion Sort : ");
        System.out.println("Ascending :");
        data.insertionSort(true);
        data.print();
        System.out.println();
        System.out.println("Descending :");
        data.insertionSort(false);
        data.print();

        s1.close();
        s2.close();
    }
}
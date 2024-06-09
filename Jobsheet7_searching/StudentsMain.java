import java.util.Scanner;

public class StudentsMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int amountStudent = s.nextInt();

        SearchStudent data = new SearchStudent(amountStudent);

        System.out.println("-------------------------------------------------");
        System.out.println("Input student data accordingly from smallest NIM");
        for (int i = 0; i < amountStudent; i++) {
            System.out.println("-------------------------------------------------");
            System.out.print("NIM\t: ");
            int nim = s.nextInt();
            System.out.print("Name\t: ");
            String name = s1.nextLine();
            System.out.print("Age\t: ");
            int age = s.nextInt();
            System.out.print("GPA\t: ");
            double gpa = s.nextDouble();

            Students std = new Students(nim, age, name, gpa);
            data.add(std);
        }

        System.out.println();
        System.out.println("---------------------");
        System.out.println("Entire Student Data");
        System.out.println("---------------------");
        data.dislay();

        System.out.println("_________________________________________________");
        System.out.println("_________________________________________________");
        System.out.print("Search student by NIM: ");
        int search = s.nextInt();
        System.out.println("Using sequential search");
        int position = data.findSeqSearch(search);

        data.showPosition(search, position);
        data.showData(search, position);

        System.out.println("_________________________________________________");
        System.out.println("=================================================");
        System.out.println("Search student by NIM: ");
        System.out.println("Using binary search");
        int positionl = data.findBinarySearch(search, 0, amountStudent - 1);

        data.showPosition(search, positionl);
        data.showData(search, positionl);

        System.out.println("_________________________________________________");
        System.out.println("Search student by name with discrepancy allowed: ");
        System.out.print("Enter the name: ");
        String nameSearch = s1.nextLine();
        int positionName = data.findSeqSearchDiscrepancy(nameSearch);
        data.showPositionName(nameSearch, positionName);
        data.showDataName(nameSearch, positionName);

        s.close();
        s1.close();
    }
}

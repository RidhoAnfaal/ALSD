import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];
        double totalGPA = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Insert " + (i + 1) + "st student data");
            System.out.print("Insert name: ");
            String name = sc.nextLine();
            System.out.print("Insert nim: ");
            String nim = sc.nextLine();
            System.out.print("Insert gender: ");
            String gender = sc.nextLine();
            System.out.print("Insert GPA: ");
            double GPA = sc.nextDouble();
            sc.nextLine();

            students[i] = new Student(name, nim, gender, GPA);
            students[i].display();
            System.out.println();
            totalGPA += GPA;
        }

        double averageGPA = totalGPA / 3;
        System.out.println("Average GPA: " + averageGPA);

        Student topStudent = students[0];
        for (int i = 1; i < 3; i++) {
            if (students[i].GPA > topStudent.GPA) {
                topStudent = students[i];
            }
        }

        System.out.println("Student with highest GPA:");
        topStudent.display();

        sc.close();
    }
}
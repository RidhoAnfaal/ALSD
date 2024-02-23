import java.util.Scanner;

public class PraktikumPemilihan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int assignment, quiz, midtermExam, finalExam;

        System.out.println("Program to Calculate Final Grades\n======================");
        System.out.print("Enter Assignment Grade: ");
        assignment = scanner.nextInt();
        System.out.print("Enter Quiz Grade: ");
        quiz = scanner.nextInt();
        System.out.print("Enter Midterm Exam Score: ");
        midtermExam = scanner.nextInt();
        System.out.print("Enter Final Exam Score: ");
        finalExam = scanner.nextInt();
        System.out.println("======================");

        if (assignment < 0 || assignment > 100 || quiz < 0 || quiz > 100 || midtermExam < 0 || midtermExam > 100
                || finalExam < 0 || finalExam > 100) {
            System.out.println("======================\nInvalid\n======================");
            return;
        }

        double finalGrade = (0.2 * assignment) + (0.2 * quiz) + (0.3 * midtermExam) + (0.4 * finalExam);
        String letterGrade;

        if (finalGrade >= 80) {
            letterGrade = "A";
        } else if (finalGrade >= 73) {
            letterGrade = "B+";
        } else if (finalGrade >= 65) {
            letterGrade = "B";
        } else if (finalGrade >= 60) {
            letterGrade = "C+";
        } else if (finalGrade >= 50) {
            letterGrade = "C";
        } else if (finalGrade >= 39) {
            letterGrade = "D";
        } else {
            letterGrade = "E";
        }

        String description = "";
        if (letterGrade.equals("A") || letterGrade.equals("B+") || letterGrade.equals("B")
                || letterGrade.equals("C+")) {
            description = "CONGRATULATIONS YOU PASSED";
        } else {
            description = "NOT PASS";
        }

        System.out.println("======================");
        System.out.printf("Final Grade: %.2f%n", finalGrade);
        System.out.printf("Letter Grade: %s%n", letterGrade);
        System.out.println("======================\n======================");
        System.out.println(description);

        scanner.close();
    }
}

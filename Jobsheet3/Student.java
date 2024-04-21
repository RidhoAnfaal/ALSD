public class Student {
    String name;
    String nim;
    String gender;
    double GPA;

    Student(String name, String nim, String gender, double GPA) {
        this.name = name;
        this.nim = nim;
        this.gender = gender;
        this.GPA = GPA;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("NIM: " + this.nim);
        System.out.println("Gender: " + this.gender);
        System.out.println("GPA: " + this.GPA);
    }
}
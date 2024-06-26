package Practicum2;

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Stack st = new Stack(8);
        Scanner sc = new Scanner(System.in);

        char choose;
        int menu = 0;
        do {
            System.out.print("Title : ");
            String title = sc.nextLine();

            System.out.print("Author Name : ");
            String name = sc.nextLine();

            System.out.print("Published Year : ");
            int year = sc.nextInt();

            System.out.print("Pages Amount : ");
            int pages = sc.nextInt();

            System.out.print("Price : ");
            int price = sc.nextInt();

            Book bk = new Book(title, name, year, pages, price);
            System.out.print("Do you want to add new data to stack (y/n)? ");
            choose = sc.next().charAt(0);
            sc.nextLine();
            st.push(bk);

        } while (choose == 'y');

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Pop");
            System.out.println("2. Peek");
            System.out.println("3. Print");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            menu = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (menu) {
                case 1:
                    st.pop();
                    break;
                case 2:
                    st.peek();
                    break;
                case 3:
                    st.print();
                case 4:
                    break;

                default:
                    break;
            }
        } while (menu != 4);

        sc.close();
    }
}
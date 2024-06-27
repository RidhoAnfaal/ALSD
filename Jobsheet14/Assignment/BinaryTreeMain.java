package Assignment;

import java.util.Scanner;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Find");
            System.out.println("4. Traverse In-Order");
            System.out.println("5. Traverse Pre-Order");
            System.out.println("6. Traverse Post-Order");
            System.out.println("7. Find Smallest and Largest");
            System.out.println("8. Display Leaf Data");
            System.out.println("9. Count Leaves");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to add: ");
                    int data = scanner.nextInt();
                    tree.add(data);
                    break;
                case 2:
                    System.out.print("Enter data to delete: ");
                    data = scanner.nextInt();
                    tree.delete(data);
                    break;
                case 3:
                    System.out.print("Enter data to find: ");
                    data = scanner.nextInt();
                    tree.find(data);
                    break;
                case 4:
                    tree.traverseInOrder();
                    break;
                case 5:
                    tree.traversePreOrder();
                    break;
                case 6:
                    tree.traversePostOrder();
                    break;
                case 7:
                    tree.findSmallestAndLargest();
                    break;
                case 8:
                    tree.displayLeafData();
                    break;
                case 9:
                    int count = tree.countLeaves();
                    System.out.println("Number of leaves: " + count);
                    break;
                case 10:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

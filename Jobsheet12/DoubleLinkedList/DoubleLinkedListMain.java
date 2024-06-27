package DoubleLinkedList;

public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==============================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==============================");
        try {
            dll.add(40, 1);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==============================");
        try {
            System.out.println("Data in the head of linked list is: " + dll.getFirst());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            System.out.println("Data in the tail of linked list is: " + dll.getLast(0));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            System.out.println("Data in the 1st index linked list is: " + dll.get(1));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
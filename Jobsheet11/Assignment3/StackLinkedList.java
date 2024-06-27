package Assignment3;

public class StackLinkedList {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push("Bahasa");
        stack.push("Android");
        stack.push("Komputer");
        stack.push("Basis Data");
        stack.push("Matematika");
        stack.push("Algoritma");
        stack.push("Statistika");
        stack.push("Multimedia");

        System.out.println("Stack (Top to Bottom):");
        stack.printStack();
        System.out.println();
        System.out.println("Popped: " + stack.pop());
        System.out.println();
        System.out.println("Stack (Top to Bottom):");
        stack.printStack();
    }
}
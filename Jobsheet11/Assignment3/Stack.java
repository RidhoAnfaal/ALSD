package Assignment3;

public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(String data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public String pop() {
        if (isEmpty()) {
            return null;
        }
        String poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    public String peek() {
        if (isEmpty()) {
            return null;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
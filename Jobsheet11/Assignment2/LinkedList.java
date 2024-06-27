package Assignment2;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addAtBeginning(char data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addAtPosition(int position, char data) {
        Node newNode = new Node(data);
        if (position == 0) {
            addAtBeginning(data);
        } else {
            Node temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void addAfterNode(char prevData, char data) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp != null) {
            if (temp.data == prevData) {
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addAtBeginning('a');
        list.addAtEnd('e');
        list.addAtPosition(1, 'b');
        list.addAtPosition(2, 'c');
        list.addAtPosition(3, 'd');
        list.printList();
    }
}
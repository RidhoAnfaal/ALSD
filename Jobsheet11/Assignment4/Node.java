package Assignment4;

public class Node {
    String name;
    String address;
    int customerAccountNumber;
    Node next;

    public Node(String name, String address, int customerAccountNumber) {
        this.name = name;
        this.address = address;
        this.customerAccountNumber = customerAccountNumber;
        this.next = null;
    }
}

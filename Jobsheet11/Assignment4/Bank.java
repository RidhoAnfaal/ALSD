package Assignment4;

public class Bank {
    private Node head;

    public Bank() {
        this.head = null;
    }

    public void addCustomer(String name, String address, int customerAccountNumber) {
        Node newNode = new Node(name, address, customerAccountNumber);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void displayCustomers() {
        Node current = head;
        while (current != null) {
            System.out.println("Name: " + current.name);
            System.out.println("Address: " + current.address);
            System.out.println("Customer Account Number: " + current.customerAccountNumber);
            System.out.println("------------------------");
            current = current.next;
        }
    }

    public void searchCustomer(int customerAccountNumber) {
        Node current = head;
        while (current != null) {
            if (current.customerAccountNumber == customerAccountNumber) {
                System.out.println("Name: " + current.name);
                System.out.println("Address: " + current.address);
                System.out.println("Customer Account Number: " + current.customerAccountNumber);
                return;
            }
            current = current.next;
        }
        System.out.println("Customer not found!");
    }

    public void deleteCustomer(int customerAccountNumber) {
        if (head == null) {
            System.out.println("No customers in the bank!");
            return;
        }
        if (head.customerAccountNumber == customerAccountNumber) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.customerAccountNumber == customerAccountNumber) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
        System.out.println("Customer not found!");
    }
}

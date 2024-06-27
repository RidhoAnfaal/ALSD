package Assignment4;

public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("John Doe", "123 Main St", 1234);
        bank.addCustomer("Jane Smith", "456 Elm St", 5678);
        bank.addCustomer("Bob Johnson", "789 Oak St", 9012);

        bank.displayCustomers();

        bank.searchCustomer(5678);

        bank.deleteCustomer(1234);

        bank.displayCustomers();
    }
}
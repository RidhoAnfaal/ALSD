package assignment;

import java.util.Stack;

class Receipt {
    private int transactionID;
    private String date;
    private int quantityOfItems;
    private double totalPrice;

    public Receipt(int transactionID, String date, int quantityOfItems, double totalPrice) {
        this.transactionID = transactionID;
        this.date = date;
        this.quantityOfItems = quantityOfItems;
        this.totalPrice = totalPrice;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public String getDate() {
        return date;
    }

    public int getQuantityOfItems() {
        return quantityOfItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}

public class number2 {
    public static void main(String[] args) {
        Stack<Receipt> receipts = new Stack<>();

        receipts.push(new Receipt(1, "2022-01-01", 5, 100.000));
        receipts.push(new Receipt(2, "2022-01-08", 3, 75.000));
        receipts.push(new Receipt(3, "2022-01-15", 2, 50.000));
        receipts.push(new Receipt(4, "2022-01-22", 4, 90.000));
        receipts.push(new Receipt(5, "2022-01-29", 1, 25.000));
        receipts.push(new Receipt(6, "2022-02-05", 6, 120.000));
        receipts.push(new Receipt(7, "2022-02-12", 5, 100.000));
        receipts.push(new Receipt(8, "2022-02-19", 3, 75.000));

        System.out.println("Dewi's Receipts:");
        while (!receipts.isEmpty()) {
            Receipt receipt = receipts.pop();
            System.out.println("Transaction ID: " + receipt.getTransactionID());
            System.out.println("Date: " + receipt.getDate());
            System.out.println("Quantity of Items: " + receipt.getQuantityOfItems());
            System.out.println("Total Price: " + receipt.getTotalPrice());
            System.out.println();
        }
    }
}
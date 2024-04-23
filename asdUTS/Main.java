public class Main {
    public static void main(String[] args) {
        // membuat objek dari class diagram
        Diagram diagram = new Diagram();

        // MENAMBAH DATA ITEM
        diagram.addItem(new Item(16180730, "Notebook", "stationary", 150));

        // menampilkan semua data
        System.out.println("Display all Item data:");
        diagram.displayItems();

        // mengurutkan data item berdasarkan stok lalu menampilkannya
        System.out.println("\nSort Item data based on the stock values in ascending mode:");
        diagram.sortItems();
        diagram.displayItems();

        // menampilkan data item yang classified sebagai food dan memiliki stock 0
        // menggunakan
        System.out.println("\nDisplay Items data classified as food that have no stock:");
        diagram.displayFoodItemsWithNoStock();

        // mencari item menurut keyword
        System.out.println("\nSearch Item data based on the name keyword 'Indomie':");
        Item indomie = diagram.searchItemByName("Indomie");
        if (indomie != null) {
            System.out.printf("%-10d %-20s %-10s %d%n", indomie.getItemCode(), indomie.getName(), indomie.getCategory(),
                    indomie.getStock());
        } else {
            System.out.println("Item not found.");
        }

        // menambah stok sprite
        System.out.println("\nAdd the stock for Item with code 16100617 by 100:");
        diagram.addStock(16100617, 100);
        diagram.displayItems();

        // mengurangi stok sprite
        System.out.println("\nDecrease the stock for Item with code 16100617 by 50:");
        diagram.decreaseStock(16100617, 50);
        diagram.displayItems();
    }
}
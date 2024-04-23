import java.util.*; // import library java

public class Diagram {
    // attribute item bertipe list
    private List<Item> items;

    // inisialisasi attribute items dengan array list
    public Diagram() {
        items = new ArrayList<>();
        items.add(new Item(100, "Indomilk", "drink", 70));
        items.add(new Item(16100617, "Sprite", "drink", 500));
        items.add(new Item(16240401, "Yakult", "drink", 250));
        items.add(new Item(16270525, "Indomie", "food", 320));
        items.add(new Item(16971204, "Oreo", "food", 120));
        items.add(new Item(16100727, "Chocochips", "food", 75));
        items.add(new Item(16460329, "Ballpoint", "stationary", 110));
        items.add(new Item(16320421, "Pencil", "stationary", 57));
        items.add(new Item(16180729, "Book", "stationary", 200));
    }

    // method untuk menambah item ke dalam list
    public void addItem(Item item) {
        items.add(item);
    }

    // method untuk menampilkan semua item
    public void displayItems() {
        System.out.printf("%-10s %-20s %-10s %s%n", "itemCode", "name", "category", "stock");
        System.out.println("-------------------------------------------------------------------");
        for (Item item : items) {
            System.out.printf("%-10d %-20s %-10s %d%n", item.getItemCode(), item.getName(), item.getCategory(),
                    item.getStock());
        }
    }

    // method untuk mengurutkan item berdasarkan stok
    public void sortItems() {
        Collections.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return Integer.compare(o1.getStock(), o2.getStock());
            }
        });
    }

    // menampilkan makanan yang habis
    public void displayFoodItemsWithNoStock() {
        for (Item item : items) {
            if (item.getCategory().equalsIgnoreCase("food") && item.getStock() == 0) {
                System.out.printf("%-10d %-20s %-10s %d%n", item.getItemCode(), item.getName(), item.getCategory(),
                        item.getStock());
            }
        }
    }

    // untuk mencari item berdasarkan nama
    public Item searchItemByName(String name) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    // method untuk menambahkan stok item
    public void addStock(int itemCode, int stock) {
        // mencari item berdasarkan kode
        Item item = findItemByItemCode(itemCode);
        if (item != null) {
            item.addStock(stock);
        } else {
            System.out.println("Item not found.");
        }
    }

    // method mengurangi stok item
    public void decreaseStock(int itemCode, int stock) {
        // mencari item berdasarkan kode
        Item item = findItemByItemCode(itemCode);
        if (item != null) {
            item.decreaseStock(stock);
        } else {
            System.out.println("Item not found.");
        }
    }

    // untuk mencari item berdasarkan kode
    private Item findItemByItemCode(int itemCode) {
        for (Item item : items) {
            if (item.getItemCode() == itemCode) {
                return item;
            }
        }
        return null;
    }
}
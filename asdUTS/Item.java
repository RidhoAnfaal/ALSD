public class Item {
    // Attribute
    private int itemCode;
    private String name;
    private String category;
    private int stock;

    // Konstruktor berparameter
    public Item(int itemCode, String name, String category, int stock) {
        this.itemCode = itemCode;
        this.name = name;
        this.category = category;
        this.stock = stock;
    }

    // method untuk mendapatkan nilai itemCode
    public int getItemCode() {
        return itemCode;
    }

    // method untuk mendapatkan nilai name
    public String getName() {
        return name;
    }

    // method untuk mendapatkan nilai category
    public String getCategory() {
        return category;
    }

    // method untuk mendapatkan nilai dari stok
    public int getStock() {
        return stock;
    }

    // method untuk menambahkan jumlah stok
    public void addStock(int stock) {
        this.stock += stock;
    }

    // method untuk mengurangi jumlah stock, juka stok cukup
    public void decreaseStock(int stock) {
        if (this.stock >= stock) {
            this.stock -= stock;
        } else {
            System.out.println("Insufficient stock.");
        }
    }
}
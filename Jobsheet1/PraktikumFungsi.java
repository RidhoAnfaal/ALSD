public class PraktikumFungsi {

    public static void main(String[] args) {
        int[][] stock = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 }
        };

        int[] reduction = { 1, 2, 0, 5 };

        reduceStock(stock, reduction);
        getStockForRoyalGarden4(stock);
        calculateEarnings(stock);
    }

    public static void reduceStock(int[][] stock, int[] reduction) {
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                stock[i][j] -= reduction[j];
                if (stock[i][j] < 0) {
                    stock[i][j] = 0;
                }
            }
        }
    }

    public static void getStockForRoyalGarden4(int[][] stock) {
        System.out.println("Stock for RoyalGarden 4:");
        for (int i = 0; i < stock[3].length; i++) {
            System.out.println(stock[3][i] + " - " + getFlowerName(i));
        }
    }

    public static void calculateEarnings(int[][] stock) {
        int[] prices = { 75000, 50000, 60000, 10000 };
        for (int i = 0; i < stock.length; i++) {
            int totalEarning = 0;
            for (int j = 0; j < stock[i].length; j++) {
                totalEarning += stock[i][j] * prices[j];
            }
            System.out.println("Total Earning for RoyalGarden " + (i + 1) + " is: " + totalEarning);
        }
    }

    private static String getFlowerName(int index) {
        String[] flowerNames = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
        return flowerNames[index];
    }
}
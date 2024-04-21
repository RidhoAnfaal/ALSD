public class Array2DOfObjects {
    public static void main(String[] args) {
        // Declare and initialize a 2D array of Rectangle objects
        Rectangle[][] rectangleArray = new Rectangle[3][3];

        // Instantiate Rectangle objects and assign them to positions in the 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rectangleArray[i][j] = new Rectangle();
                rectangleArray[i][j].length = i + j;
                rectangleArray[i][j].width = i * j;
            }
        }

    }
}
public class Dragon {
    int width, height, x, y;
    static int mati = 0;

    public Dragon(int w, int h) {
        width = w;
        height = h;
        x = w / 2;
        y = h / 2;
    }

    void printPosition() {
        System.out.printf("(%d,%d)", x, y);
        System.out.println();
    }

    void moveLeft() {
        if (x > 0)
            x = x - 1;
        System.out.print("The dragon moves to the left ");
        printPosition();
        detectCollision();
    }

    void moveRight() {
        if (x < width)
            x = x + 1;
        System.out.print("The dragon moves to the right ");
        printPosition();
        detectCollision();
    }

    void moveUp() {
        if (y > 0)
            y = y - 1;
        System.out.print("The dragon moves up ");
        printPosition();
        detectCollision();
    }

    void moveDown() {
        if (y < height)
            y = y + 1;
        System.out.print("The dragon moves down ");
        printPosition();
        detectCollision();
    }

    void detectCollision() {
        if (x <= 0 || y <= 0 || x >= width || y >= height) {
            mati = 1;
            System.out.println("Game over!");
        }
    }

    public static void main(String[] args) {
        Dragon d = new Dragon(10, 20);
        d.moveRight();
        d.moveLeft();
        d.moveDown();
        d.moveUp();
        d.moveRight();
        for (int i = 0; i < 10; i++) {
            d.moveDown();
            if (mati == 1) {
                break;
            }
        }
    }
}
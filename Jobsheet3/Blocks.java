public class Blocks {
    public int widht, length, height;

    public Blocks(int p, int l, int t) {
        length = p;
        widht = t;
        height = l;
    }

    public int countVolume() {
        return length * widht * height;
    }
}
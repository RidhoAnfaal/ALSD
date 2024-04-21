public class SquarePyramid {
    double baseSide;
    double height;

    public SquarePyramid(double baseSide, double height) {
        this.baseSide = baseSide;
        this.height = height;
    }

    public double getVolume() {
        return (baseSide * baseSide * height) / 3;
    }

    public double getSurfaceArea() {
        return baseSide * (baseSide + Math.sqrt((baseSide * baseSide) + (4 * height * height)));
    }
}
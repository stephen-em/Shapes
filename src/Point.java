public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double x() {
        return this.x;
    }

    public double y() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean isEqual(Point other) {
        return other.x() == this.x && other.y() == this.y;
    }

    public double distanceFrom(Point other) {
        return Math.sqrt(Math.pow(this.y - other.y(), 2) + Math.pow(this.x - other.x(), 2));
    }

    @Override
    public String toString() {
        return String.format("%d, %d", this.x, this.y);
    }
}

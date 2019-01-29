public class Circle extends Shape {
    private Point center;
    private double radius;

    public Circle() {};

    public Circle(Point center) {
        this.center = center;
    }

    public Circle (double radius) {
        this.radius = radius;
    }

    public Circle (Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point center() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double radius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void move(Point center) {

    }

    public void expandBy(double delta) {
        this.radius *= delta;
    }

    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    public boolean isEqual(Circle other) {
        return this.radius == other.radius &&
                this.center == other.center;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}

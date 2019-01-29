public class Rectangle extends Shape {
    private Point center;
    private double width;
    private double height;

    public Rectangle() {};

    public Rectangle(Point center) {
        this.center = center;
    };

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    };

    public Rectangle(Point center, double width, double height) {
        this.center = center;
        this.width = width;
        this.height = height;
    }

    public Point center() {
        return this.center;
    }

    public double width() {
        return this.width;
    }

    public double height() {
        return this.height;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void move(Point center) {}

    public void scaleBy(double delta) {
        this.width *= delta;
        this.height *= delta;
    }

//    public boolean overlaps(Rectangle other) {
//        return other.width > 0 && other.height > 0 && width > 0 && height > 0
//               && other.x() < x + width && other.x + other.width > x
//               && r.y < y + height && other.y + other.height > y;
//    };

    public double area() {
        return this.height * this.width;
    }

    public double perimeter() {
        return this.height * 2 + this.width * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "center=" + center +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

//    public boolean isEqual(Rectangle other) {
//
//    }
}

public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(Point center) {
        super(center);
    }

    public Square(double width) {
        super(width, width);
    }

    public Square(Point center, double width) {
        super(center, width, width);
    }
}
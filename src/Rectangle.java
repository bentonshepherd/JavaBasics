public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }

    public void setLength(double length) { this.length = length; }
    public double getLength() { return length; }

    public double getArea() {
        double area = width*length;
        return area;
    }

    public double getDiagonal() {
        double diagonal = Math.sqrt((width*width) + (length*length));
        return diagonal;
    }

    public boolean isSquare() {
        if (length == width) {
            return true;
        } else {
            return false;
        }
    }
}

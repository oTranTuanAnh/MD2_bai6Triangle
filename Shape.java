public class Shape {
    private double size;
    private String color;

    public Shape(double size, String color) {
        this.size = size;
        this.color = color;
    }

    public Shape() {
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}

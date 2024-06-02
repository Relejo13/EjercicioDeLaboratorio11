public class Rectangle implements Figure {
    private String color;
    private double width, height;

    public Rectangle(String color, double width, double height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double perimetro() {
        return 2 * (width + height);
    }

    @Override
    public double area() {
        return width * height;
    }
}

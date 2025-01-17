public class Triangle implements Figure {
    private String color;
    private double side1, side2, side3;

    public Triangle(String color, double side1, double side2, double side3) {
        this.color = color;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double perimetro() {
        return side1 + side2 + side3;
    }

    @Override
    public double area() {
        double s = perimetro() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}

public class Hexagon implements Figure {
    private String color;
    private double side;

    public Hexagon(String color, double side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double perimetro() {
        return 6 * side;
    }

    @Override
    public double area() {
        return (3 * Math.sqrt(3) * (side * side)) / 2;
    }
}

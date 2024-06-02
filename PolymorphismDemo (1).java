public class PolymorphismDemo {
    public static void demoPolimorfismo(Figure figura) {
        System.out.println("Color: " + figura.getColor());
        System.out.println("Perímetro: " + figura.perimetro());
        System.out.println("Área: " + figura.area());
        System.out.println();
    }

    public static void main(String[] args) {
        Figure triangulo = new Triangle("rojo", 3, 4, 5);
        Figure circulo = new Circle("azul", 7);
        Figure rectangulo = new Rectangle("verde", 5, 10);
        Figure hexagono = new Hexagon("amarillo", 6);

        Figure[] figuras = {triangulo, circulo, rectangulo, hexagono};
        for (Figure figura : figuras) {
            demoPolimorfismo(figura);
        }
    }
}

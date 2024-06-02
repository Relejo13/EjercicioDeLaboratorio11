def demo_polimorfismo(figura):
    print(f"Color: {figura.getColor()}")
    print(f"Perímetro: {figura.perimetro()}")
    print(f"Área: {figura.area()}")
    print()

# Crear instancias de cada clase
triangulo = Triangle("rojo", 3, 4, 5)
circulo = Circle("azul", 7)
rectangulo = Rectangle("verde", 5, 10)
hexagono = Hexagon("amarillo", 6)

# Demostrar polimorfismo
for figura in [triangulo, circulo, rectangulo, hexagono]:
    demo_polimorfismo(figura)

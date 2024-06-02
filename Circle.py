import math

class Circle(FigureInterface):
    def __init__(self, color, radius):
        self.color = color
        self.radius = radius

    def getColor(self):
        return self.color

    def perimetro(self):
        return 2 * math.pi * self.radius

    def area(self):
        return math.pi * self.radius ** 2

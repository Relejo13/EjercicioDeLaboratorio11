import math

class Hexagon(FigureInterface):
    def __init__(self, color, side):
        self.color = color
        self.side = side

    def getColor(self):
        return self.color

    def perimetro(self):
        return 6 * self.side

    def area(self):
        return (3 * math.sqrt(3) * (self.side ** 2)) / 2

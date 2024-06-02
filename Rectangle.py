class Rectangle(FigureInterface):
    def __init__(self, color, width, height):
        self.color = color
        self.width = width
        self.height = height

    def getColor(self):
        return self.color

    def perimetro(self):
        return 2 * (self.width + self.height)

    def area(self):
        return self.width * self.height

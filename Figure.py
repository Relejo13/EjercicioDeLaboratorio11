from abc import ABC, abstractmethod

class FigureInterface(ABC):
    @abstractmethod
    def getColor(self):
        pass

    @abstractmethod
    def perimetro(self):
        pass

    @abstractmethod
    def area(self):
        pass

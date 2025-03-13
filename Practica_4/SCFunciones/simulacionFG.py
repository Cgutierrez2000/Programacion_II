import math
class FiguraGeometrica:
    # círculo
    def area_circulo(self, radio):
        return math.pi * radio * radio

    # rectángulo
    def area_rectangulo(self, largo, ancho):
        return largo * ancho

    # triángulo rectángulo
    def area_triangulo(self, base, altura):
        return (base * altura) / 2

    # trapecio
    def area_trapecio(self, baseMayor, baseMenor, altura):
        return ((baseMayor + baseMenor) * altura) / 2

    # pentágono
    def area_pentagono(self, lado):
        return (1.0 / 4.0) * math.sqrt(5 * (5 + 2 * math.sqrt(5))) * lado * lado

    # Método principal para simular sobrecarga
    def area(self, *args):
        if len(args) == 1:
            return self.area_circulo(args[0])
        elif len(args) == 2:
            return self.area_rectangulo(args[0], args[1])
        elif len(args) == 3:
            if isinstance(args[2], bool):
                return self.area_triangulo(args[0], args[1])
            else:
                return self.area_trapecio(args[0], args[1], args[2])
        elif len(args) == 1:
            return self.area_pentagono(args[0])
        else:
            return 0

if __name__ == "__main__":
    Fg = FiguraGeometrica()

    print("círculo:", Fg.area(5))
    print("rectángulo:", Fg.area(4, 6))
    print("triángulo rectángulo:", Fg.area(3, 4, True))
    print("trapecio:", Fg.area(4, 6, 5))
    print("pentágono:", Fg.area(3))
import math
#no podemos hacer sobre carga de funciones en python pero,
#podemos usar condicionales para que solo usemos un metodo
class FiguraGeometrica:
    
    def area(self, *args):
        if len(args) == 1:
            # círculo
            radio = args[0]
            return math.pi * radio * radio
        elif len(args) == 2:
            # rectángulo
            largo, ancho = args
            return largo * ancho
        elif len(args) == 3:
            # triángulo rectángulo o trapecio
            if isinstance(args[2], bool):
                # triángulo rectángulo
                base, altura, _ = args
                return (base * altura) / 2
            else:
                # trapecio
                baseMayor, baseMenor, altura = args
                return ((baseMayor + baseMenor) * altura) / 2
        elif len(args) == 2:
            # pentágono
            lado, apotema = args
            return (5 * lado * apotema) / 2
        else:
            return 0


if __name__ == "__main__":
    Fg = FiguraGeometrica()

    print("círculo:", Fg.area(5))
    print("rectángulo:", Fg.area(4, 6))
    print("triángulo rectángulo:", Fg.area(3, 4, True))
    print("trapecio:", Fg.area(4, 6, 5))
    print("pentágono:", Fg.area(3, 4))
    
#podemos simularla utilizando un solo método con parámetros 
# opcionales y lógica condicional.
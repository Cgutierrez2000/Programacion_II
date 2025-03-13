class FiguraGeometrica:

    def area(self, radio=None, largo=None, ancho=None, base=None, altura=None, base_mayor=None, base_menor=None, lado=None, apotema=None, lados=None):
        if radio is not None:
            return 3.14159 * radio * radio
        elif largo is not None and ancho is not None:
            return largo * ancho
        elif base is not None and altura is not None and lados is None:
            return (base * altura) / 2
        elif base_mayor is not None and base_menor is not None and altura is not None:
            return ((base_mayor + base_menor) * altura) / 2
        elif lado is not None and apotema is not None and lados == 5:
            return (5 * lado * apotema) / 2
        else:
            return 0

calculadora = AreaCalculator()

print("Área del círculo:", calculadora.calcular_area(radio=5))
print("Área del rectángulo:", calculadora.calcular_area(largo=4, ancho=6))
print("Área del triángulo rectángulo:", calculadora.calcular_area(base=3, altura=4))
print("Área del trapecio:", calculadora.calcular_area(base_mayor=4, base_menor=6, altura=5))
print("Área del pentágono:", calculadora.calcular_area(lado=3, apotema=4, lados=5))
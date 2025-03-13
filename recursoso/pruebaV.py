import numpy as np

class Matriz:
    def _init_(self, datos):
        self.datos = np.array(datos)  # Convertimos la lista en un array de numpy

    def _mul_(self, otra):
        if isinstance(otra, Matriz):
            # Usamos np.dot para multiplicar matrices
            resultado = np.dot(self.datos, otra.datos)
            return Matriz(resultado)  # Devolvemos un nuevo objeto Matriz
        else:
            raise ValueError("La multiplicación solo está definida entre dos matrices.")

    def _str_(self):
        return str(self.datos)

# Ejemplo de uso
m1 = Matriz([[1, 2], [3, 4]])
m2 = Matriz([[5, 6], [7, 8]])

resultado = m1 * m2  # Aquí usamos la sobrecarga de operadores
print("Resultado de la multiplicación:")
print(resultado)
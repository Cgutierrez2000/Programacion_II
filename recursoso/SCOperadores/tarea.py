class Matriz:
    def __init__(self, filas, columnas):
        self.filas = filas
        self.columnas = columnas
        self.datos = [[0 for _ in range(columnas)] for _ in range(filas)]

    def __mul__(self, otra_matriz):
        if self.columnas != otra_matriz.filas:
            raise ValueError("No se pueden multiplicar")

        resultado = Matriz(self.filas, otra_matriz.columnas)

        for i in range(self.filas):
            for j in range(otra_matriz.columnas):
                for k in range(self.columnas):
                    resultado.datos[i][j] += self.datos[i][k] * otra_matriz.datos[k][j]

        return resultado

    def __str__(self):
        return "\n".join([" ".join([str(num) for num in fila]) for fila in self.datos])

# Crear matrices
matriz1 = Matriz(2, 3)
matriz1.datos = [[1, 2, 3], [4, 5, 6]]

matriz2 = Matriz(3, 2)
matriz2.datos = [[7, 8], [9, 10], [11, 12]]

# Multiplicar matrices
resultado = matriz1 * matriz2

# Imprimir resultado
print("Matriz 1:")
print(matriz1)
print("\nMatriz 2:")
print(matriz2)
print("\nmultiplicación:")
print(resultado)


class Cola:
    def __init__(self, n):
        self.__arreglo = [0] * (n + 1)  # todo esto es tu constructor
        self.__inicio = 0
        self.__fin = 0
        self.__n = n

    def insert(self, e):
        if self.__fin == self.__n:
            print("Cola llena")
        else:
            self.__fin += 1
            self.__arreglo[self.__fin] = e

    def remove(self):  # consultar datos a sus atributos
        if self.__inicio == 0 and self.__fin == 0:
            print("Cola vacía")
            return None
        else:
            self.__inicio += 1
            dato = self.__arreglo[self.__inicio]
            if self.__inicio == self.__fin:
                self.__inicio = 0
                self.__fin = 0
            return dato

    def peek(self):  # devuelve el dato que esté hasta el frente de la cola
        return self.__arreglo[self.__inicio + 1]

    def isEmpty(self):  # devuelve verdadero si la cola está vacía
        return self.__inicio == self.__fin == 0

    def isFull(self):  # cola llena verifica
        return self.__fin == self.__n

    def size(self):  # cuántos elementos tiene
        return self.__fin - self.__inicio

    def size2(self):  # tamaño de la cola
        return self.__n

    def nroElem(self):  # número de elementos de la cola
        aux = Cola(self.__n)  # cola auxiliar para almacenar los datos
        contador = 0
        while not self.isEmpty():
            dato = self.remove()
            aux.insert(dato)
            contador += 1
        while not aux.isEmpty():
            dato = aux.remove()
            self.insert(dato)
        return contador

# ejemplos de uso
q = Cola(5)

# Insertar elementos en la cola
q.insert(10)
q.insert(20)
q.insert(30)
print("Número de elementos después de insertar:", q.nroElem())  # Debería imprimir 3

# Consultar el elemento al frente de la cola
print("Elemento al frente de la cola:", q.peek())  # Debería imprimir 10

# Eliminar elementos de la cola
print("Elemento removido:", q.remove())  # Debería imprimir 10
print("Elemento removido:", q.remove())  # Debería imprimir 20

# Verificar si la cola está vacía
print("¿La cola está vacía?", q.isEmpty())  # Debería imprimir False

# Verificar si la cola está llena
print("¿La cola está llena?", q.isFull())  # Debería imprimir False

# Consultar el número de elementos en la cola
print("Número de elementos en la cola:", q.size())  # Debería imprimir 1

# Consultar el tamaño de la cola
print("Tamaño de la cola:", q.size2())  # Debería imprimir 5
class Pila:
    def __init__(self, n):
        self.__arreglo = [0] * n
        self.__top = -1
        self.__n = n

    def push(self, e):
        if self.is_full():
            print("Pila llena")
        else:
            self.__top += 1
            self.__arreglo[self.__top] = e

    def pop(self):
        if self.is_empty():
            print("Pila vacía")
            return -1
        else:
            e = self.__arreglo[self.__top]
            self.__top -= 1
            return e

    def peek(self):
        return self.__arreglo[self.__top]

    def is_empty(self):
        return self.__top == -1

    def is_full(self):
        return self.__top == self.__n - 1

# Ejemplo de uso
pila = Pila(5)

# Insertar elementos en la pila
pila.push(1)
pila.push(2)
pila.push(3)
print("Elemento en la cima:", pila.peek())  # Debería imprimir 3

# Eliminar elementos de la pila
print("Elemento removido:", pila.pop())  # Debería imprimir 3
print("Elemento en la cima:", pila.peek())  # Debería imprimir 2

# Verificar si la pila está vacía
print("¿La pila está vacía?", pila.is_empty())  # Debería imprimir False

# Insertar más elementos en la pila
pila.push(4)
pila.push(5)
pila.push(6)  # Debería imprimir "Pila llena" porque la capacidad es 5

# Verificar si la pila está llena
print("¿La pila está llena?", pila.is_full())  # Debería imprimir True

# Eliminar todos los elementos de la pila
print("Elemento removido:", pila.pop())  # Debería imprimir 5
print("Elemento removido:", pila.pop())  # Debería imprimir 4
print("Elemento removido:", pila.pop())  # Debería imprimir 2
print("Elemento removido:", pila.pop())  # Debería imprimir 1
print("¿La pila está vacía?", pila.is_empty())  # Debería imprimir True
class Cola:
    def __init__(self, n):
        self.__arreglo = [0] * (n + 1)  # Arreglo para almacenar los elementos
        self.__inicio = 0
        self.__fin = 0
        self.__n = n

    def insert(self, e):
        if self.__fin == self.__n:
            print("Cola llena")
        else:
            self.__fin += 1
            self.__arreglo[self.__fin] = e

    def remove(self):  # Eliminar el elemento al frente de la cola
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

    def peek(self):  # Devuelve el dato que está en el frente de la cola
        return self.__arreglo[self.__inicio + 1]

    def isEmpty(self):  # Verifica si la cola está vacía
        return self.__inicio == self.__fin == 0

    def isFull(self):  # Verifica si la cola está llena
        return self.__fin == self.__n

    def size(self):  # Devuelve la cantidad de elementos en la cola
        return self.__fin - self.__inicio



def cribaEratostenes(n):
    primo = [True] * (n + 1)
    primo[0] = primo[1] = False 

    for i in range(2, int(n ** 0.5) + 1):
        if primo[i]:
            for j in range(i * i, n + 1, i):
                primo[j] = False

    return primo


A = Cola(4)
A.insert(22)
A.insert(5)
A.insert(10)
A.insert(11)

B = Cola(4)
C = Cola(4)

n = 22  

primo = cribaEratostenes(n)


while not A.isEmpty():
    numero = A.remove()
    if primo[numero]:
        B.insert(numero)  
    else:
        C.insert(numero)  


print("Cola B (Primos):", [B.remove() for _ in range(B.size())]) 
print("Cola C (No primos):", [C.remove() for _ in range(C.size())])  

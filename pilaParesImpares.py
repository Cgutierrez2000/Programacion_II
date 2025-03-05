# Definición de la clase Pila
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
        if self.is_empty():
            print("Pila vacía")
            return -1
        else:
            return self.__arreglo[self.__top]

    def is_empty(self):
        return self.__top == -1

    def is_full(self):
        return self.__top == self.__n - 1

    def size(self):
        return self.__top + 1

    def __str__(self):
        return str(self.__arreglo[:self.__top + 1])

A=Pila
A.push(17)
A.push(22)
A.push(7)
B=Pila()
C=Pila() 
while not A.is_empty():
    e=A.pop()
    if e%2==0:
        B.push(e)
    else:
        C.push(e)
print ("B....")
while not B.is_empty():
    print(B.pop())
print ("C....")
while not C.is_empty():
    print(C.pop())

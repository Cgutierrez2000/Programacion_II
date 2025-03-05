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


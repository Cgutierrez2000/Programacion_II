package recursoso;

public class Cola:
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

{
    
}

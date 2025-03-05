class Rectangulo:
    def __init__ (self, a, b):
        self.base= a
        self.altura=b
    def area(self):
        return self.base*self.altura
    def __str__ (self):
        return"{} {}".format(self.base,self.altura)
r1=Rectangulo(2,3)
print(r1)
print("Area=", r1.area())

#existen cambios a partir de aca#
class Rectangulo:
    def __init__ (self, a, b):
        self.__base= a #estamos declarando como privatos 
        self.__altura=b #ambos atributos
    def setBase(self,a):
        self.__base=a
    def setAltura(self, b):
        self.__altura=b #ambos atributos
    def area(self):
        return self.__base*self.__altura
    def __str__ (self):
        return"{} {}".format(self.__base,self.__altura)
r1=Rectangulo(2,3)
r1.setBase(6)# usampos el set para usar el privado cuando lo declaramos
r1.__base=6 ## con esto no cambia ls datos
r1.setAltura(7)
r1.altura=5 #con este si toma el 5 envesdel 2
print(r1)
print("Area=", r1.area())




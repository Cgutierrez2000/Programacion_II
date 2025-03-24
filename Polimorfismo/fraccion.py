class Fraccion:
    def __init__(self,a,b):
        self.__numerador = a
        self.__denominador = b
    '''
      c = a + b
      c.numerador = a.numerador * b.denominador +
      a.denominador * b.numerador
      c.denominador = a.denominador * b.denominador
    '''
    def __add__(self, o):
        a = self.__numerador * o.__denominador + \
           self.__denominador * o.__numerador
        b = self.__denominador * o.__denominador
        return Fraccion(a,b)
    '''
      c = a - b
      c.numerador = a.numerador * b.denominador -
        a.denominador * b.numerador
      c.denominador = a.denominador * b.denominador
    '''
    def __sub__(self, o):
        c = Fraccion(0,1)
        c.__numerador = self.__numerador * o.__denominador - \
           self.__denominador * o.__numerador
        c.__denominador = self.__denominador * o.__denominador
        return c
    def __str__(self):
        return "{}/{}". \
          format(self.__numerador,self.__denominador)
    
    

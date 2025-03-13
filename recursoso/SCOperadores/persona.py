class Persona:
    def __init__(self, nombre,edad):
        self.nombre = nombre
        self.edad = edad
    def __eq__(self, o):
        return self.edad == o.edad
    def __str__(self):
        return "Persona[{},{}]".format(self.nombre, self.edad)
a=Persona("juan",20)
b=Persona("ana",20)
print(a==b)

class Vector:
    def __init__(self,x,y):
        self.x = x
        self.y = y
    def __add__(self,o):
        return Vector (self.x + o.x, self.y+o.y)
        
    def __str__(self):
        return "vector[{},{}]".format(self.x, self.y)
v1=Vector(2,3)
v2=Vector(3,5)
v4=Vector(1,2 )
v3=v1+v2+v3
print("v3=",v3)
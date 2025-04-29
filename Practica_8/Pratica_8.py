class A:
    def __init__(self, x, z):
        self.x = x
        self.z = z
    def incrementarXZ(self):
        self.x += 1
        self.z += 1
    def incrementarZ(self):
        print("incrementando z(A)")
        self.z += 1
class B:
    def __init__(self, y, z):
        self.y = y
        self.z = z
    def incrementarYZ(self):
        self.y += 1
        self.z += 1
    def incrementarZ(self):
        print("incrementando z(B)")
        self.z += 1
class D(A, B):
    def __init__(self, x, y, z):
        self.x = x
        self.y = y
        self.z = z
    def incrementarXYZ(self):
        self.x += 1
        self.y += 1
        self.z += 1

    def mostrar(self):
        print(f"x = {self.x}, y = {self.y}, z = {self.z}")
if __name__ == "__main__":
    d = D(1, 2, 3)

    print("Valores iniciales:")
    d.mostrar()

    d.incrementarXYZ()
    print("\nDespués de incrementarXYZ:")
    d.mostrar()

    d.incrementarXZ()
    print("\nDespués de incrementarXZ:")
    d.mostrar()

    d.incrementarYZ()
    print("\nDespués de incrementarYZ:")
    d.mostrar()

    d.incrementarZ()
    print("\nDespués de incrementarZ:")
    d.mostrar()
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
    # Crear una instancia de la clase D
    d = D(1, 2, 3)

    # Mostrar valores iniciales
    print("Valores iniciales:")
    d.mostrar()

    # Incrementar x, y, z usando incrementarXYZ
    d.incrementarXYZ()
    print("\nDespués de incrementarXYZ:")
    d.mostrar()

    # Incrementar x y z usando incrementarXZ
    d.incrementarXZ()
    print("\nDespués de incrementarXZ:")
    d.mostrar()

    # Incrementar y y z usando incrementarYZ
    d.incrementarYZ()
    print("\nDespués de incrementarYZ:")
    d.mostrar()

    # Incrementar solo z usando incrementarZ
    d.incrementarZ()
    print("\nDespués de incrementarZ:")
    d.mostrar()
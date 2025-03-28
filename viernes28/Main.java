package viernes28.Veterinaria;

public class Main {

    public static void main(String[] args) {
        Dueño dueños[] = new Dueño[3];
        dueños[0] = new Dueño(12345678, 2020, "Juan");
        dueños[1] = new Dueño(87654321, 2021, "Maria");
        dueños[2] = new Dueño(11223344, 2022, "Pedro");

        Mascota mascotas[] = new Mascota[5];
        mascotas[0] = new Mascota(1, 2020, "Firulais", "Perro");
        mascotas[1] = new Mascota(2, 2021, "Miau", "Gato");
        mascotas[2] = new Mascota(3, 2022, "Pajarito", "Ave");
        mascotas[3] = new Mascota(4, 2023, "Tortuga", "Reptil");
        mascotas[4] = new Mascota(5, 2023, "Pececito", "Pez");

        Vacuna vacunas[] = new Vacuna[7];

        vacunas[0] = new Vacuna(12345678, 1, "V1");
        vacunas[1] = new Vacuna(12345678, 2, "V1");
        vacunas[2] = new Vacuna(87654321, 3, "V2");
        vacunas[3] = new Vacuna(87654321, 4, "V1");
        vacunas[4] = new Vacuna(11223344, 1, "V3");
        vacunas[5] = new Vacuna(11223344, 5, "V2");
        vacunas[6] = new Vacuna(11223344, 2, "V1");

        Veterinaria veterinaria = new Veterinaria(dueños, mascotas, vacunas);
        System.out.println("Mascotas con vacuna V1:");
        veterinaria.mostrarMascotasTipoVacuna("V1");s

    }
}
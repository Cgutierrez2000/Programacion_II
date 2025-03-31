public class Veterinaria{
    private Dueño dueños[];
    private Mascota mascotas[];
    private Vacuna vacunas[];

    public Veterinaria(Dueño[] dueños, Mascota[] mascotas, Vacuna[] vacunas){
        this.dueños = dueños;
        this.mascotas = mascotas;
        this.vacunas = vacunas;
    }

    public void mostrarMascotasTipoVacuna(String tipoV){
        for (int i = 0; i<vacunas.length; i++){
            if(vacunas[i].getTipoVacuna().equals(tipoV)){
                int ciM = vacunas[i].getCiMascota();
                for(int j = 0; i<mascotas.length;j++){
                    if(mascotas[j].getCod() == ciM){
                        mascotas[j].mostrar();
                    }
                }
            }
        }
    }


    
}
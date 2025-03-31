public class Vacuna{
    private int ciDueño, ciMascota;
    private String tipoVacuna;

    public Vacuna(int ciDueño, int ciMascota, String tipoVacuna){
        this.ciDueño = ciDueño;
        this.ciMascota = ciMascota;
        this.tipoVacuna = tipoVacuna;
    }

    public int getCiDueño() {
        return ciDueño;
    }

    public void setCiDueño(int ciDueño) {
        this.ciDueño = ciDueño;
    }

    public int getCiMascota() {
        return ciMascota;
    }

    public void setCiMascota(int ciMascota) {
        this.ciMascota = ciMascota;
    }

    public String getTipoVacuna() {
        return tipoVacuna;
    }

    public void setTipoVacuna(String tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }


}
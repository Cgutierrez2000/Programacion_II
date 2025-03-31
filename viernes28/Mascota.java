public class Mascota{
    private  int cod, año;
    private String nombre, raza;

    public Mascota(int cod, int año, String nombre, String raza){
        this.cod = cod;
        this.año = año;
        this.nombre = nombre;
        this.raza = raza;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }



}
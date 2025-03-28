public class Dueño{
    private int ci, añod;
    private String nomd;

    public Dueño(int ci, int añod, String nomd){
        this.ci = ci;
        this.añod = añod;
        this.nomd = nomd;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getAñod() {
        return añod;
    }

    public void setAñod(int añod) {
        this.añod = añod;
    }

    public String getNomd() {
        return nomd;
    }

    public void setNomd(String nomd) {
        this.nomd = nomd;
    }


}
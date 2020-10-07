package balicek;

public class osoba {

     private String meno;
    private int vek;
   private boolean jeVskole;
    String pohlavie;

    public osoba(){}

    public osoba(String jehoMeno, int jehoVek, boolean jeVskole) {
        this.meno = jehoMeno;
        this.vek = jehoVek;
        this.jeVskole = jeVskole;
        pohlavie = "MUZ";
    }

    public osoba(int jejVek, boolean jeVskole, String jejMeno) {
        this.vek = jejVek;
        this.jeVskole = jeVskole;
        this.meno = jejMeno;
        this.pohlavie = "ZENA";
    }
    public void jevskole(boolean jeVskole){
        this.jeVskole = jeVskole;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public boolean isJeVskole() {
        return jeVskole;
    }

    public void setJeVskole(boolean jeVskole) {
        this.jeVskole = jeVskole;
    }

    public String getPohlavie() {
        return pohlavie;
    }

    public void setPohlavie(String pohlavie) {
        this.pohlavie = pohlavie;
    }

    @Override
    public String toString() {
        return "osoba{" +
                "meno='" + meno + '\'' +
                ", vek=" + vek +
                ", jeVskole=" + jeVskole +
                ", pohlavie='" + pohlavie + '\'' +
                '}';
    }
}

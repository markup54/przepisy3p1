package pl.zabrze.zs10.myapplicationlisty3p1;
public class Przepis {
    private String nazwaPrzepisu;
    private String kategoria;
    private String skladniki;
    private int idObrazka;
    private int czasWykonania;
    private int polubienia;
    private int liczbaOsob;
    private double trudnosc;

    public Przepis(String nazwaPrzepisu, String kategoria, String skladniki, int idObrazka, int czasWykonania, int polubienia, int liczbaOsob, double trudnosc) {
        this.nazwaPrzepisu = nazwaPrzepisu;
        this.kategoria = kategoria;
        this.skladniki = skladniki;
        this.idObrazka = idObrazka;
        this.czasWykonania = czasWykonania;
        this.polubienia = polubienia;
        this.liczbaOsob = liczbaOsob;
        this.trudnosc = trudnosc;
    }

    @Override
    public String toString() {
        return nazwaPrzepisu ;
    }

    public void setPolubienia() {
        this.polubienia++;
    }

    public String getKategoria() {
        return kategoria;
    }

    public String getSkladniki() {
        return skladniki;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public int getCzasWykonania() {
        return czasWykonania;
    }

    public String getNazwaPrzepisu() {
        return nazwaPrzepisu;
    }

    public int getPolubienia() {
        return polubienia;
    }

    public int getLiczbaOsob() {
        return liczbaOsob;
    }

    public double getTrudnosc() {
        return trudnosc;
    }
}

package pl.edu.wszib.savingtheworld.dto;

public class FakturaDTO {

    double kwota;
    String tytuł;

    public FakturaDTO (double kwota, String tytuł){
        this.kwota = kwota;
        this.tytuł = tytuł;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public String getTytuł() {
        return tytuł;
    }

    public void setTytuł(String tytuł) {
        this.tytuł = tytuł;
    }
}

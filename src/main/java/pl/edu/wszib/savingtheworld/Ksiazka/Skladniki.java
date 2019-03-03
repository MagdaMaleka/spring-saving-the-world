package pl.edu.wszib.savingtheworld.Ksiazka;

import javax.persistence.*;

@Entity
@Table
public class Skladniki {

    @Id
    @GeneratedValue
    Long id;
    @OneToOne (fetch = FetchType.EAGER, optional = false)
    TypSkladnika typSkladnika;
    @Column(nullable = false)
    int ilosc;
    @ManyToOne (fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "przepis_id")
    Przepis przepis;

/*    public Skladniki(TypSkladnika typSkladnika, int ilosc, Przepis przepis){
        this.typSkladnika = typSkladnika;
        this.ilosc = ilosc;
        this.przepis = przepis;
    }*/

    public Long getId() {
        return id;
    }

    public TypSkladnika getTypSkladnika() {
        return typSkladnika;
    }

    public int getIlosc() {
        return ilosc;
    }

    public Przepis getPrzepis() {
        return przepis;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTypSkladnika(TypSkladnika typSkladnika) {
        this.typSkladnika = typSkladnika;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public void setPrzepis(Przepis przepis) {
        this.przepis = przepis;
    }
}

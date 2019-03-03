package pl.edu.wszib.savingtheworld.Ksiazka;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Przepis {

    @Id
    @GeneratedValue
    Long id;
    @Column(nullable = false)
    String tytul;
    @OneToMany(mappedBy = "przepis")
    List<Skladniki> skladniki;
    @ManyToOne
    @JoinColumn (name = "ksiazka_id")
    KsiazkaKucharska ksiazkaKucharska;

/*   public Przepis(){
   }

   public Przepis (String tytul, List<Skladniki> skladniki, KsiazkaKucharska ksiazkaKucharska){
       this.tytul = tytul;
       this.skladniki = skladniki;
       this.ksiazkaKucharska = ksiazkaKucharska;
   }*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public List<Skladniki> getSkladniki() {
        return skladniki;
    }

    public void setSkladniki(List<Skladniki> skladniki) {
        this.skladniki = skladniki;
    }

    public KsiazkaKucharska getKsiazkaKucharska() {
        return ksiazkaKucharska;
    }

    public void setKsiazkaKucharska(KsiazkaKucharska ksiazkaKucharska) {
        this.ksiazkaKucharska = ksiazkaKucharska;
    }
}

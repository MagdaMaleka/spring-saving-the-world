package pl.edu.wszib.savingtheworld.Ksiazka;

import javax.persistence.*;

@Entity
@Table
public class TypSkladnika {

    @Id
    @GeneratedValue
    Long id;
    @Column(unique = true, nullable = false )
    String nazwa; //unikalna

    public Long getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}

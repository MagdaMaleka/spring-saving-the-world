package pl.edu.wszib.savingtheworld.Ksiazka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Random;

@Component
public class InitKsiazkaComponent {

    @Autowired
    TypSkladnikaDAO typSkladnikaDAO;

    @Autowired
    SkladnikiDAO skladnikiDAO;

    @Autowired
    PrzepisDAO przepisDAO;

    @Autowired
    KsiazkaKucharskaDAO ksiazkaKucharskaDAO;


    @PostConstruct
    public void init(){

        for (int i = 0; i < 10; ++i) {
            TypSkladnika typSkladnika = new TypSkladnika();
            typSkladnika.setNazwa("skladnik " + i);
            typSkladnikaDAO.save(typSkladnika);
        }

        KsiazkaKucharska ksiazkaKucharska = new KsiazkaKucharska();
        ksiazkaKucharska.setTytul("Moja Ksiazka");
        ksiazkaKucharska = ksiazkaKucharskaDAO.save(ksiazkaKucharska);

        Przepis przepis = new Przepis();
        przepis.setKsiazkaKucharska(ksiazkaKucharska);
        przepis.setTytul("Moj Przepis");
        przepis = przepisDAO.save(przepis);

        List<TypSkladnika> typSkladnikas = typSkladnikaDAO.findAll();
        for(TypSkladnika typ : typSkladnikas){
            Skladniki skladniki = new Skladniki();
            skladniki.setIlosc(new Random(). nextInt(5) + 1);
            skladniki.setTypSkladnika(typ);
            skladniki.setPrzepis(przepis);
            skladnikiDAO.save(skladniki);
        }

        System.out.println(" ");


    }
}

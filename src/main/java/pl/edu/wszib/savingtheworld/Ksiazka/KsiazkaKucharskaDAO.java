package pl.edu.wszib.savingtheworld.Ksiazka;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KsiazkaKucharskaDAO extends OurCrudRepository<KsiazkaKucharska, Long> {
}

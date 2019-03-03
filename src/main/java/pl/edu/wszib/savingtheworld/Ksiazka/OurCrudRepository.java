package pl.edu.wszib.savingtheworld.Ksiazka;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface OurCrudRepository<T, ID> extends CrudRepository<T, ID> {

    List<T> findAll();
}

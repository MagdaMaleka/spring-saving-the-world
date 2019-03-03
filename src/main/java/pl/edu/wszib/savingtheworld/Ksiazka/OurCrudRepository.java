package pl.edu.wszib.savingtheworld.Ksiazka;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

@NoRepositoryBean
public interface OurCrudRepository<T, ID> extends PagingAndSortingRepository<T, ID> {

    List<T> findAll();
}

package pl.edu.wszib.savingtheworld.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FakturaDAO extends CrudRepository <Faktura, Long> {

    List<Faktura> findAll();
}

/*
package pl.edu.wszib.savingtheworld.dao;


import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.savingtheworld.dto.PodatnikDTO;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/podatnik")
public class PodatnikController {

    @Autowired

    PodatnikDao dao;

    @Autowired
    Mapper mapper;

    @GetMapping
    public Podatnik podatnik (@RequestParam Long pesel) {
        return dao.findById(pesel)
                .map (podatnik -> mapper.map(podatnik, PodatnikDTO.class))
                .orElse(null);

    }

    @GetMapping("/all")
    public List <Podatnik> podatnicy() {
        return StreamSupport.stream(dao.findAll().spliterator(), false)
                .map(podatnik -> mapper.map(podatnik, PodatnikDTO.class))
                .collect(Collectors.toList());
    }


    @PostMapping
    public Podatnik zapisz(Podatnik podatnik) {
        return mapper.map(dao.save(mapper.map(podatnik, Podatnik.class)), PodatnikDTO.class);

    }

    @DeleteMapping
    public Podatnik usun (Long pesel) {
        Podatnik podatnik = dao.findById(pesel).orElse(null);
        dao.deleteById(pesel);
        return mapper.map(podatnik, PodatnikDTO.class);
    }
}
*/

package com.example.Services;
import com.example.Model.Liga;
import com.example.Model.Temporada;
import com.example.Repository.LigaRepository;
import com.example.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jhipster on 29/10/15.
 */
@Transactional
@Service
public class LigaService {

    @Autowired
    private TemporadaRepository temporadaRepository;

    @Autowired
    private LigaRepository ligaRepository;

    public void testLiga(){

        Liga liga1 = new Liga();
        liga1.setNombre("BBVA");
        ligaRepository.save(liga1);

        Temporada temporada1 = temporadaRepository.findOne(1L);
        temporada1.setLiga(liga1);
        temporadaRepository.save(temporada1);

        Temporada temporada2 = temporadaRepository.findOne(2L);
        temporada2.setLiga(liga1);
        temporadaRepository.save(temporada2);
    }
}

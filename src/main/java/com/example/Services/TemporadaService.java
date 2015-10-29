package com.example.Services;
import com.example.Model.Temporada;
import com.example.Repository.TemporadaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jhipster on 29/10/15.
 */
@Transactional
@Service
public class TemporadaService {

    private TemporadaRepository temporadaRepository;

    public void testTemporada(){

        Temporada temporada1 = new Temporada();
        temporada1.setNombre("2015-2016");
        temporadaRepository.save(temporada1);

        Temporada temporada2 = new Temporada();
        temporada2.setNombre("2014-2015");
        temporadaRepository.save(temporada2);

    }
}

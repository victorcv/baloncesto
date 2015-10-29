package com.example.Services;
import com.example.Model.Liga;
import com.example.Repository.LigaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jhipster on 29/10/15.
 */
@Transactional
@Service
public class LigaService {


    private LigaRepository ligaRepository;

    public void testLiga(){

        Liga liga1 = new Liga();
        liga1.setNombre("BBVA");
        ligaRepository.save(liga1);
    }
}

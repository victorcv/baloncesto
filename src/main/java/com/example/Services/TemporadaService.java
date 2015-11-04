package com.example.Services;
import com.example.Model.Equipo;
import com.example.Model.Temporada;
import com.example.Model.Liga;
import com.example.Repository.EquipoRepository;
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
public class TemporadaService {

    @Autowired
    private LigaRepository ligaRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private TemporadaRepository temporadaRepository;

    public void testTemporada(){

        Temporada temporada1 = new Temporada();
        temporada1.setNombre("2015-2016");
        temporadaRepository.save(temporada1);


        Temporada temporada2 = new Temporada();
        temporada2.setNombre("2014-2015");
        temporadaRepository.save(temporada2);

        Equipo e1 = equipoRepository.findOne(1L);
        temporada1.getEquipos().add(e1);


        Equipo e2 = equipoRepository.findOne(2L);
        temporada1.getEquipos().add(e2);


        Equipo e3 = equipoRepository.findOne(3L);
        temporada1.getEquipos().add(e3);


        Equipo e4 = equipoRepository.findOne(4L);
        temporada1.getEquipos().add(e4);


        Equipo e5 = equipoRepository.findOne(5L);
        temporada1.getEquipos().add(e5);

        temporadaRepository.save(temporada1);

        //como ya hemos cogido los equipos no hace falta crear otro objeto para el mismo

        temporada2.getEquipos().add(e1);
        temporada2.getEquipos().add(e2);
        temporada2.getEquipos().add(e3);
        temporada2.getEquipos().add(e4);
        temporada2.getEquipos().add(e5);

        temporadaRepository.save(temporada2);



    }
}

package com.example.Services;

import com.example.Model.Jugador;
import com.example.Repository.JugadorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Model.Equipo;
import com.example.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import java.util.List;

@Transactional
@Service
public class EquipoService {
    @Autowired
    private JugadorRepository jugadorRepository;
    @Autowired
    private EquipoRepository equipoRepository;

    public void testEquipo(){
        Calendar Calendar=GregorianCalendar.getInstance();
        Calendar.set(1996, Calendar.AUGUST, 29);

        Equipo equipo1 = new Equipo();
        equipo1.setNombre("FC Varril");
        equipo1.setLocalidad("Barcelona");
        equipo1.setFechacreacion(Calendar.getTime());
        Jugador jugador=jugadorRepository.findOne(1L);
        jugador.setEquipo(equipo1);
        jugadorRepository.save(jugador);
        equipoRepository.save(equipo1);
    }
}

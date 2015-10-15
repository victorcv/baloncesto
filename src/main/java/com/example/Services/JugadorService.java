package com.example.Services;

import com.example.Model.Jugador;
import com.example.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import java.util.List;

@Transactional
@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    public void testJugador(){

        Calendar Calendar=GregorianCalendar.getInstance();
        Calendar.set(1996, Calendar.AUGUST, 29);

        Jugador jugador1 = new Jugador();
        jugador1.setNombre("Flamingo");
        jugador1.setCanastas(38);
        jugador1.setAsistencias(42);
        jugador1.setFecha(Calendar.getTime());
        jugador1.setPosicion("alero");
        jugadorRepository.save(jugador1);

        Calendar.set(1997, Calendar.MAY, 15);
        Jugador jugador2 = new Jugador();
        jugador2.setNombre("Faker");
        jugador2.setCanastas(13);
        jugador2.setAsistencias(12);
        jugador2.setFecha(Calendar.getTime());
        jugador2.setPosicion("base");
        jugadorRepository.save(jugador2);

        Calendar.set(1997, Calendar.FEBRUARY, 15);
        Jugador jugador3 = new Jugador();
        jugador3.setNombre("Real Bombastic");
        jugador3.setCanastas(46);
        jugador3.setAsistencias(28);
        jugador3.setFecha(Calendar.getTime());
        jugador3.setPosicion("pivot");
        jugadorRepository.save(jugador3);

        Calendar.set(1997, Calendar.JULY, 15);
        Jugador jugador4 = new Jugador();
        jugador4.setNombre("Captain Julius");
        jugador4.setCanastas(45);
        jugador4.setAsistencias(22);
        jugador4.setFecha(Calendar.getTime());
        jugador4.setPosicion("base");
        jugadorRepository.save(jugador4);

        Calendar.set(2005, Calendar.JUNE, 15);
        Jugador jugador5= new Jugador();
        jugador5.setNombre("Black");
        jugador5.setCanastas(20);
        jugador5.setAsistencias(50);
        jugador5.setFecha(Calendar.getTime());
        jugador5.setPosicion("pivot");
        jugadorRepository.save(jugador5);

        Calendar.set(2000, Calendar.DECEMBER,20);
        System.out.println(jugadorRepository.findByNombreContaining("as"));
        System.out.println(jugadorRepository.findByCanastasGreaterThanEqual(15));
        System.out.println(jugadorRepository.findByAsistenciasBetween(20, 40));
        System.out.println(jugadorRepository.findByPosicion("base"));
        System.out.println(jugadorRepository.findByFechaBefore(Calendar.getTime()));
        System.out.println(jugadorRepository.findByCanastasGreaterThanEqualAndFechaBefore(30, Calendar.getTime()));



    }
}

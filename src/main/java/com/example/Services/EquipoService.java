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
        equipoRepository.save(equipo1);
        //jugadores del equipo 1
        //el findOne es el que pilla el jugador con el id  da igual el nombre de la clase
        Jugador jugador1=jugadorRepository.findOne(1L);
        jugador1.setEquipo(equipo1);
        jugadorRepository.save(jugador1);

        Jugador jugador2=jugadorRepository.findOne(2L);
        jugador2.setEquipo(equipo1);
        jugadorRepository.save(jugador2);

        Jugador jugador3=jugadorRepository.findOne(3L);
        jugador3.setEquipo(equipo1);
        jugadorRepository.save(jugador3);

        Jugador jugador4=jugadorRepository.findOne(4L);
        jugador4.setEquipo(equipo1);
        jugadorRepository.save(jugador4);

        Jugador jugador5=jugadorRepository.findOne(5L);
        jugador5.setEquipo(equipo1);
        jugadorRepository.save(jugador5);


        //EQUIPO2

        Equipo equipo2 = new Equipo();
        equipo2.setNombre("FC Meme");
        equipo2.setLocalidad("Barcelona");
        equipo2.setFechacreacion(Calendar.getTime());
        equipoRepository.save(equipo2);

        Jugador jugador6=jugadorRepository.findOne(6L);
        jugador6.setEquipo(equipo2);
        jugadorRepository.save(jugador6);

        Jugador jugador7=jugadorRepository.findOne(7L);
        jugador7.setEquipo(equipo2);
        jugadorRepository.save(jugador7);

        Jugador jugador8=jugadorRepository.findOne(8L);
        jugador8.setEquipo(equipo2);
        jugadorRepository.save(jugador8);

        Jugador jugador9=jugadorRepository.findOne(9L);
        jugador9.setEquipo(equipo2);
        jugadorRepository.save(jugador9);

        Jugador jugador10=jugadorRepository.findOne(10L);
        jugador10.setEquipo(equipo2);
        jugadorRepository.save(jugador10);

        //EQUIPO3

        Equipo equipo3 = new Equipo();
        equipo3.setNombre("FC Sal");
        equipo3.setLocalidad("Zaragoza");
        equipo3.setFechacreacion(Calendar.getTime());
        equipoRepository.save(equipo3);

        Jugador jugador11=jugadorRepository.findOne(11L);
        jugador11.setEquipo(equipo3);
        jugadorRepository.save(jugador11);

        Jugador jugador12=jugadorRepository.findOne(12L);
        jugador12.setEquipo(equipo3);
        jugadorRepository.save(jugador12);

        Jugador jugador13=jugadorRepository.findOne(13L);
        jugador13.setEquipo(equipo3);
        jugadorRepository.save(jugador13);

        Jugador jugador14=jugadorRepository.findOne(14L);
        jugador14.setEquipo(equipo3);
        jugadorRepository.save(jugador14);

        Jugador jugador15=jugadorRepository.findOne(15L);
        jugador15.setEquipo(equipo3);
        jugadorRepository.save(jugador15);

        //EQUIPO4

        Equipo equipo4 = new Equipo();
        equipo4.setNombre("FC Tir");
        equipo4.setLocalidad("Barcelona");
        equipo4.setFechacreacion(Calendar.getTime());
        equipoRepository.save(equipo4);

        Jugador jugador16=jugadorRepository.findOne(16L);
        jugador16.setEquipo(equipo4);
        jugadorRepository.save(jugador16);

        Jugador jugador17=jugadorRepository.findOne(17L);
        jugador17.setEquipo(equipo4);
        jugadorRepository.save(jugador2);

        Jugador jugador18=jugadorRepository.findOne(18L);
        jugador18.setEquipo(equipo4);
        jugadorRepository.save(jugador18);

        Jugador jugador19=jugadorRepository.findOne(19L);
        jugador19.setEquipo(equipo4);
        jugadorRepository.save(jugador19);

        Jugador jugador20=jugadorRepository.findOne(20L);
        jugador20.setEquipo(equipo4);
        jugadorRepository.save(jugador20);


        //EQUIPO5
        Equipo equipo5 = new Equipo();
        equipo5.setNombre("FC Glimpse");
        equipo5.setLocalidad("Barcelona");
        equipo5.setFechacreacion(Calendar.getTime());
        equipoRepository.save(equipo5);

        Jugador jugador21=jugadorRepository.findOne(21L);
        jugador21.setEquipo(equipo5);
        jugadorRepository.save(jugador21);

        Jugador jugador22=jugadorRepository.findOne(22L);
        jugador22.setEquipo(equipo5);
        jugadorRepository.save(jugador22);

        Jugador jugador23=jugadorRepository.findOne(23L);
        jugador23.setEquipo(equipo5);
        jugadorRepository.save(jugador23);

        Jugador jugador24=jugadorRepository.findOne(24L);
        jugador24.setEquipo(equipo5);
        jugadorRepository.save(jugador24);

        Jugador jugador25=jugadorRepository.findOne(25L);
        jugador25.setEquipo(equipo5);
        jugadorRepository.save(jugador25);

        //jugador5.setEquipo((Equipo) equipoRepository.findByNombre("FC Varril"));
        System.out.println("LOCALIDAD");
        System.out.println(equipoRepository.findByLocalidad("Zaragoza"));
        System.out.println("TOP DE CANASTAS");
        System.out.println(jugadorRepository.findTopByOrderByCanastasDesc());
        System.out.println("JUGADORES CON LA MISMA POSICION DEL MISMO EQUIPO");
        System.out.println(jugadorRepository.findByEquipoNombreAndPosicion("FC Sal", "pivot"));
        System.out.println("TOP 5 DE ASISTENCIAS");
        System.out.println(jugadorRepository.findFirst5ByOrderByAsistenciasDesc());
        System.out.println("JUGADORES DEL MISMO EQUIPO");
        System.out.println(jugadorRepository.findByEquipoNombre("FC Sal"));
        System.out.println("JUGADOR QUE MAS CANASTAS HA METIDO DEL EQUIPO");

        /*
        * findByEquipoNombre(String nam);
    public List<Jugador> findTopByOrderByCanastasDesc();
    public List<Jugador> findFirst5ByOrderByAsistenciasDesc();
        *
        * */
    }
}

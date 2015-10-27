package com.example.Services;
import com.example.Model.Equipo;
import com.example.Repository.EquipoRepository;
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

        //5 up

        Calendar.set(2005, Calendar.JUNE, 15);
        Jugador jugador6= new Jugador();
        jugador6.setNombre("Black2");
        jugador6.setCanastas(20);
        jugador6.setAsistencias(50);
        jugador6.setFecha(Calendar.getTime());
        jugador6.setPosicion("pivot");
        jugadorRepository.save(jugador6);

        Calendar.set(2005, Calendar.JUNE, 15);
        Jugador jugador7= new Jugador();
        jugador7.setNombre("Black3");
        jugador7.setCanastas(20);
        jugador7.setAsistencias(50);
        jugador7.setFecha(Calendar.getTime());
        jugador7.setPosicion("pivot");
        jugadorRepository.save(jugador7);

        Calendar.set(2005, Calendar.JUNE, 15);
        Jugador jugador8= new Jugador();
        jugador8.setNombre("Black4");
        jugador8.setCanastas(20);
        jugador8.setAsistencias(50);
        jugador8.setFecha(Calendar.getTime());
        jugador8.setPosicion("pivot");
        jugadorRepository.save(jugador8);

        Calendar.set(2005, Calendar.JUNE, 15);
        Jugador jugador9= new Jugador();
        jugador9.setNombre("Black5");
        jugador9.setCanastas(20);
        jugador9.setAsistencias(50);
        jugador9.setFecha(Calendar.getTime());
        jugador9.setPosicion("pivot");
        jugadorRepository.save(jugador9);

        Calendar.set(2005, Calendar.JUNE, 15);
        Jugador jugador10= new Jugador();
        jugador10.setNombre("Black6");
        jugador10.setCanastas(20);
        jugador10.setAsistencias(50);
        jugador10.setFecha(Calendar.getTime());
        jugador10.setPosicion("pivot");
        jugadorRepository.save(jugador10);
        //10 up
        Calendar.set(2005, Calendar.JUNE, 15);
        Jugador jugador11= new Jugador();
        jugador11.setNombre("Black7");
        jugador11.setCanastas(20);
        jugador11.setAsistencias(50);
        jugador11.setFecha(Calendar.getTime());
        jugador11.setPosicion("pivot");
        jugadorRepository.save(jugador11);

        Calendar.set(2005, Calendar.JUNE, 15);
        Jugador jugador12= new Jugador();
        jugador12.setNombre("Black8");
        jugador12.setCanastas(20);
        jugador12.setAsistencias(50);
        jugador12.setFecha(Calendar.getTime());
        jugador12.setPosicion("pivot");
        jugadorRepository.save(jugador12);

        Calendar.set(2005, Calendar.JUNE, 15);
        Jugador jugador13= new Jugador();
        jugador13.setNombre("Black9");
        jugador13.setCanastas(20);
        jugador13.setAsistencias(50);
        jugador13.setFecha(Calendar.getTime());
        jugador13.setPosicion("pivot");
        jugadorRepository.save(jugador13);

        Calendar.set(2005, Calendar.JUNE, 15);
        Jugador jugador14= new Jugador();
        jugador14.setNombre("Black10");
        jugador14.setCanastas(20);
        jugador14.setAsistencias(50);
        jugador14.setFecha(Calendar.getTime());
        jugador14.setPosicion("pivot");
        jugadorRepository.save(jugador14);

        Calendar.set(2005, Calendar.JUNE, 15);
        Jugador jugador15= new Jugador();
        jugador15.setNombre("Black11");
        jugador15.setCanastas(20);
        jugador15.setAsistencias(50);
        jugador15.setFecha(Calendar.getTime());
        jugador15.setPosicion("pivot");
        jugadorRepository.save(jugador15);
        //15 up
        Calendar.set(2005, Calendar.JUNE, 15);
        Jugador jugador16= new Jugador();
        jugador16.setNombre("Black12");
        jugador16.setCanastas(20);
        jugador16.setAsistencias(50);
        jugador16.setFecha(Calendar.getTime());
        jugador16.setPosicion("pivot");
        jugadorRepository.save(jugador16);

        Calendar.set(2005, Calendar.JUNE, 15);
        Jugador jugador17= new Jugador();
        jugador17.setNombre("Black13");
        jugador17.setCanastas(20);
        jugador17.setAsistencias(50);
        jugador17.setFecha(Calendar.getTime());
        jugador17.setPosicion("pivot");
        jugadorRepository.save(jugador17);

        Calendar.set(2005, Calendar.JUNE, 15);
        Jugador jugador18= new Jugador();
        jugador18.setNombre("Black14");
        jugador18.setCanastas(20);
        jugador18.setAsistencias(50);
        jugador18.setFecha(Calendar.getTime());
        jugador18.setPosicion("pivot");
        jugadorRepository.save(jugador18);

        Calendar.set(2005, Calendar.JUNE, 15);
        Jugador jugador19= new Jugador();
        jugador19.setNombre("Black15");
        jugador19.setCanastas(20);
        jugador19.setAsistencias(50);
        jugador19.setFecha(Calendar.getTime());
        jugador19.setPosicion("pivot");
        jugadorRepository.save(jugador19);

        Calendar.set(2005, Calendar.JUNE, 15);
        Jugador jugador20= new Jugador();
        jugador20.setNombre("Black16");
        jugador20.setCanastas(20);
        jugador20.setAsistencias(50);
        jugador20.setFecha(Calendar.getTime());
        jugador20.setPosicion("pivot");
        jugadorRepository.save(jugador20);
        //20 up
        Calendar.set(2005, Calendar.JUNE, 15);
        Jugador jugador21= new Jugador();
        jugador21.setNombre("Black17");
        jugador21.setCanastas(20);
        jugador21.setAsistencias(50);
        jugador21.setFecha(Calendar.getTime());
        jugador21.setPosicion("pivot");
        jugadorRepository.save(jugador21);

        Calendar.set(2005, Calendar.JUNE, 15);
        Jugador jugador22= new Jugador();
        jugador22.setNombre("Black18");
        jugador22.setCanastas(20);
        jugador22.setAsistencias(50);
        jugador22.setFecha(Calendar.getTime());
        jugador22.setPosicion("pivot");
        jugadorRepository.save(jugador22);

        Calendar.set(2005, Calendar.JUNE, 15);
        Jugador jugador23= new Jugador();
        jugador23.setNombre("Black19");
        jugador23.setCanastas(17);
        jugador23.setAsistencias(57);
        jugador23.setFecha(Calendar.getTime());
        jugador23.setPosicion("base");
        jugadorRepository.save(jugador23);

        Calendar.set(2005, Calendar.JUNE, 15);
        Jugador jugador24= new Jugador();
        jugador24.setNombre("Black20");
        jugador24.setCanastas(20);
        jugador24.setAsistencias(50);
        jugador24.setFecha(Calendar.getTime());
        jugador24.setPosicion("alero");
        jugadorRepository.save(jugador24);

        Calendar.set(2005, Calendar.JUNE, 15);
        Jugador jugador25= new Jugador();
        jugador25.setNombre("Black21");
        jugador25.setCanastas(23);
        jugador25.setAsistencias(5);
        jugador25.setFecha(Calendar.getTime());
        jugador25.setPosicion("pivot");
        jugadorRepository.save(jugador25);

        //25

        Calendar.set(2000, Calendar.DECEMBER,20);
        System.out.println(jugadorRepository.findByNombreContaining("as"));
        System.out.println(jugadorRepository.findByCanastasGreaterThanEqual(15));
        System.out.println(jugadorRepository.findByAsistenciasBetween(20, 40));
        System.out.println(jugadorRepository.findByPosicion("base"));
        System.out.println(jugadorRepository.findByFechaBefore(Calendar.getTime()));
        System.out.println(jugadorRepository.findByCanastasGreaterThanEqualAndFechaBefore(30, Calendar.getTime()));



    }
}

package com.example;

import com.example.Model.Equipo;
import com.example.Model.Temporada;
import com.example.Services.EquipoService;
import com.example.Services.JugadorService;
import com.example.Services.LigaService;
import com.example.Services.TemporadaService;
import com.sun.media.jfxmedia.events.PlayerStateEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BaloncestoApplication {

    private static JugadorService jugadorService;
    private static EquipoService equipoService;
    private static LigaService ligaService;
    private static TemporadaService temporadaService;
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BaloncestoApplication.class, args);

        jugadorService = context.getBean(JugadorService.class);
        jugadorService.testJugador();

        equipoService = context.getBean(EquipoService.class);
        equipoService.testEquipo();

        temporadaService = context.getBean(TemporadaService.class);
        temporadaService.testTemporada();

        ligaService = context.getBean(LigaService.class);
        ligaService.testLiga();


    }
}

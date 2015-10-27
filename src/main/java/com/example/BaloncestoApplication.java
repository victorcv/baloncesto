package com.example;

import com.example.Model.Equipo;
import com.example.Services.EquipoService;
import com.example.Services.JugadorService;
import com.sun.media.jfxmedia.events.PlayerStateEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BaloncestoApplication {

    private static JugadorService jugadorService;
    private static EquipoService equipoService;
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BaloncestoApplication.class, args);

        jugadorService = context.getBean(JugadorService.class);
        jugadorService.testJugador();

        equipoService = context.getBean(EquipoService.class);
        equipoService.testEquipo();
    }
}

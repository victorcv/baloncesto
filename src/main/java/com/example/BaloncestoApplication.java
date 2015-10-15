package com.example;

import com.example.Services.JugadorService;
import com.sun.media.jfxmedia.events.PlayerStateEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BaloncestoApplication {

    private static JugadorService jugadorService;
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BaloncestoApplication.class, args);
        jugadorService = context.getBean(JugadorService.class);
        jugadorService.testJugador();
    }
}

package com.example.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jhipster on 10/11/15.
 */
@RestController //SIRVE PARA SABER QUE ES UN CONTROLADOR
@RequestMapping("/jugadores") //el jugadores es el path de la url en este caso
public class JugadorController {

    @Autowired
    private DeveloperRepository developerRepository;
}
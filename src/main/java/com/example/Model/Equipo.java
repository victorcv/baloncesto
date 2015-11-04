package com.example.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;
import java.util.HashSet;

/**
 * Created by jhipster on 21/10/15.
 */
@Entity
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nombre;

    @OneToMany(mappedBy = "equipo")
    private Set<Jugador> jugadors = new HashSet<>();

    @ManyToMany(mappedBy = "equipos")
    private Set<Temporada>  temporadas = new HashSet<>();

    @Column
    private String localidad;

    @Column
    private Date fechacreacion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Jugador> getJugadors() {
        return jugadors;
    }

    public void setJugadors(Set<Jugador> jugadors) {
        this.jugadors = jugadors;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public Set<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Set<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", jugadors=" + jugadors +
                ", temporadas=" + temporadas +
                ", localidad='" + localidad + '\'' +
                ", fechacreacion=" + fechacreacion +
                '}';
    }
}

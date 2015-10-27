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
    private Set<Jugador> jugador = new HashSet<>();

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

    public Set<Jugador> getJugador() {
        return jugador;
    }

    public void setJugador(Set<Jugador> jugador) {
        this.jugador = jugador;
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

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", jugador=" + jugador +
                ", localidad='" + localidad + '\'' +
                ", fechacreacion=" + fechacreacion +
                '}';
    }
}

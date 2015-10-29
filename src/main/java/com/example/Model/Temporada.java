package com.example.Model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Temporada {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nombre;

    @ManyToOne
    private Liga liga;

    @ManyToMany(mappedBy = "temporadas")
    private Set<Equipo> projects = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreTemporada() {
        return nombre;
    }

    public void setNombreTemporada(String nombreTemporada) {
        this.nombre = nombreTemporada;
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "id=" + id +
                ", nombreTemporada='" + nombre + '\'' +
                '}';
    }
}

package com.example.Model;


        import javax.persistence.*;
        import javax.validation.constraints.Min;
        import javax.validation.constraints.NotNull;
        import javax.validation.constraints.Size;
        import java.util.HashSet;
        import java.util.Set;


@Entity
public class Liga {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nombre;

    @OneToMany(mappedBy = "liga")
    private Set<Jugador> temporadas = new HashSet<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Jugador> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Set<Jugador> temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return "Liga{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", temporadas=" + temporadas +
                '}';
    }
}

package com.example.Repository;

import com.example.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Date;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
/**
 * Created by jhipster on 8/10/15.
 */
@Repository
public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long>{
//EJ 1
    public List<Jugador> findByEquipoNombre(String nam);
    public List<Jugador> findTopByOrderByCanastasDesc();
    public List<Jugador> findFirst5ByOrderByAsistenciasDesc();
    public List<Jugador> findByEquipoNombreAndPosicion(String nam, String pos);

    //Devuelve el jugador que más canastas ha realizado de un equipo determinado como parámetro.
    @Query("SELECT j FROM Jugador j where j.equipo.nombre = :equipoNombre order by j.canastas desc")
    List<Jugador> findFromEquipoByCanastas(@Param("equipoNombre") String equipoNombre);

    //EJ 2
    public List<Jugador> findByNombreContaining(String algo);
    public List<Jugador> findByCanastasGreaterThanEqual(Integer Canastas);
    public List<Jugador> findByAsistenciasBetween(Integer MinAsistencias, Integer maxAsistencias );
    public List<Jugador> findByPosicion(String posicion);
    public List<Jugador> findByFechaBefore(Date fecha);
    public List<Jugador> findByCanastasGreaterThanEqualAndFechaBefore(Integer Canastas, Date fecha);


}

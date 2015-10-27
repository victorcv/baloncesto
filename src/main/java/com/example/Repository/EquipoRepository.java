package com.example.Repository;

import com.example.Model.Equipo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Date;
/**
 * Created by jhipster on 22/10/15.
 */
public interface EquipoRepository extends PagingAndSortingRepository<Equipo, Long>{
public List<Equipo> findByNombreContaining(String algo);
    public List<Equipo> findByNombre(String algo);}

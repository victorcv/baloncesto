package com.example.Repository;

import com.example.Model.Temporada;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Date;

@Repository
public interface TemporadaRepository extends PagingAndSortingRepository<Temporada, Long> {
    public List<Temporada> findByNombre(String algo);
}

package com.example.Repository;

import com.example.Model.Liga;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Date;

@Repository
public interface LigaRepository extends PagingAndSortingRepository<Liga, Long> {
    public List<Liga> findByNombre(String algo);
}

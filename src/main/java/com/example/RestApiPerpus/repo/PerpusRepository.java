package com.example.RestApiPerpus.repo;

import org.springframework.stereotype.Repository;
import com.example.RestApiPerpus.model.Buku;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PerpusRepository extends JpaRepository<Buku,Long>{

}

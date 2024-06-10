package com.example.apiRest.demo.repository;

import com.example.apiRest.demo.models.Bodega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BodegaRepository extends JpaRepository<Bodega, Long> {
}
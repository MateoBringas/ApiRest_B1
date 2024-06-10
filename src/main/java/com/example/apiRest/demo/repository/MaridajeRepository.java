package com.example.apiRest.demo.repository;

import com.example.apiRest.demo.models.Maridaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaridajeRepository extends JpaRepository<Maridaje, Long> {
}
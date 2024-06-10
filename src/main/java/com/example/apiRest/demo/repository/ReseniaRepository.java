package com.example.apiRest.demo.repository;

import com.example.apiRest.demo.models.Resenia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReseniaRepository extends JpaRepository<Resenia, Long> {
}

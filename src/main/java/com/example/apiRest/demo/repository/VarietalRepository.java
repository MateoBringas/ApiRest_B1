package com.example.apiRest.demo.repository;

import com.example.apiRest.demo.models.Varietal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VarietalRepository extends JpaRepository<Varietal, Long> {
}
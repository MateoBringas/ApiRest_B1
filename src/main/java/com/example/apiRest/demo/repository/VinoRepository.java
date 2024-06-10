package com.example.apiRest.demo.repository;

import com.example.apiRest.demo.models.Vino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VinoRepository extends JpaRepository<Vino, Long> {
}
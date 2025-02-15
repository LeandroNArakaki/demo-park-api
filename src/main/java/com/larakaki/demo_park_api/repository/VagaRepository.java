package com.larakaki.demo_park_api.repository;

import com.larakaki.demo_park_api.entity.Vaga;
import com.larakaki.demo_park_api.enums.StatusVaga;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VagaRepository extends JpaRepository<Vaga, Long> {


    Optional<Vaga> findByCodigo(String codigo);

    Optional<Vaga> findFirstByStatus(StatusVaga statusVaga);
}

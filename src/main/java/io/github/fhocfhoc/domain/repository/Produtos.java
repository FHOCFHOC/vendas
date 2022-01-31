package io.github.fhocfhoc.domain.repository;

import io.github.fhocfhoc.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto,Integer> {
}
package io.github.fhocfhoc.domain.repository;

import io.github.fhocfhoc.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
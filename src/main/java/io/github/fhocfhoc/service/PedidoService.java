package io.github.fhocfhoc.service;

import io.github.fhocfhoc.domain.entity.Pedido;
import io.github.fhocfhoc.domain.enums.StatusPedido;
import io.github.fhocfhoc.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}

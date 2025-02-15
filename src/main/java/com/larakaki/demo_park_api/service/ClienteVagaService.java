package com.larakaki.demo_park_api.service;

import com.larakaki.demo_park_api.entity.ClienteVaga;
import com.larakaki.demo_park_api.exception.EntityNotFoundException;
import com.larakaki.demo_park_api.repository.ClienteVagaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class ClienteVagaService {

    private final ClienteVagaRepository clienteVagaRepository;

    @Transactional
    public ClienteVaga salvar(ClienteVaga clienteVaga) {
        return clienteVagaRepository.save(clienteVaga);
    }

    @Transactional(readOnly = true)
    public ClienteVaga buscarPorRecibo(String recibo) {
        return clienteVagaRepository.findByReciboAndDataSaidaIsNull(recibo).orElseThrow(
                () -> new EntityNotFoundException(String.format("Recibo '%s' não encontrada no sistema ou checkout já realizado", recibo))
        );
    }
}

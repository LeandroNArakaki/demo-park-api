package com.larakaki.demo_park_api.dto.mapper;

import com.larakaki.demo_park_api.dto.EstacionamentoCreateDto;
import com.larakaki.demo_park_api.dto.EstacionamentoResponseDto;
import com.larakaki.demo_park_api.entity.ClienteVaga;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClienteVagaMapper {

    public static ClienteVaga toClienteVaga(EstacionamentoCreateDto dto) {
        return new ModelMapper().map(dto, ClienteVaga.class);
    }

    public static EstacionamentoResponseDto toDto(ClienteVaga clienteVaga) {
        return new ModelMapper().map(clienteVaga, EstacionamentoResponseDto.class);
    }
}

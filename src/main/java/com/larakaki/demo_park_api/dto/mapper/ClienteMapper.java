package com.larakaki.demo_park_api.dto.mapper;

import com.larakaki.demo_park_api.dto.ClienteCreateDto;
import com.larakaki.demo_park_api.dto.ClienteResponseDto;
import com.larakaki.demo_park_api.entity.Cliente;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClienteMapper {

    public static Cliente toCliente(ClienteCreateDto dto) {
        return new ModelMapper().map(dto, Cliente.class);
    }

    public static ClienteResponseDto toDto(Cliente cliente) {
        return new ModelMapper().map(cliente, ClienteResponseDto.class);
    }
}

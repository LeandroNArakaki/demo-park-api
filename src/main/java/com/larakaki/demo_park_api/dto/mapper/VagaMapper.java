package com.larakaki.demo_park_api.dto.mapper;

import com.larakaki.demo_park_api.dto.VagaCreateDto;
import com.larakaki.demo_park_api.dto.VagaResponseDto;
import com.larakaki.demo_park_api.entity.Vaga;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class VagaMapper {

    public static Vaga toVaga(VagaCreateDto dto) {
        return new ModelMapper().map(dto, Vaga.class);
    }

    public static VagaResponseDto toDto(Vaga vaga) {
        return new ModelMapper().map(vaga, VagaResponseDto.class);
    }
}

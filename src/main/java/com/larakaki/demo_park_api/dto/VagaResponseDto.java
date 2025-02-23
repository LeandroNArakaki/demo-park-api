package com.larakaki.demo_park_api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VagaResponseDto {

    private Long id;
    private String codigo;
    private String status;

}

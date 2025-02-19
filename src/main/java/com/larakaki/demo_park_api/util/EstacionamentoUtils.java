package com.larakaki.demo_park_api.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EstacionamentoUtils {

    private static final BigDecimal PRIMEIROS_15_MINUTES = new BigDecimal("5.00");
    private static final BigDecimal PRIMEIROS_60_MINUTES = new BigDecimal("9.25");
    private static final BigDecimal ADICIONAL_15_MINUTES = new BigDecimal("1.75");
    private static final double DESCONTO_PERCENTUAL = 0.30;


    public static String gerarRecibo() {
        LocalDateTime date = LocalDateTime.now();
        String recibo = date.toString().substring(0, 19);
        return recibo.replace("-", "")
                .replace(":", "")
                .replace("T", "-");
    }

    public static BigDecimal calcularCusto(LocalDateTime dataEntrada, LocalDateTime dataSaida) {
        long minutes = dataEntrada.until(dataSaida, ChronoUnit.MINUTES);
        BigDecimal total;

        if (minutes <= 15) {
            // complete com a lógica para calcular o custo até 15 minutos de uso
            total = PRIMEIROS_15_MINUTES;

        } else if (minutes <= 60) {
            // complete com a lógica para calcular o custo até os primeiros 60 minutos de uso
            total = PRIMEIROS_60_MINUTES;

        } else {
            // complete com a lógica para calcular o custo acima de 60 minutos de uso
            long minutosExcedentes = minutes - 60;
            long faixasAdicionais = (minutosExcedentes + 14) / 15; // Arredonda para cima

            BigDecimal adicional = ADICIONAL_15_MINUTES.multiply(BigDecimal.valueOf(faixasAdicionais));
            total = PRIMEIROS_60_MINUTES.add(adicional);
        }

        return total.setScale(2, RoundingMode.HALF_EVEN);
    }

    public static BigDecimal calcularDesconto(BigDecimal valor, long totalDeVezes) {
        // Complete o código com a sua lógica

        BigDecimal desconto = ((totalDeVezes > 0) && (totalDeVezes % 10 == 0))
                ? valor.multiply(new BigDecimal(DESCONTO_PERCENTUAL))
                : new BigDecimal(0);

        return desconto.setScale(2, RoundingMode.HALF_EVEN);
    }
}

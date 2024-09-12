package com.domain.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class DiferenciaEntreFechasTest {

    @Autowired
     DiferenciaEntreFechas diferenciaEntreFechas;
    FechaHoy fechaHoy;

    @Test
    void calculateYearsOfIndependency() {
        diferenciaEntreFechas = new DiferenciaEntreFechas();
        String fechaIndependencia = fechaHoy.obtener();
        Period resultado = diferenciaEntreFechas.calculateYearsOfIndependency(fechaIndependencia);

        Assertions.assertEquals(0,resultado.getDays() );
        Assertions.assertEquals(0,resultado.getMonths() );
        Assertions.assertEquals(0,resultado.getYears() );
    }
}
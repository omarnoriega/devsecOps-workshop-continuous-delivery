package com.domain.util;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaHoy {

    static String obtener (){
        LocalDate fechaHoy = LocalDate.now(); // Create a date object
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String hoy = fechaHoy.format(myFormatObj);
        return hoy;
    }
}

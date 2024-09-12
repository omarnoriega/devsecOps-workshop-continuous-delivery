package com.domain.controller;

import com.domain.models.Country;
import com.domain.models.CountryResponse;
import com.domain.repositories.CountryRepository;
import com.domain.util.DiferenciaEntreFechas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

class IndependencyControllerTest {

    @Autowired
    CountryResponse countryResponse;
    @Autowired
    Optional<Country> country;

    CountryRepository countryRepositoryMock = Mockito.mock(CountryRepository.class);

    @Autowired
    DiferenciaEntreFechas diferenciaEntreFechas = new DiferenciaEntreFechas();

    @Autowired
    IndependencyController independencyController = new IndependencyController(countryRepositoryMock,diferenciaEntreFechas);

    @BeforeEach
    void setUp() {
        Country mockCountry = new Country();
        mockCountry.setIsoCode("CO");
        mockCountry.setCountryIdependenceDate("20/07/1810");
        mockCountry.setCountryId((long) 1);
        mockCountry.setCountryName("Colombia");
        mockCountry.setCountryCapital("Bogotá");
        Mockito.when(countryRepositoryMock.findCountryByIsoCode("CO")).thenReturn(mockCountry);

    }

    @Test
    @DisplayName("Dado un codigo valido, obtener detalles de un pais")
    public void obtenerDetallePaisConCodigoValido() {
        ResponseEntity<CountryResponse> respuestaServicio;
        respuestaServicio = independencyController.getCountryDetails("CO");
        Assertions.assertEquals("Colombia",respuestaServicio.getBody().getCountryName());
    }

    @Test
    @DisplayName("Dado un código de país inválido, Evaluar que retorne un mensaje de error")
    public void obtenerDetallePaisConCodigoInvalido() {
        ResponseEntity<CountryResponse> respuestaServicio;
        respuestaServicio = independencyController.getCountryDetails("IT");
        Assertions.assertNull(respuestaServicio.getBody().getCountryName());
    }

}
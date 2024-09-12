## IndependecyController
countryResponse.setDayssOfIndependency(period.getDays());
countryResponse.setMonthsOfIndependency(period.getMonths());
countryResponse.setYearsOfIndependency(period.getYears());

## CountryResponse


    public void setYearsOfIndependency(int yearsOfIndependency) {
        this.yearsOfIndependency = yearsOfIndependency;
    }
    public void setMonthsOfIndependency(int monthsOfIndependency) {
        this.monthsOfIndependency = monthsOfIndependency;
    }
    public void setDayssOfIndependency(int dayssOfIndependency) {
        this.dayssOfIndependency = dayssOfIndependency;
    }

## Test


    @Test
    @DisplayName("Dado un código de país inválido, Evaluar que retorne un mensaje de error")
    public void obtenerDetallePaisConCodigoInvalido() {
        ResponseEntity<CountryResponse> respuestaServicio;
        respuestaServicio = independencyController.getCountryDetails("IT");
        Assertions.assertNull(respuestaServicio.getBody().getCountryName());
    }
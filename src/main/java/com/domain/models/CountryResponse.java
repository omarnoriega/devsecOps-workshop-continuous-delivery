package com.domain.models;

public class CountryResponse {
    private String countryName;
    public String capitalName;
    public String independenceDate;
    public int yearsOfIndependency;
    public int monthsOfIndependency;
    public int dayssOfIndependency;

    public String getCountryName() {
        return countryName;
    }

     public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }
    public void setIndependenceDate(String independenceDate) {
        this.independenceDate = independenceDate;
    }
    public void setYearsOfIndependency(int yearsOfIndependency) {
        this.yearsOfIndependency = yearsOfIndependency;
    }
    public void setMonthsOfIndependency(int monthsOfIndependency) {
        this.monthsOfIndependency = monthsOfIndependency;
    }
    public void setDayssOfIndependency(int dayssOfIndependency) {
        this.dayssOfIndependency = dayssOfIndependency;
    }

}
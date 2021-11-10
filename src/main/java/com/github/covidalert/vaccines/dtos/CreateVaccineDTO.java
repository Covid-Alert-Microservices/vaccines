package com.github.covidalert.vaccines.dtos;

import javax.validation.constraints.NotNull;

public class CreateVaccineDTO
{

    @NotNull
    private String vaccineType;

    @NotNull
    private int doseNumber;

    public CreateVaccineDTO()
    {
    }

    public String getVaccineType()
    {
        return vaccineType;
    }

    public int getDoseNumber()
    {
        return doseNumber;
    }
}

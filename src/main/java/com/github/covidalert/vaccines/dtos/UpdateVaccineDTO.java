package com.github.covidalert.vaccines.dtos;

import javax.validation.constraints.NotNull;

public class UpdateVaccineDTO
{

    @NotNull
    private int doseNumber;

    public UpdateVaccineDTO()
    {
    }

    public int getDoseNumber()
    {
        return doseNumber;
    }
}


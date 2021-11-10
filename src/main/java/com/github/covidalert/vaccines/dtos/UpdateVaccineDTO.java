package com.github.covidalert.vaccines.dtos;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class UpdateVaccineDTO
{
    @NotNull
    private int doseNumber;

    @NotNull
    private Date vaccinationDate;

    public UpdateVaccineDTO()
    {
    }

    public int getDoseNumber()
    {
        return doseNumber;
    }

    public Date getVaccinationDate()
    {
        return vaccinationDate;
    }
}


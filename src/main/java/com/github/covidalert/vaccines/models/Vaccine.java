package com.github.covidalert.vaccines.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Vaccine
{

    @Id
    @NotNull
    private String userId;

    @NotNull
    private String vaccineType;

    @NotNull
    private int doseNumber;

    public Vaccine()
    {
    }

    public Vaccine(String userId, String vaccineType, int doseNumber)
    {
        this.userId = userId;
        this.vaccineType = vaccineType;
        this.doseNumber = doseNumber;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getVaccineType()
    {
        return vaccineType;
    }

    public void setVaccineType(String vaccineType)
    {
        this.vaccineType = vaccineType;
    }

    public int getDoseNumber()
    {
        return doseNumber;
    }

    public void setDoseNumber(int doseNumber)
    {
        this.doseNumber = doseNumber;
    }
}

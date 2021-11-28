package com.github.covidalert.vaccines.dtos;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class CreateOrUpdateVaccineDTO
{

    @NotNull
    private String disease;

    @NotNull
    private String vaccine;

    @NotNull
    private String vaccineMedicinalProduct;

    @NotNull
    private String manufacturer;

    @NotNull
    private int doseNumber;

    @NotNull
    private int doseNumberMax;

    @NotNull
    private Date vaccinationDate;

    @NotNull
    private String memberState;

    @NotNull
    private String certificateIssuer;

    public CreateOrUpdateVaccineDTO()
    {
    }

    public String getDisease()
    {
        return disease;
    }

    public String getVaccine()
    {
        return vaccine;
    }

    public String getVaccineMedicinalProduct()
    {
        return vaccineMedicinalProduct;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public int getDoseNumber()
    {
        return doseNumber;
    }

    public int getDoseNumberMax()
    {
        return doseNumberMax;
    }

    public Date getVaccinationDate()
    {
        return vaccinationDate;
    }

    public String getMemberState()
    {
        return memberState;
    }

    public String getCertificateIssuer()
    {
        return certificateIssuer;
    }
}

package com.github.covidalert.vaccines.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Vaccine
{

    @Id
    @NotNull
    private String userId;

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

    public Vaccine()
    {
    }

    public Vaccine(String userId, String disease, String vaccine, String vaccineMedicinalProduct, String manufacturer, int doseNumber, int doseNumberMax, Date vaccinationDate, String memberState, String certificateIssuer)
    {
        this.userId = userId;
        this.disease = disease;
        this.vaccine = vaccine;
        this.vaccineMedicinalProduct = vaccineMedicinalProduct;
        this.manufacturer = manufacturer;
        this.doseNumber = doseNumber;
        this.doseNumberMax = doseNumberMax;
        this.vaccinationDate = vaccinationDate;
        this.memberState = memberState;
        this.certificateIssuer = certificateIssuer;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getDisease()
    {
        return disease;
    }

    public void setDisease(String disease)
    {
        this.disease = disease;
    }

    public String getVaccine()
    {
        return vaccine;
    }

    public void setVaccine(String vaccine)
    {
        this.vaccine = vaccine;
    }

    public String getVaccineMedicinalProduct()
    {
        return vaccineMedicinalProduct;
    }

    public void setVaccineMedicinalProduct(String vaccineMedicinalProduct)
    {
        this.vaccineMedicinalProduct = vaccineMedicinalProduct;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    public int getDoseNumber()
    {
        return doseNumber;
    }

    public void setDoseNumber(int doseNumber)
    {
        this.doseNumber = doseNumber;
    }

    public int getDoseNumberMax()
    {
        return doseNumberMax;
    }

    public void setDoseNumberMax(int doseNumberMax)
    {
        this.doseNumberMax = doseNumberMax;
    }

    public Date getVaccinationDate()
    {
        return vaccinationDate;
    }

    public void setVaccinationDate(Date vaccinationDate)
    {
        this.vaccinationDate = vaccinationDate;
    }

    public String getMemberState()
    {
        return memberState;
    }

    public void setMemberState(String memberState)
    {
        this.memberState = memberState;
    }

    public String getCertificateIssuer()
    {
        return certificateIssuer;
    }

    public void setCertificateIssuer(String certificateIssuer)
    {
        this.certificateIssuer = certificateIssuer;
    }
}

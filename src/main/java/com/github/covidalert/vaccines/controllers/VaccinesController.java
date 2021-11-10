package com.github.covidalert.vaccines.controllers;

import com.github.covidalert.vaccines.dtos.CreateVaccineDTO;
import com.github.covidalert.vaccines.dtos.UpdateVaccineDTO;
import com.github.covidalert.vaccines.models.Vaccine;
import com.github.covidalert.vaccines.repositories.VaccinesRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;

@RestController
@RequestMapping("/api/vaccine")
public class VaccinesController
{

    @Autowired
    private VaccinesRepository vaccinesRepository;

    @GetMapping
    public Vaccine getVaccine(Principal principal)
    {
        return vaccinesRepository.getById(principal.getName());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Vaccine createVaccine(Principal principal, @Valid @RequestBody CreateVaccineDTO vaccineDTO)
    {
        Vaccine vaccine = new Vaccine(
                principal.getName(),
                vaccineDTO.getDisease(),
                vaccineDTO.getVaccine(),
                vaccineDTO.getVaccineMedicinalProduct(),
                vaccineDTO.getManufacturer(),
                vaccineDTO.getDoseNumber(),
                vaccineDTO.getDoseNumberMax(),
                vaccineDTO.getVaccinationDate(),
                vaccineDTO.getMemberState(),
                vaccineDTO.getCertificateIssuer()
        );
        return vaccinesRepository.saveAndFlush(vaccine);
    }

    @DeleteMapping
    public void deleteVaccine(Principal principal)
    {
        vaccinesRepository.deleteById(principal.getName());
    }

    @PutMapping
    public Vaccine updateVaccine(Principal principal, @Valid @RequestBody UpdateVaccineDTO vaccineDTO)
    {
        Vaccine existingVaccine = vaccinesRepository.getById(principal.getName());
        BeanUtils.copyProperties(vaccineDTO, existingVaccine);
        return vaccinesRepository.saveAndFlush(existingVaccine);
    }

}

package com.github.covidalert.vaccines.controllers;

import com.github.covidalert.vaccines.dtos.CreateVaccineDTO;
import com.github.covidalert.vaccines.dtos.UpdateVaccineDTO;
import com.github.covidalert.vaccines.models.Vaccine;
import com.github.covidalert.vaccines.repositories.VaccinesRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.security.Principal;
import java.util.Optional;

@RestController
@RequestMapping("/api/vaccine")
public class VaccinesController
{

    @Autowired
    private VaccinesRepository vaccinesRepository;

    @GetMapping
    public Vaccine getVaccine(Principal principal)
    {
        Optional<Vaccine> vaccine = vaccinesRepository.findById(principal.getName());

        if (vaccine.isEmpty())
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        return vaccine.get();
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
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteVaccine(Principal principal)
    {
        if (vaccinesRepository.deleteByUserId(principal.getName()) < 1)
        {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping
    public Vaccine updateVaccine(Principal principal, @Valid @RequestBody UpdateVaccineDTO vaccineDTO)
    {
        Optional<Vaccine> existingVaccine = vaccinesRepository.findById(principal.getName());

        if (existingVaccine.isEmpty())
        {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        Vaccine vaccine = existingVaccine.get();
        BeanUtils.copyProperties(vaccineDTO, vaccine);
        return vaccinesRepository.saveAndFlush(vaccine);
    }

}

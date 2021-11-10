package com.github.covidalert.vaccines.repositories;

import com.github.covidalert.vaccines.models.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinesRepository extends JpaRepository<Vaccine, String>
{
}
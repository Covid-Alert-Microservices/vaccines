package com.github.covidalert.vaccines.repositories;

import com.github.covidalert.vaccines.models.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface VaccinesRepository extends JpaRepository<Vaccine, String>
{

    @Transactional
    Long deleteByUserId(String id);

}
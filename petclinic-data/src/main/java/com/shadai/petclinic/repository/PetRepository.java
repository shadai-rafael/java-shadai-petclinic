package com.shadai.petclinic.repository;

import com.shadai.petclinic.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet,Long> {
}

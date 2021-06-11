package com.shadai.petclinic.repository;

import com.shadai.petclinic.model.Vet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VetRepository extends JpaRepository<Vet,Long> {
}

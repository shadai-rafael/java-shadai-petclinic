package com.shadai.petclinic.repository;

import com.shadai.petclinic.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner,Long> {

}

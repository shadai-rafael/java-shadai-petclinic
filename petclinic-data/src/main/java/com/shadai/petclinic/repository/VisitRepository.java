package com.shadai.petclinic.repository;

import com.shadai.petclinic.model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<Visit,Long> {
}

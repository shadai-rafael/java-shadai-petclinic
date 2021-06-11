package com.shadai.petclinic.crudservice;

import com.shadai.petclinic.model.Visit;
import com.shadai.petclinic.repository.VisitRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class VisitCRUDService {

    private final VisitRepository visitRepository;

    public VisitCRUDService(VisitRepository visitRepository){
        this.visitRepository = visitRepository;
    }

    public Visit createVisit(Visit visit){
        return visitRepository.save(visit);
    }

    public Optional<Visit> findVisitById(Long id){
        return visitRepository.findById(id);
    }

    public List<Visit>findAllVisits(){
        return visitRepository.findAll();
    }

    public Visit updateVisit(Visit visit){
        Visit visitFound = visitRepository.findById(visit.getId()).orElse(null);
        visitFound.setDate(visit.getDate());
      //  visitFound.setPet(visit.getPet());
        visitFound.setReport(visit.getReport());
       // visitFound.setVet(visit.getVet());
        return visitRepository.save(visitFound);
    }

    public void deleteVisit(Visit visit){
        visitRepository.delete(visit);
    }
}

package com.shadai.petclinic.crudservice;

import com.shadai.petclinic.model.Vet;
import com.shadai.petclinic.repository.VetRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class VetCRUDService {

    private final VetRepository vetRepository;

    public VetCRUDService(VetRepository vetRepository){
        this.vetRepository = vetRepository;
    }

    public Vet createVet(Vet vet){
        return vetRepository.save(vet);
    }

    public Optional<Vet> findVetById(Long id){
        return vetRepository.findById(id);
    }
    public List<Vet>findAllVets(){
        return vetRepository.findAll();
    }

    public Vet updateVet(Vet vet){
        Vet vetFound = vetRepository.findById(vet.getId()).orElse(null);
        //vetFound.setVisits(vet.getVisits());
        vetFound.setAddress(vet.getAddress());
        vetFound.setFirstName(vet.getFirstName());
        vetFound.setLastName(vet.getLastName());
        vetFound.setCity(vet.getCity());
        vetFound.setTelephone(vet.getTelephone());
        return vetRepository.save(vetFound);
    }

    public void deleteVet(Vet vet){
        vetRepository.delete(vet);
    }

}

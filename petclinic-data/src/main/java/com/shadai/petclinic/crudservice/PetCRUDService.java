package com.shadai.petclinic.crudservice;
import com.shadai.petclinic.model.Pet;
import com.shadai.petclinic.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetCRUDService {

    private final PetRepository petRepository;

    public PetCRUDService(PetRepository petRepository){
        this.petRepository = petRepository;
    }

    public void createPet(Pet pet){
        petRepository.save(pet);
    }

    public Optional<Pet> findPetById(Long id){
        return petRepository.findById(id);
    }

    public List<Pet> findAllPets(){
        return petRepository.findAll();
    }

    public Pet updatePet(Pet pet){
        Pet petFound = petRepository.findById(pet.getId()).orElse(null);
       // petFound.setVisits(pet.getVisits());
        petFound.setBirthDate(pet.getBirthDate());
        petFound.setBreed(pet.getBreed());
        petFound.setGenre(pet.getGenre());
        petFound.setName(pet.getName());
        //petFound.setOwner(pet.getOwner());
        petFound.setSpecie(pet.getSpecie());
        return petRepository.save(pet);
    }

    public void deletePet(Pet pet){
        petRepository.delete(pet);
    }

}

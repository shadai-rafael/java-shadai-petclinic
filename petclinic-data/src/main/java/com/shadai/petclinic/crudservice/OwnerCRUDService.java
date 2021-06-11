package com.shadai.petclinic.crudservice;

import com.shadai.petclinic.model.Owner;
import com.shadai.petclinic.repository.OwnerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerCRUDService {

    private final OwnerRepository ownerRepository;

    public OwnerCRUDService(OwnerRepository ownerRepository){
        this.ownerRepository = ownerRepository;
    }

    public Owner createOwner(Owner owner){
        return ownerRepository.save(owner);
    }

    public Optional<Owner> findOwnerById(Long id){
        return ownerRepository.findById(id);
    }

    public List<Owner> findAllOwners(){
        return ownerRepository.findAll();
    }

    public Owner updateOwner(Owner owner) {
        Owner ownerFound = ownerRepository.findById(owner.getId()).orElse(null);
        //ownerFound.setPets(owner.getPets());
        ownerFound.setLastName(owner.getLastName());
        ownerFound.setFirstName(owner.getFirstName());
        ownerFound.setAddress(owner.getAddress());
        ownerFound.setCity(owner.getCity());
        ownerFound.setTelephone(owner.getTelephone());
        return ownerRepository.save(ownerFound);
    }

    public void deleteOwner(Owner owner){
        ownerRepository.delete(owner);
    }

}

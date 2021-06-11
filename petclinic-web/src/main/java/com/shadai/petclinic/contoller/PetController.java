package com.shadai.petclinic.contoller;

import com.shadai.petclinic.model.Pet;
import com.shadai.petclinic.crudservice.PetCRUDService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/pets")
@RestController
public class PetController {

    private final PetCRUDService petCRUDService;

    public PetController(PetCRUDService petCRUDService){
        this.petCRUDService = petCRUDService;
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public void createPetController(@RequestBody Pet pet){
        petCRUDService.createPet(pet);
    }

    @GetMapping
    @ResponseBody
    public List<Pet> getAllPetController(){
        return petCRUDService.findAllPets();
    }

    @PutMapping(consumes = "application/json")
    @ResponseBody
    public void updatePetController(@RequestBody Pet pet){
        petCRUDService.updatePet(pet);
    }

    @DeleteMapping(consumes = "application/json")
    @ResponseBody
    public void deletePetController(@RequestBody Pet pet){
        petCRUDService.deletePet(pet);
    }

}

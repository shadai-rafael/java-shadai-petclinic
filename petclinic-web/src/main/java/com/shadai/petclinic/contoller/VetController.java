package com.shadai.petclinic.contoller;

import com.shadai.petclinic.model.Vet;
import com.shadai.petclinic.crudservice.VetCRUDService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/vets")
@RestController
public class VetController {

    private final VetCRUDService vetCRUDService;

    public VetController(VetCRUDService vetCRUDService){
        this.vetCRUDService = vetCRUDService;
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public void createVetController(@RequestBody Vet vet){
        vetCRUDService.createVet(vet);
    }

    @GetMapping
    @ResponseBody
    public List<Vet> getAllVetController(){
        return vetCRUDService.findAllVets();
    }

    @PutMapping(consumes = "application/json")
    @ResponseBody
    public void updateOwnerController(@RequestBody Vet vet){
        vetCRUDService.updateVet(vet);
    }

    @DeleteMapping(consumes = "application/json")
    @ResponseBody
    public void deleteOwnerController(@RequestBody Vet vet){
        vetCRUDService.deleteVet(vet);
    }

}

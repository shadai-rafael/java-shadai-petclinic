package com.shadai.petclinic.contoller;

import com.shadai.petclinic.crudservice.OwnerCRUDService;
import com.shadai.petclinic.model.Owner;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/owners")
@RestController
public class OwnerController {

    private final OwnerCRUDService ownerCRUDService;

    public OwnerController(OwnerCRUDService ownerCRUDService){
        this.ownerCRUDService = ownerCRUDService;
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public void createOwnerController(@RequestBody Owner owner){
        ownerCRUDService.createOwner(owner);
    }

    @GetMapping
    @ResponseBody
    public List<Owner> getAllOwnerController(){
        return ownerCRUDService.findAllOwners();
    }

    @PutMapping(consumes = "application/json")
    @ResponseBody
    public void updateOwnerController(@RequestBody Owner owner){
        ownerCRUDService.updateOwner(owner);
    }

    @DeleteMapping(consumes = "application/json")
    @ResponseBody
    public void deleteOwnerController(@RequestBody Owner owner){
        ownerCRUDService.deleteOwner(owner);
    }

}

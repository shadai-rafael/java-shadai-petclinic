package com.shadai.petclinic.contoller;

import com.shadai.petclinic.model.Visit;
import com.shadai.petclinic.crudservice.VisitCRUDService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/visits")
@RestController
public class VisitController {

    private final VisitCRUDService visitCRUDService;

    public VisitController(VisitCRUDService visitCRUDService){
        this.visitCRUDService = visitCRUDService;
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public void createVisitController(@RequestBody Visit visit){
        visitCRUDService.createVisit(visit);
    }

    @GetMapping
    @ResponseBody
    public List<Visit> getAllVisitController(){
        return visitCRUDService.findAllVisits();
    }

    @PutMapping(consumes = "application/json")
    @ResponseBody
    public void updateOwnerController(@RequestBody Visit visit){
        visitCRUDService.updateVisit(visit);
    }

    @DeleteMapping(consumes = "application/json")
    @ResponseBody
    public void deleteVisitController(@RequestBody Visit visit){
        visitCRUDService.deleteVisit(visit);
    }

}

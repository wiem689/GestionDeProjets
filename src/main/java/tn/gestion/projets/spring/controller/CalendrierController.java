package tn.gestion.projets.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.gestion.projets.spring.entity.Calendrier;
import tn.gestion.projets.spring.entity.User;
import tn.gestion.projets.spring.service.CalendrierService;
import tn.gestion.projets.spring.service.IUserService;

import java.util.List;

public class CalendrierController {
    @Autowired
    CalendrierService cs ;


    //*******************add*********************************************************
    // http://localhost:8082/GestionDeProjets/servlet/add-Calendrier
    @PostMapping("add-Calendrier")
    @ResponseBody
    public Calendrier addCalendrier(@RequestBody Calendrier c) {
        Calendrier calendrier = cs.addCalendrier(c);
        return calendrier;
    }

    //*****************delete*********************************************************


    // http://localhost:8082/GestionDeProjets/servlet/remove-Calendrier/{calendrier-id}
    @DeleteMapping("/remove-calendrier/{calendrier-id}")
    @ResponseBody
    public void removeCalendrier(@PathVariable("calendrier-id") long calendrierId) {
        cs.deleteCalendrier(calendrierId);
    }


    //********************************update*****************************************

    // http://localhost:8082/GestionDeProjets/servlet/modify-Calendrier
    @PutMapping("/modify-Calendrier")
    @ResponseBody
    public Calendrier modifyOrders(@RequestBody Calendrier calendrier) {
        return cs.updateCalendrier(calendrier);
    }


    //***************************************retrieveAll***********************************

    // http://localhost:8082/GestionDeProjets/servlet/retrieve-all-calendrier
    @GetMapping("/retrieve-all-calendrier")
    @ResponseBody
    public List<Calendrier> getCalendrier() {
        List<Calendrier> list = cs.retrieveAllCalendrier();
        return list;
    }

    //***********************************************retrievebyid**************************************


    //http://localhost:8082/GestionDeProjets/servlet/retrieve-calendrier/{calendrier-id}
    @GetMapping("/retrieve-calendrier/{calendrier-id}")
    @ResponseBody
    public Calendrier retrieveCalendrier(@PathVariable("calendrier-id") Long id) {
        return cs.retrieveCalendrier(id);
    }


}

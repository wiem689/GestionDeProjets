package tn.gestion.projets.spring.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.gestion.projets.spring.entity.Calendrier;
import tn.gestion.projets.spring.repository.CalendrierRepository;

import java.util.List;

@Service
public class CalendrierService {
    @Autowired
    CalendrierRepository cr ;

    private static final Logger l = LogManager.getLogger();



    public Calendrier addCalendrier(Calendrier c) {
        return this.cr.save(c);
    }


    public boolean deleteCalendrier(long id) {
        if(cr.existsById(id)){
            cr.deleteById(id);
            return true;
        }
        else{
            return false;
        }
    }


    public Calendrier updateCalendrier(Calendrier c) {
        return cr.save(c); 	}


    public List<Calendrier> retrieveAllCalendrier() {
        List<Calendrier> c = (List<Calendrier>) cr.findAll();
        for(Calendrier Calendrier : c){
            l.info("Calendrier :" + c);
        }
        return c;
    }


    public Calendrier retrieveCalendrier(Long id) {
        return cr.findById(id).get();	}

}

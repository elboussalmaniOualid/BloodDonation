package com.ehealth.dondusang.stock;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@CrossOrigin(origins = "*")
public class stockController {
    @Autowired
    private stockServices stockServices;

    @RequestMapping(value = "/stock", method = RequestMethod.GET)
    public List<paquet> findAllPaquets() {
        return stockServices.getAllPaquets();
    }

    @RequestMapping("stock/id/{id}")
    public Optional<paquet> findOnePaquet(@PathVariable int id) {
        return stockServices.getPaquetById(id);
    }
    @RequestMapping("stock/{type}")
    public List<paquet> findpaquetbytype(@PathVariable String type){
         return stockServices.findByTypes(type);
    }
    @RequestMapping("stock/{type}/{gs}")
    public List<paquet> findPaquetsByGS(@PathVariable String gs){
        return stockServices.findByGroupsanguins(gs);
    }
    @RequestMapping(value ="/stock/{id}", method = RequestMethod.PUT)
    public void updatePaquet(@PathVariable String id,@RequestBody paquet paquet){
        stockServices.updatePaquet(id, paquet);
    }
    @RequestMapping(value = "/stock", method = RequestMethod.POST)
    public void addPaquet(@RequestBody paquet paquet) {
        stockServices.addPaquet(paquet);
    }
    @RequestMapping(value ="/stock/{id}", method = RequestMethod.DELETE)
    public void updatePaquet(@PathVariable int id){
        stockServices.deletePaquet(id);
    }

    //statistiques
    @RequestMapping("/stock/reserveofglobules/{days}")
    public List<paquet> ReserveOfGlobules(@PathVariable int days){
        //System.out.println(stockServices.testofquery(days).size());
        return stockServices.ReserveOfGlobules(days);
    }
    @RequestMapping("/stock/reserveofplasma/{days}")
    public List<paquet> ReserveOfPlasma(@PathVariable int days){
        return stockServices.ReserveOfPlasma(days);
    }
    @RequestMapping("/stock/reserveofplaquettes/{days}")
    public List<paquet> ReserveOfPlaquettes(@PathVariable int days){
        return stockServices.ReserveOfPlaquettes(days);
    }
    //test d count 
    @RequestMapping("/stock/test/{days}")
    public int ReserveOfglobules(@PathVariable int days){
        return stockServices.ReserveOfglobulesrouges(days);
    }
    
    
    
}

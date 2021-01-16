package com.ehealth.dondusang.stock;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class stockServices {
    @Autowired
    private stockRepository stockRepository;
    public Optional<paquet> getPaquetById(int id) {
        return stockRepository.findById(id);
    }
    public List<paquet> getAllPaquets() {
        List<paquet> paquets = new ArrayList<>();
        stockRepository.findAll().forEach(paquets::add);
        return paquets;
    }

    public List<paquet> findByTypes(String type){
         return stockRepository.findByType(type);
    }
    public List<paquet> findByGroupsanguins(String groupeSanguin){
         return stockRepository.findByGroupeSanguin(groupeSanguin);
    }
    public void addPaquet(paquet paquet){
        stockRepository.save(paquet);
    }
    public void updatePaquet(String Id,paquet paquet){
        stockRepository.save(paquet);
    }
    public void deletePaquet(int Id){
        stockRepository.deleteById(Id); 
    }

    public List<paquet> ReserveOfGlobules(int numberOfDays){
        return stockRepository.findReserveOfglobules(numberOfDays);
    }
    public List<paquet> ReserveOfPlasma(int numberOfDays){
        return stockRepository.findReserveOfPlasma(numberOfDays);
    }
    public List<paquet> ReserveOfPlaquettes(int numberOfDays){
        return stockRepository.findReserveOfplaquettes(numberOfDays);
    }
    public int ReserveOfglobulesrouges(int numb){
        return stockRepository.ReserveOfglobules(numb);
    }
   
    // public List<paquet> getSizeOfStock(String type,String gs){
    //     List<paquet> paquetType= stockRepository.findByType(type);
    //     return paquetType.stream().filter(p -> p.getGroupeSanguin().equals(gs)).findAny().get();
    // }
    // public int lmkhzoun(String date){
    //     int intervalle;
        
    // }
    



    
}

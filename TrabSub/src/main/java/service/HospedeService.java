package service;

import ch.qos.logback.core.net.server.Client;
import model.Hospede;
import model.Quarto;
import org.springframework.stereotype.Service;
import repository.HospedeRepository;


import java.util.List;
import java.util.Optional;
@Service
public class HospedeService {

    private final HospedeRepository hospedeRepository;


    public HospedeService(HospedeRepository hospedeRepository) {this.hospedeRepository = hospedeRepository;}

    public List<Hospede> getAll(){return this.hospedeRepository.findAll();}
    public Hospede save(Hospede hospede){return  this.hospedeRepository.save(hospede);}
    public Optional<Hospede> getById(int id){return  this.hospedeRepository.findById(id);}
    public void delete(int id){this.hospedeRepository.deleteById(id);}


}

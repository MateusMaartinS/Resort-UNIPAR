package service;

import model.Hospede;
import model.Reserva;
import repository.ReservaRepository;

import java.util.List;
import java.util.Optional;

public class ReservaService {

    private final ReservaRepository reservaRepository;

    public ReservaService(ReservaRepository reservaRepository) {this.reservaRepository = reservaRepository;}

    // metodo especial!!
    public List<Reserva> findByHospede(Hospede hospede){return this.reservaRepository.findByHospede(hospede);}

    public Reserva save(Reserva reserva){return this.reservaRepository.save(reserva);}

    public Optional<Reserva> getById(int id){return  this.reservaRepository.findById(id);}

    public void deleteById(int id){this.reservaRepository.deleteById(id);}
}

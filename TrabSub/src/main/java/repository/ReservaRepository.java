package repository;

import model.Hospede;
import model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

    // quary do banco se precisar
    //@Query ("")
    List<Reserva> findByHospede(Hospede hospede);

}

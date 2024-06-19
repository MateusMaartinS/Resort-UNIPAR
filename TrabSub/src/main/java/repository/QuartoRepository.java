package repository;

import model.Quarto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuartoRepository extends JpaRepository<Quarto, Integer> {

    List<Quarto> findByDisponivel(boolean diponivel);
    List<Quarto> findByQtdMaxOcupantes(int qtdMaxOcupantes);
    List<Quarto> findByDisponivelAndVistaMar(boolean disponivel, boolean vistaMar);
}

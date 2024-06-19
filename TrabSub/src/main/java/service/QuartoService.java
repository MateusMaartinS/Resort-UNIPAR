package service;

import model.Quarto;
import org.springframework.stereotype.Service;
import repository.QuartoRepository;

import java.util.List;
import java.util.Optional;

// Camada de serviço é a camada de negócio
// Em outras palavras, a camada que comunica o Repository com o Controller
@Service
public class QuartoService {
    private final QuartoRepository quartoRepository;

    public QuartoService(QuartoRepository quartoRepository) {this.quartoRepository = quartoRepository;}

    public List<Quarto> getAll(){return this.quartoRepository.findAll();}
    public Quarto save(Quarto quarto){return  this.quartoRepository.save(quarto);}

    public Optional<Quarto> getById(int id){return  this.quartoRepository.findById(id);}

    public void deleteById(int id){this.quartoRepository.deleteById(id);}




    public List<Quarto> buscarTodosDisponiveis() {
        return this.quartoRepository.findByDisponivel(true);
    }


    public List<Quarto> buscarPorQtdMaxOcupantes(int qtdMaxOcupantes) {
        return this.quartoRepository.findByQtdMaxOcupantes(qtdMaxOcupantes);
    }


    public List<Quarto> buscarTodosOcupados() {
        return this.quartoRepository.findByDisponivel(false);
    }


    public List<Quarto> buscarTodosComVistaMarEDisponiveis() {
        return this.quartoRepository.findByDisponivelAndVistaMar(true, true);
    }

}

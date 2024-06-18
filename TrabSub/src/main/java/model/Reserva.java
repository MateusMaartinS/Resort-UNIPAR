package model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReserva;
    private Date dataEntrada;
    private Date dataSaida;
    private String status;
    private BigDecimal valorTotal;

    @ManyToOne
    private Quarto quarto;

}

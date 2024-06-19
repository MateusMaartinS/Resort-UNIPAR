package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.BooleanFlag;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
public class Quarto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idQuarto;
    private String nome;
    private Boolean vistaMar;
    private BigDecimal valorDia;
    private Integer qtdMaxOcupantes;
    private String status;
    private Boolean disponivel;

}

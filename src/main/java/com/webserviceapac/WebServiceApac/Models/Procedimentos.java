package com.webserviceapac.WebServiceApac.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Entity
public class Procedimentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank
    private String CodTabelaSusOficial;

    @NotBlank
    private Long NumSessoes1Mes;

    @NotBlank
    private Long NumSessoes2Mes;

    @NotBlank
     private Long NumSessoes3Mes;

    public Procedimentos() {

    }

    public String getCodTabelaSusOficial() {
        return CodTabelaSusOficial;
    }

    public void setCodTabelaSusOficial(String codTabelaSusOficial) {
        CodTabelaSusOficial = codTabelaSusOficial;
    }

    public Long getNumSessoes1Mes() {
        return NumSessoes1Mes;
    }

    public void setNumSessoes1Mes(Long numSessoes1Mes) {
        NumSessoes1Mes = numSessoes1Mes;
    }

    public Long getNumSessoes2Mes() {
        return NumSessoes2Mes;
    }

    public void setNumSessoes2Mes(Long numSessoes2Mes) {
        NumSessoes2Mes = numSessoes2Mes;
    }

    public Long getNumSessoes3Mes() {
        return NumSessoes3Mes;
    }

    public void setNumSessoes3Mes(Long numSessoes3Mes) {
        NumSessoes3Mes = numSessoes3Mes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Procedimentos)) return false;
        Procedimentos that = (Procedimentos) o;
        return Objects.equals(getCodTabelaSusOficial(), that.getCodTabelaSusOficial()) && Objects.equals(getNumSessoes1Mes(), that.getNumSessoes1Mes()) && Objects.equals(getNumSessoes2Mes(), that.getNumSessoes2Mes()) && Objects.equals(getNumSessoes3Mes(), that.getNumSessoes3Mes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodTabelaSusOficial(), getNumSessoes1Mes(), getNumSessoes2Mes(), getNumSessoes3Mes());
    }

    public Procedimentos(String codTabelaSusOficial, Long numSessoes1Mes, Long numSessoes2Mes, Long numSessoes3Mes) {
        CodTabelaSusOficial = codTabelaSusOficial;
        NumSessoes1Mes = numSessoes1Mes;
        NumSessoes2Mes = numSessoes2Mes;
        NumSessoes3Mes = numSessoes3Mes;
    }
}

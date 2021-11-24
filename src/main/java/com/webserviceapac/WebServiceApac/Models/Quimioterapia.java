package com.webserviceapac.WebServiceApac.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.Objects;

@Entity
public class Quimioterapia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank
    private Boolean IndContinuidadeTratamento;

    @NotBlank
    private Date dataInicioTratamento;

    @NotBlank
    private String  DscEsquema;

    @NotBlank
    private Long NumTotalMesPlanejado;

    public Quimioterapia() {

    }

    public Boolean getIndContinuidadeTratamento() {
        return IndContinuidadeTratamento;
    }

    public void setIndContinuidadeTratamento(Boolean indContinuidadeTratamento) {
        IndContinuidadeTratamento = indContinuidadeTratamento;
    }

    public Date getDataInicioTratamento() {
        return dataInicioTratamento;
    }

    public void setDataInicioTratamento(Date dataInicioTratamento) {
        this.dataInicioTratamento = dataInicioTratamento;
    }

    public String getDscEsquema() {
        return DscEsquema;
    }

    public void setDscEsquema(String dscEsquema) {
        DscEsquema = dscEsquema;
    }

    public Long getNumTotalMesPlanejado() {
        return NumTotalMesPlanejado;
    }

    public void setNumTotalMesPlanejado(Long numTotalMesPlanejado) {
        NumTotalMesPlanejado = numTotalMesPlanejado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Quimioterapia)) return false;
        Quimioterapia that = (Quimioterapia) o;
        return Objects.equals(IndContinuidadeTratamento, that.IndContinuidadeTratamento) && Objects.equals(dataInicioTratamento, that.dataInicioTratamento) && Objects.equals(DscEsquema, that.DscEsquema) && Objects.equals(NumTotalMesPlanejado, that.NumTotalMesPlanejado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IndContinuidadeTratamento, dataInicioTratamento, DscEsquema, NumTotalMesPlanejado);
    }

    public Quimioterapia(Boolean indContinuidadeTratamento, Date dataInicioTratamento, String dscEsquema, Long numTotalMesPlanejado) {
        IndContinuidadeTratamento = indContinuidadeTratamento;
        this.dataInicioTratamento = dataInicioTratamento;
        DscEsquema = dscEsquema;
        NumTotalMesPlanejado = numTotalMesPlanejado;
    }
}

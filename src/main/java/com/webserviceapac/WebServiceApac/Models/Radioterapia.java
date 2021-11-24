package com.webserviceapac.WebServiceApac.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.Objects;

@Entity
public class Radioterapia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank
    private Boolean IndContinuidadeTratamento;

    @NotBlank
    private Date InicioTratamento;

    @NotBlank
    private EnumTipFinalidadeTratamento TipFinalidadeTratamento;

    @NotBlank
     private String CodCid;

    public Radioterapia() {

    }

    public Boolean getIndContinuidadeTratamento() {
        return IndContinuidadeTratamento;
    }

    public void setIndContinuidadeTratamento(Boolean indContinuidadeTratamento) {
        IndContinuidadeTratamento = indContinuidadeTratamento;
    }

    public Date getInicioTratamento() {
        return InicioTratamento;
    }

    public void setInicioTratamento(Date inicioTratamento) {
        InicioTratamento = inicioTratamento;
    }

    public EnumTipFinalidadeTratamento getTipFinalidadeTratamento() {
        return TipFinalidadeTratamento;
    }

    public void setTipFinalidadeTratamento(EnumTipFinalidadeTratamento tipFinalidadeTratamento) {
        TipFinalidadeTratamento = tipFinalidadeTratamento;
    }

    public String getCodCid() {
        return CodCid;
    }

    public void setCodCid(String codCid) {
        CodCid = codCid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Radioterapia)) return false;
        Radioterapia that = (Radioterapia) o;
        return Objects.equals(IndContinuidadeTratamento, that.IndContinuidadeTratamento) && Objects.equals(InicioTratamento, that.InicioTratamento) && TipFinalidadeTratamento == that.TipFinalidadeTratamento && Objects.equals(CodCid, that.CodCid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IndContinuidadeTratamento, InicioTratamento, TipFinalidadeTratamento, CodCid);
    }

    public Radioterapia(Boolean indContinuidadeTratamento, Date inicioTratamento, EnumTipFinalidadeTratamento tipFinalidadeTratamento, String codCid) {
        IndContinuidadeTratamento = indContinuidadeTratamento;
        InicioTratamento = inicioTratamento;
        TipFinalidadeTratamento = tipFinalidadeTratamento;
        CodCid = codCid;
    }
}

package com.webserviceapac.WebServiceApac.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.Objects;

@Entity
public class Tratamento_Anteriores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank
    private String CodCid;

    @NotBlank
    private Date DataInicioTratamentoAnterior;

    public Tratamento_Anteriores() {

    }

    public String getCodCid() {
        return CodCid;
    }

    public void setCodCid(String codCid) {
        CodCid = codCid;
    }

    public Date getDataInicioTratamentoAnterior() {
        return DataInicioTratamentoAnterior;
    }

    public void setDataInicioTratamentoAnterior(Date dataInicioTratamentoAnterior) {
        DataInicioTratamentoAnterior = dataInicioTratamentoAnterior;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tratamento_Anteriores)) return false;
        Tratamento_Anteriores that = (Tratamento_Anteriores) o;
        return Objects.equals(getCodCid(), that.getCodCid()) && Objects.equals(getDataInicioTratamentoAnterior(), that.getDataInicioTratamentoAnterior());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodCid(), getDataInicioTratamentoAnterior());
    }

    public Tratamento_Anteriores(String codCid, Date dataInicioTratamentoAnterior) {
        CodCid = codCid;
        DataInicioTratamentoAnterior = dataInicioTratamentoAnterior;
    }
}

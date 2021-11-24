package com.webserviceapac.WebServiceApac.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.Objects;

@Entity
public class Protese_Mamaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank
    private Long CodCnesFces;

    @NotBlank
    private EnumTipMarcaProtese TipMarcaProtese;

    @NotBlank
    private Long VlrAnoImplantacaoProtese;

    public Protese_Mamaria() {

    }

    public Long getCodCnesFces() {
        return CodCnesFces;
    }

    public void setCodCnesFces(Long codCnesFces) {
        CodCnesFces = codCnesFces;
    }

    public EnumTipMarcaProtese getTipMarcaProtese() {
        return TipMarcaProtese;
    }

    public void setTipMarcaProtese(EnumTipMarcaProtese tipMarcaProtese) {
        TipMarcaProtese = tipMarcaProtese;
    }

    public Long getVlrAnoImplantacaoProtese() {
        return VlrAnoImplantacaoProtese;
    }

    public void setVlrAnoImplantacaoProtese(Long vlrAnoImplantacaoProtese) {
        VlrAnoImplantacaoProtese = vlrAnoImplantacaoProtese;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Protese_Mamaria)) return false;
        Protese_Mamaria that = (Protese_Mamaria) o;
        return Objects.equals(getCodCnesFces(), that.getCodCnesFces()) && getTipMarcaProtese() == that.getTipMarcaProtese() && Objects.equals(getVlrAnoImplantacaoProtese(), that.getVlrAnoImplantacaoProtese());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodCnesFces(), getTipMarcaProtese(), getVlrAnoImplantacaoProtese());
    }

    public Protese_Mamaria(Long codCnesFces, EnumTipMarcaProtese tipMarcaProtese, Long vlrAnoImplantacaoProtese) {
        CodCnesFces = codCnesFces;
        TipMarcaProtese = tipMarcaProtese;
        VlrAnoImplantacaoProtese = vlrAnoImplantacaoProtese;
    }
}

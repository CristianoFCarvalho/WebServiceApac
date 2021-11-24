package com.webserviceapac.WebServiceApac.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.Objects;

@Entity
public class Oncologia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank
    private String  DscLocalizacaoTumorPrimario;

    @NotBlank
    private String CodCidTopografia;

    @NotBlank
    private EnunTipLinfonodoReginvadido TipLinfonodoReginvadido;

    @NotBlank
    private Long NumNaoAvaliaveis;

    @NotBlank
    private String DsclocalizacaoMetastase;

    @NotBlank
    private EnumTipoEstadioUICC TipoEstadioUICC ;

    private Long DscEstadioOutro;

    @NotBlank
    private Long NumGrauHistopatologico;

    @NotBlank
    private String DscDiagnosticoCitohistopat;

    @NotBlank
    private Date DatDiagnosticoCitoHistopato;

    public Oncologia() {

    }

    public String getDscLocalizacaoTumorPrimario() {
        return DscLocalizacaoTumorPrimario;
    }

    public void setDscLocalizacaoTumorPrimario(String dscLocalizacaoTumorPrimario) {
        DscLocalizacaoTumorPrimario = dscLocalizacaoTumorPrimario;
    }

    public String getCodCidTopografia() {
        return CodCidTopografia;
    }

    public void setCodCidTopografia(String codCidTopografia) {
        CodCidTopografia = codCidTopografia;
    }

    public EnunTipLinfonodoReginvadido getTipLinfonodoReginvadido() {
        return TipLinfonodoReginvadido;
    }

    public void setTipLinfonodoReginvadido(EnunTipLinfonodoReginvadido tipLinfonodoReginvadido) {
        TipLinfonodoReginvadido = tipLinfonodoReginvadido;
    }

    public Long getNumNaoAvaliaveis() {
        return NumNaoAvaliaveis;
    }

    public void setNumNaoAvaliaveis(Long numNaoAvaliaveis) {
        NumNaoAvaliaveis = numNaoAvaliaveis;
    }

    public String getDsclocalizacaoMetastase() {
        return DsclocalizacaoMetastase;
    }

    public void setDsclocalizacaoMetastase(String dsclocalizacaoMetastase) {
        DsclocalizacaoMetastase = dsclocalizacaoMetastase;
    }

    public EnumTipoEstadioUICC getTipoEstadioUICC() {
        return TipoEstadioUICC;
    }

    public void setTipoEstadioUICC(EnumTipoEstadioUICC tipoEstadioUICC) {
        TipoEstadioUICC = tipoEstadioUICC;
    }

    public Long getDscEstadioOutro() {
        return DscEstadioOutro;
    }

    public void setDscEstadioOutro(Long dscEstadioOutro) {
        DscEstadioOutro = dscEstadioOutro;
    }

    public Long getNumGrauHistopatologico() {
        return NumGrauHistopatologico;
    }

    public void setNumGrauHistopatologico(Long numGrauHistopatologico) {
        NumGrauHistopatologico = numGrauHistopatologico;
    }

    public String getDscDiagnosticoCitohistopat() {
        return DscDiagnosticoCitohistopat;
    }

    public void setDscDiagnosticoCitohistopat(String dscDiagnosticoCitohistopat) {
        DscDiagnosticoCitohistopat = dscDiagnosticoCitohistopat;
    }

    public Date getDatDiagnosticoCitoHistopato() {
        return DatDiagnosticoCitoHistopato;
    }

    public void setDatDiagnosticoCitoHistopato(Date datDiagnosticoCitoHistopato) {
        DatDiagnosticoCitoHistopato = datDiagnosticoCitoHistopato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Oncologia)) return false;
        Oncologia oncologia = (Oncologia) o;
        return Objects.equals(getDscLocalizacaoTumorPrimario(), oncologia.getDscLocalizacaoTumorPrimario()) && Objects.equals(getCodCidTopografia(), oncologia.getCodCidTopografia()) && getTipLinfonodoReginvadido() == oncologia.getTipLinfonodoReginvadido() && Objects.equals(getNumNaoAvaliaveis(), oncologia.getNumNaoAvaliaveis()) && Objects.equals(getDsclocalizacaoMetastase(), oncologia.getDsclocalizacaoMetastase()) && getTipoEstadioUICC() == oncologia.getTipoEstadioUICC() && Objects.equals(getDscEstadioOutro(), oncologia.getDscEstadioOutro()) && Objects.equals(getNumGrauHistopatologico(), oncologia.getNumGrauHistopatologico()) && Objects.equals(getDscDiagnosticoCitohistopat(), oncologia.getDscDiagnosticoCitohistopat()) && Objects.equals(getDatDiagnosticoCitoHistopato(), oncologia.getDatDiagnosticoCitoHistopato());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDscLocalizacaoTumorPrimario(), getCodCidTopografia(), getTipLinfonodoReginvadido(), getNumNaoAvaliaveis(), getDsclocalizacaoMetastase(), getTipoEstadioUICC(), getDscEstadioOutro(), getNumGrauHistopatologico(), getDscDiagnosticoCitohistopat(), getDatDiagnosticoCitoHistopato());
    }

    public Oncologia(String dscLocalizacaoTumorPrimario, String codCidTopografia, EnunTipLinfonodoReginvadido tipLinfonodoReginvadido, Long numNaoAvaliaveis, String dsclocalizacaoMetastase, EnumTipoEstadioUICC tipoEstadioUICC, Long dscEstadioOutro, Long numGrauHistopatologico, String dscDiagnosticoCitohistopat, Date datDiagnosticoCitoHistopato) {
        DscLocalizacaoTumorPrimario = dscLocalizacaoTumorPrimario;
        CodCidTopografia = codCidTopografia;
        TipLinfonodoReginvadido = tipLinfonodoReginvadido;
        NumNaoAvaliaveis = numNaoAvaliaveis;
        DsclocalizacaoMetastase = dsclocalizacaoMetastase;
        TipoEstadioUICC = tipoEstadioUICC;
        DscEstadioOutro = dscEstadioOutro;
        NumGrauHistopatologico = numGrauHistopatologico;
        DscDiagnosticoCitohistopat = dscDiagnosticoCitohistopat;
        DatDiagnosticoCitoHistopato = datDiagnosticoCitoHistopato;
    }
}

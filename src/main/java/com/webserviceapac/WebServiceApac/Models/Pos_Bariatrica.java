package com.webserviceapac.WebServiceApac.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.Objects;

@Entity
public class Pos_Bariatrica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank
    private String VlrImcAtual;

    @NotBlank
    private Long VlrPercPesoPerdido;

    @NotBlank
    private String VlrKgPerdidos;

    @NotBlank
    private String CodTabelaSusOficial;

    @NotBlank
    private Date DatCirurgiaBariatrica;

    @NotBlank
    private Long NumApacCirurgiaBariatrica;

    @NotBlank
    private Long NumMesAcompanhamento;

    @NotBlank
    private Long NumAnoAcompanhamento;

    @NotBlank
    private EnumTipPontuacaoBaros  TipPontuacaoBaros;

    @NotBlank
    private Boolean IndComorbUsoMedicamentos;

    @NotBlank
    private Boolean IndComorbusoPolivitaminicos;

    @NotBlank
    private Boolean IndComorbAtividadeFisica;

    @NotBlank
    private Boolean IndiComorbGanhoPeso;

    @NotBlank
    private Boolean IndComorbAliemtoSaudavel;

    public Pos_Bariatrica() {

    }

    public String getVlrImcAtual() {
        return VlrImcAtual;
    }

    public void setVlrImcAtual(String vlrImcAtual) {
        VlrImcAtual = vlrImcAtual;
    }

    public Long getVlrPercPesoPerdido() {
        return VlrPercPesoPerdido;
    }

    public void setVlrPercPesoPerdido(Long vlrPercPesoPerdido) {
        VlrPercPesoPerdido = vlrPercPesoPerdido;
    }

    public String getVlrKgPerdidos() {
        return VlrKgPerdidos;
    }

    public void setVlrKgPerdidos(String vlrKgPerdidos) {
        VlrKgPerdidos = vlrKgPerdidos;
    }

    public String getCodTabelaSusOficial() {
        return CodTabelaSusOficial;
    }

    public void setCodTabelaSusOficial(String codTabelaSusOficial) {
        CodTabelaSusOficial = codTabelaSusOficial;
    }

    public Date getDatCirurgiaBariatrica() {
        return DatCirurgiaBariatrica;
    }

    public void setDatCirurgiaBariatrica(Date datCirurgiaBariatrica) {
        DatCirurgiaBariatrica = datCirurgiaBariatrica;
    }

    public Long getNumApacCirurgiaBariatrica() {
        return NumApacCirurgiaBariatrica;
    }

    public void setNumApacCirurgiaBariatrica(Long numApacCirurgiaBariatrica) {
        NumApacCirurgiaBariatrica = numApacCirurgiaBariatrica;
    }

    public Long getNumMesAcompanhamento() {
        return NumMesAcompanhamento;
    }

    public void setNumMesAcompanhamento(Long numMesAcompanhamento) {
        NumMesAcompanhamento = numMesAcompanhamento;
    }

    public Long getNumAnoAcompanhamento() {
        return NumAnoAcompanhamento;
    }

    public void setNumAnoAcompanhamento(Long numAnoAcompanhamento) {
        NumAnoAcompanhamento = numAnoAcompanhamento;
    }

    public EnumTipPontuacaoBaros getTipPontuacaoBaros() {
        return TipPontuacaoBaros;
    }

    public void setTipPontuacaoBaros(EnumTipPontuacaoBaros tipPontuacaoBaros) {
        TipPontuacaoBaros = tipPontuacaoBaros;
    }

    public Boolean getIndComorbUsoMedicamentos() {
        return IndComorbUsoMedicamentos;
    }

    public void setIndComorbUsoMedicamentos(Boolean indComorbUsoMedicamentos) {
        IndComorbUsoMedicamentos = indComorbUsoMedicamentos;
    }

    public Boolean getIndComorbusoPolivitaminicos() {
        return IndComorbusoPolivitaminicos;
    }

    public void setIndComorbusoPolivitaminicos(Boolean indComorbusoPolivitaminicos) {
        IndComorbusoPolivitaminicos = indComorbusoPolivitaminicos;
    }

    public Boolean getIndComorbAtividadeFisica() {
        return IndComorbAtividadeFisica;
    }

    public void setIndComorbAtividadeFisica(Boolean indComorbAtividadeFisica) {
        IndComorbAtividadeFisica = indComorbAtividadeFisica;
    }

    public Boolean getIndiComorbGanhoPeso() {
        return IndiComorbGanhoPeso;
    }

    public void setIndiComorbGanhoPeso(Boolean indiComorbGanhoPeso) {
        IndiComorbGanhoPeso = indiComorbGanhoPeso;
    }

    public Boolean getIndComorbAliemtoSaudavel() {
        return IndComorbAliemtoSaudavel;
    }

    public void setIndComorbAliemtoSaudavel(Boolean indComorbAliemtoSaudavel) {
        IndComorbAliemtoSaudavel = indComorbAliemtoSaudavel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pos_Bariatrica)) return false;
        Pos_Bariatrica that = (Pos_Bariatrica) o;
        return Objects.equals(getVlrImcAtual(), that.getVlrImcAtual()) && Objects.equals(getVlrPercPesoPerdido(), that.getVlrPercPesoPerdido()) && Objects.equals(getVlrKgPerdidos(), that.getVlrKgPerdidos()) && Objects.equals(getCodTabelaSusOficial(), that.getCodTabelaSusOficial()) && Objects.equals(getDatCirurgiaBariatrica(), that.getDatCirurgiaBariatrica()) && Objects.equals(getNumApacCirurgiaBariatrica(), that.getNumApacCirurgiaBariatrica()) && Objects.equals(getNumMesAcompanhamento(), that.getNumMesAcompanhamento()) && Objects.equals(getNumAnoAcompanhamento(), that.getNumAnoAcompanhamento()) && getTipPontuacaoBaros() == that.getTipPontuacaoBaros() && Objects.equals(getIndComorbUsoMedicamentos(), that.getIndComorbUsoMedicamentos()) && Objects.equals(getIndComorbusoPolivitaminicos(), that.getIndComorbusoPolivitaminicos()) && Objects.equals(getIndComorbAtividadeFisica(), that.getIndComorbAtividadeFisica()) && Objects.equals(getIndiComorbGanhoPeso(), that.getIndiComorbGanhoPeso()) && Objects.equals(getIndComorbAliemtoSaudavel(), that.getIndComorbAliemtoSaudavel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVlrImcAtual(), getVlrPercPesoPerdido(), getVlrKgPerdidos(), getCodTabelaSusOficial(), getDatCirurgiaBariatrica(), getNumApacCirurgiaBariatrica(), getNumMesAcompanhamento(), getNumAnoAcompanhamento(), getTipPontuacaoBaros(), getIndComorbUsoMedicamentos(), getIndComorbusoPolivitaminicos(), getIndComorbAtividadeFisica(), getIndiComorbGanhoPeso(), getIndComorbAliemtoSaudavel());
    }

    public Pos_Bariatrica(String vlrImcAtual, Long vlrPercPesoPerdido, String vlrKgPerdidos, String codTabelaSusOficial, Date datCirurgiaBariatrica, Long numApacCirurgiaBariatrica, Long numMesAcompanhamento, Long numAnoAcompanhamento, EnumTipPontuacaoBaros tipPontuacaoBaros, Boolean indComorbUsoMedicamentos, Boolean indComorbusoPolivitaminicos, Boolean indComorbAtividadeFisica, Boolean indiComorbGanhoPeso, Boolean indComorbAliemtoSaudavel) {
        VlrImcAtual = vlrImcAtual;
        VlrPercPesoPerdido = vlrPercPesoPerdido;
        VlrKgPerdidos = vlrKgPerdidos;
        CodTabelaSusOficial = codTabelaSusOficial;
        DatCirurgiaBariatrica = datCirurgiaBariatrica;
        NumApacCirurgiaBariatrica = numApacCirurgiaBariatrica;
        NumMesAcompanhamento = numMesAcompanhamento;
        NumAnoAcompanhamento = numAnoAcompanhamento;
        TipPontuacaoBaros = tipPontuacaoBaros;
        IndComorbUsoMedicamentos = indComorbUsoMedicamentos;
        IndComorbusoPolivitaminicos = indComorbusoPolivitaminicos;
        IndComorbAtividadeFisica = indComorbAtividadeFisica;
        IndiComorbGanhoPeso = indiComorbGanhoPeso;
        IndComorbAliemtoSaudavel = indComorbAliemtoSaudavel;
    }
}

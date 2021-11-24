package com.webserviceapac.WebServiceApac.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.Objects;

@Entity
public class Pre_Bariatrica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank
    private Date DatPrimeiraAvaliacao;

    @NotBlank
    private String VlrImcPrimAvaliacao;

    @NotBlank
    private String VlrPeso;

    @NotBlank
    private Date DatAvaliacaoAtual;

    @NotBlank
    private String  ValorImcAtual;

    @NotBlank
    private EnumTipPontuacaoBaros TipPontuacaoBaros;

    @NotBlank
    private Boolean IndComorbUsoMedicamento;

    @NotBlank
    private Boolean IndComorbAtividadeFisica;

    @NotBlank
    private Boolean IndImcPerdaPonderal;

    @NotBlank
    private Boolean IndParticipaReuniaoGrupo;

    @NotBlank
    private Boolean IndAvaliacaoRiscosCirurgico;

    @NotBlank
    private EnumTipoOcupacaoAvaliacao TipoOcupacaoAvaliacao;

    @NotBlank
    private Boolean IndRealizadoExamesLaboratr;

    @NotBlank
    private EnumIndAptoProcedCirurgico IndAptoProcedCirurgico;

    @NotBlank
    private String ListaExamesPreBariatrica;

    @NotBlank
    private String ListaCidComorbiPreBariatrica;

    public Pre_Bariatrica() {

    }

    public Date getDatPrimeiraAvaliacao() {
        return DatPrimeiraAvaliacao;
    }

    public void setDatPrimeiraAvaliacao(Date datPrimeiraAvaliacao) {
        DatPrimeiraAvaliacao = datPrimeiraAvaliacao;
    }

    public String getVlrImcPrimAvaliacao() {
        return VlrImcPrimAvaliacao;
    }

    public void setVlrImcPrimAvaliacao(String vlrImcPrimAvaliacao) {
        VlrImcPrimAvaliacao = vlrImcPrimAvaliacao;
    }

    public String getVlrPeso() {
        return VlrPeso;
    }

    public void setVlrPeso(String vlrPeso) {
        VlrPeso = vlrPeso;
    }

    public Date getDatAvaliacaoAtual() {
        return DatAvaliacaoAtual;
    }

    public void setDatAvaliacaoAtual(Date datAvaliacaoAtual) {
        DatAvaliacaoAtual = datAvaliacaoAtual;
    }

    public String getValorImcAtual() {
        return ValorImcAtual;
    }

    public void setValorImcAtual(String valorImcAtual) {
        ValorImcAtual = valorImcAtual;
    }

    public EnumTipPontuacaoBaros getTipPontuacaoBaros() {
        return TipPontuacaoBaros;
    }

    public void setTipPontuacaoBaros(EnumTipPontuacaoBaros tipPontuacaoBaros) {
        TipPontuacaoBaros = tipPontuacaoBaros;
    }

    public Boolean getIndComorbUsoMedicamento() {
        return IndComorbUsoMedicamento;
    }

    public void setIndComorbUsoMedicamento(Boolean indComorbUsoMedicamento) {
        IndComorbUsoMedicamento = indComorbUsoMedicamento;
    }

    public Boolean getIndComorbAtividadeFisica() {
        return IndComorbAtividadeFisica;
    }

    public void setIndComorbAtividadeFisica(Boolean indComorbAtividadeFisica) {
        IndComorbAtividadeFisica = indComorbAtividadeFisica;
    }

    public Boolean getIndImcPerdaPonderal() {
        return IndImcPerdaPonderal;
    }

    public void setIndImcPerdaPonderal(Boolean indImcPerdaPonderal) {
        IndImcPerdaPonderal = indImcPerdaPonderal;
    }

    public Boolean getIndParticipaReuniaoGrupo() {
        return IndParticipaReuniaoGrupo;
    }

    public void setIndParticipaReuniaoGrupo(Boolean indParticipaReuniaoGrupo) {
        IndParticipaReuniaoGrupo = indParticipaReuniaoGrupo;
    }

    public Boolean getIndAvaliacaoRiscosCirurgico() {
        return IndAvaliacaoRiscosCirurgico;
    }

    public void setIndAvaliacaoRiscosCirurgico(Boolean indAvaliacaoRiscosCirurgico) {
        IndAvaliacaoRiscosCirurgico = indAvaliacaoRiscosCirurgico;
    }

    public EnumTipoOcupacaoAvaliacao getTipoOcupacaoAvaliacao() {
        return TipoOcupacaoAvaliacao;
    }

    public void setTipoOcupacaoAvaliacao(EnumTipoOcupacaoAvaliacao tipoOcupacaoAvaliacao) {
        TipoOcupacaoAvaliacao = tipoOcupacaoAvaliacao;
    }

    public Boolean getIndRealizadoExamesLaboratr() {
        return IndRealizadoExamesLaboratr;
    }

    public void setIndRealizadoExamesLaboratr(Boolean indRealizadoExamesLaboratr) {
        IndRealizadoExamesLaboratr = indRealizadoExamesLaboratr;
    }

    public EnumIndAptoProcedCirurgico getIndAptoProcedCirurgico() {
        return IndAptoProcedCirurgico;
    }

    public void setIndAptoProcedCirurgico(EnumIndAptoProcedCirurgico indAptoProcedCirurgico) {
        IndAptoProcedCirurgico = indAptoProcedCirurgico;
    }

    public String getListaExamesPreBariatrica() {
        return ListaExamesPreBariatrica;
    }

    public void setListaExamesPreBariatrica(String listaExamesPreBariatrica) {
        ListaExamesPreBariatrica = listaExamesPreBariatrica;
    }

    public String getListaCidComorbiPreBariatrica() {
        return ListaCidComorbiPreBariatrica;
    }

    public void setListaCidComorbiPreBariatrica(String listaCidComorbiPreBariatrica) {
        ListaCidComorbiPreBariatrica = listaCidComorbiPreBariatrica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pre_Bariatrica)) return false;
        Pre_Bariatrica that = (Pre_Bariatrica) o;
        return Objects.equals(getDatPrimeiraAvaliacao(), that.getDatPrimeiraAvaliacao()) && Objects.equals(getVlrImcPrimAvaliacao(), that.getVlrImcPrimAvaliacao()) && Objects.equals(getVlrPeso(), that.getVlrPeso()) && Objects.equals(getDatAvaliacaoAtual(), that.getDatAvaliacaoAtual()) && Objects.equals(getValorImcAtual(), that.getValorImcAtual()) && getTipPontuacaoBaros() == that.getTipPontuacaoBaros() && Objects.equals(getIndComorbUsoMedicamento(), that.getIndComorbUsoMedicamento()) && Objects.equals(getIndComorbAtividadeFisica(), that.getIndComorbAtividadeFisica()) && Objects.equals(getIndImcPerdaPonderal(), that.getIndImcPerdaPonderal()) && Objects.equals(getIndParticipaReuniaoGrupo(), that.getIndParticipaReuniaoGrupo()) && Objects.equals(getIndAvaliacaoRiscosCirurgico(), that.getIndAvaliacaoRiscosCirurgico()) && getTipoOcupacaoAvaliacao() == that.getTipoOcupacaoAvaliacao() && Objects.equals(getIndRealizadoExamesLaboratr(), that.getIndRealizadoExamesLaboratr()) && getIndAptoProcedCirurgico() == that.getIndAptoProcedCirurgico() && Objects.equals(getListaExamesPreBariatrica(), that.getListaExamesPreBariatrica()) && Objects.equals(getListaCidComorbiPreBariatrica(), that.getListaCidComorbiPreBariatrica());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDatPrimeiraAvaliacao(), getVlrImcPrimAvaliacao(), getVlrPeso(), getDatAvaliacaoAtual(), getValorImcAtual(), getTipPontuacaoBaros(), getIndComorbUsoMedicamento(), getIndComorbAtividadeFisica(), getIndImcPerdaPonderal(), getIndParticipaReuniaoGrupo(), getIndAvaliacaoRiscosCirurgico(), getTipoOcupacaoAvaliacao(), getIndRealizadoExamesLaboratr(), getIndAptoProcedCirurgico(), getListaExamesPreBariatrica(), getListaCidComorbiPreBariatrica());
    }

    public Pre_Bariatrica(Date datPrimeiraAvaliacao, String vlrImcPrimAvaliacao, String vlrPeso, Date datAvaliacaoAtual, String valorImcAtual, EnumTipPontuacaoBaros tipPontuacaoBaros, Boolean indComorbUsoMedicamento, Boolean indComorbAtividadeFisica, Boolean indImcPerdaPonderal, Boolean indParticipaReuniaoGrupo, Boolean indAvaliacaoRiscosCirurgico, EnumTipoOcupacaoAvaliacao tipoOcupacaoAvaliacao, Boolean indRealizadoExamesLaboratr, EnumIndAptoProcedCirurgico indAptoProcedCirurgico, String listaExamesPreBariatrica, String listaCidComorbiPreBariatrica) {
        DatPrimeiraAvaliacao = datPrimeiraAvaliacao;
        VlrImcPrimAvaliacao = vlrImcPrimAvaliacao;
        VlrPeso = vlrPeso;
        DatAvaliacaoAtual = datAvaliacaoAtual;
        ValorImcAtual = valorImcAtual;
        TipPontuacaoBaros = tipPontuacaoBaros;
        IndComorbUsoMedicamento = indComorbUsoMedicamento;
        IndComorbAtividadeFisica = indComorbAtividadeFisica;
        IndImcPerdaPonderal = indImcPerdaPonderal;
        IndParticipaReuniaoGrupo = indParticipaReuniaoGrupo;
        IndAvaliacaoRiscosCirurgico = indAvaliacaoRiscosCirurgico;
        TipoOcupacaoAvaliacao = tipoOcupacaoAvaliacao;
        IndRealizadoExamesLaboratr = indRealizadoExamesLaboratr;
        IndAptoProcedCirurgico = indAptoProcedCirurgico;
        ListaExamesPreBariatrica = listaExamesPreBariatrica;
        ListaCidComorbiPreBariatrica = listaCidComorbiPreBariatrica;
    }
}

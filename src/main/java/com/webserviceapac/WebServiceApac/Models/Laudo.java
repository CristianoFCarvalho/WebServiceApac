package com.webserviceapac.WebServiceApac.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.Objects;

@Entity


public class Laudo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CodigoLaudo;

    @NotBlank
    private Long CodLaudoPrestador;

    @NotBlank
    private Long CnesSolicitante  ;

    @NotBlank
    private Long CnesExecutante;

    @NotBlank
    private EnumTipoAPAC TipoAPAC;

    @NotBlank
    private DateTime DataInicioValidade;

    @NotBlank
    private DateTime DataFimValidade;

    @NotBlank
    private String DescricaoDiagnosticoInicial;

    private String Observacao;

    @NotBlank
    private String CodigoCidPrincipal;


    private Long CodCidSecundario;

    private String CodigoCidCausasAssociadas;

    @NotBlank
    private String NumCNSProfissionalSolicitante;


    private String NumCPFProfisionalSolicitante ;

    @NotBlank
    private String NomeProfissionalSolicitante;

    private EnumSiglaOrgaoProfissional SgOrgaoProfissionalSolicitante ;

    @NotBlank
    private String UfConsProfissionalSolicitante ;

    @NotBlank
    private String  NumConsProfissionalSolicitante ;

    @NotBlank
    private String NumCboProfissionalSolicitante;

    @NotBlank
    private Date DataSolicitacao;

    @NotBlank
    private EnumCodigoCaraterInternacao CodigoCaraterInternacao ;

    @NotBlank
    private String CodTabelaSusPrincipal;

    @NotBlank
    private Long NumSessoes1Mes;

    @NotBlank
    private Long NumSessoes2mes;

    @NotBlank
    private Long NumSessoes3Mes;

    public Laudo() {

    }

    public Long getCodigoLaudo() {
        return CodigoLaudo;
    }

    public void setCodigoLaudo(Long codigoLaudo) {
        CodigoLaudo = codigoLaudo;
    }

    public Long getCodLaudoPrestador() {
        return CodLaudoPrestador;
    }

    public void setCodLaudoPrestador(Long codLaudoPrestador) {
        CodLaudoPrestador = codLaudoPrestador;
    }

    public Long getCnesSolicitante() {
        return CnesSolicitante;
    }

    public void setCnesSolicitante(Long cnesSolicitante) {
        CnesSolicitante = cnesSolicitante;
    }

    public Long getCnesExecutante() {
        return CnesExecutante;
    }

    public void setCnesExecutante(Long cnesExecutante) {
        CnesExecutante = cnesExecutante;
    }

    public EnumTipoAPAC getTipoAPAC() {
        return TipoAPAC;
    }

    public void setTipoAPAC(EnumTipoAPAC tipoAPAC) {
        TipoAPAC = tipoAPAC;
    }

    public DateTime getDataInicioValidade() {
        return DataInicioValidade;
    }

    public void setDataInicioValidade(DateTime dataInicioValidade) {
        DataInicioValidade = dataInicioValidade;
    }

    public DateTime getDataFimValidade() {
        return DataFimValidade;
    }

    public void setDataFimValidade(DateTime dataFimValidade) {
        DataFimValidade = dataFimValidade;
    }

    public String getDescricaoDiagnosticoInicial() {
        return DescricaoDiagnosticoInicial;
    }

    public void setDescricaoDiagnosticoInicial(String descricaoDiagnosticoInicial) {
        DescricaoDiagnosticoInicial = descricaoDiagnosticoInicial;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String observacao) {
        Observacao = observacao;
    }

    public String getCodigoCidPrincipal() {
        return CodigoCidPrincipal;
    }

    public void setCodigoCidPrincipal(String codigoCidPrincipal) {
        CodigoCidPrincipal = codigoCidPrincipal;
    }

    public Long getCodCidSecundario() {
        return CodCidSecundario;
    }

    public void setCodCidSecundario(Long codCidSecundario) {
        CodCidSecundario = codCidSecundario;
    }

    public String getCodigoCidCausasAssociadas() {
        return CodigoCidCausasAssociadas;
    }

    public void setCodigoCidCausasAssociadas(String codigoCidCausasAssociadas) {
        CodigoCidCausasAssociadas = codigoCidCausasAssociadas;
    }

    public String getNumCNSProfissionalSolicitante() {
        return NumCNSProfissionalSolicitante;
    }

    public void setNumCNSProfissionalSolicitante(String numCNSProfissionalSolicitante) {
        NumCNSProfissionalSolicitante = numCNSProfissionalSolicitante;
    }

    public String getNumCPFProfisionalSolicitante() {
        return NumCPFProfisionalSolicitante;
    }

    public void setNumCPFProfisionalSolicitante(String numCPFProfisionalSolicitante) {
        NumCPFProfisionalSolicitante = numCPFProfisionalSolicitante;
    }

    public String getNomeProfissionalSolicitante() {
        return NomeProfissionalSolicitante;
    }

    public void setNomeProfissionalSolicitante(String nomeProfissionalSolicitante) {
        NomeProfissionalSolicitante = nomeProfissionalSolicitante;
    }

    public EnumSiglaOrgaoProfissional getSgOrgaoProfissionalSolicitante() {
        return SgOrgaoProfissionalSolicitante;
    }

    public void setSgOrgaoProfissionalSolicitante(EnumSiglaOrgaoProfissional sgOrgaoProfissionalSolicitante) {
        SgOrgaoProfissionalSolicitante = sgOrgaoProfissionalSolicitante;
    }

    public String getUfConsProfissionalSolicitante() {
        return UfConsProfissionalSolicitante;
    }

    public void setUfConsProfissionalSolicitante(String ufConsProfissionalSolicitante) {
        UfConsProfissionalSolicitante = ufConsProfissionalSolicitante;
    }

    public String getNumConsProfissionalSolicitante() {
        return NumConsProfissionalSolicitante;
    }

    public void setNumConsProfissionalSolicitante(String numConsProfissionalSolicitante) {
        NumConsProfissionalSolicitante = numConsProfissionalSolicitante;
    }

    public String getNumCboProfissionalSolicitante() {
        return NumCboProfissionalSolicitante;
    }

    public void setNumCboProfissionalSolicitante(String numCboProfissionalSolicitante) {
        NumCboProfissionalSolicitante = numCboProfissionalSolicitante;
    }

    public Date getDataSolicitacao() {
        return DataSolicitacao;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        DataSolicitacao = dataSolicitacao;
    }

    public EnumCodigoCaraterInternacao getCodigoCaraterInternacao() {
        return CodigoCaraterInternacao;
    }

    public void setCodigoCaraterInternacao(EnumCodigoCaraterInternacao codigoCaraterInternacao) {
        CodigoCaraterInternacao = codigoCaraterInternacao;
    }

    public String getCodTabelaSusPrincipal() {
        return CodTabelaSusPrincipal;
    }

    public void setCodTabelaSusPrincipal(String codTabelaSusPrincipal) {
        CodTabelaSusPrincipal = codTabelaSusPrincipal;
    }

    public Long getNumSessoes1Mes() {
        return NumSessoes1Mes;
    }

    public void setNumSessoes1Mes(Long numSessoes1Mes) {
        NumSessoes1Mes = numSessoes1Mes;
    }

    public Long getNumSessoes2mes() {
        return NumSessoes2mes;
    }

    public void setNumSessoes2mes(Long numSessoes2mes) {
        NumSessoes2mes = numSessoes2mes;
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
        if (!(o instanceof Laudo)) return false;
        Laudo laudo = (Laudo) o;
        return Objects.equals(getCodigoLaudo(), laudo.getCodigoLaudo()) && Objects.equals(getCodLaudoPrestador(), laudo.getCodLaudoPrestador()) && Objects.equals(getCnesSolicitante(), laudo.getCnesSolicitante()) && Objects.equals(getCnesExecutante(), laudo.getCnesExecutante()) && getTipoAPAC() == laudo.getTipoAPAC() && Objects.equals(getDataInicioValidade(), laudo.getDataInicioValidade()) && Objects.equals(getDataFimValidade(), laudo.getDataFimValidade()) && Objects.equals(getDescricaoDiagnosticoInicial(), laudo.getDescricaoDiagnosticoInicial()) && Objects.equals(getObservacao(), laudo.getObservacao()) && Objects.equals(getCodigoCidPrincipal(), laudo.getCodigoCidPrincipal()) && Objects.equals(getCodCidSecundario(), laudo.getCodCidSecundario()) && Objects.equals(getCodigoCidCausasAssociadas(), laudo.getCodigoCidCausasAssociadas()) && Objects.equals(getNumCNSProfissionalSolicitante(), laudo.getNumCNSProfissionalSolicitante()) && Objects.equals(getNumCPFProfisionalSolicitante(), laudo.getNumCPFProfisionalSolicitante()) && Objects.equals(getNomeProfissionalSolicitante(), laudo.getNomeProfissionalSolicitante()) && getSgOrgaoProfissionalSolicitante() == laudo.getSgOrgaoProfissionalSolicitante() && Objects.equals(getUfConsProfissionalSolicitante(), laudo.getUfConsProfissionalSolicitante()) && Objects.equals(getNumConsProfissionalSolicitante(), laudo.getNumConsProfissionalSolicitante()) && Objects.equals(getNumCboProfissionalSolicitante(), laudo.getNumCboProfissionalSolicitante()) && Objects.equals(getDataSolicitacao(), laudo.getDataSolicitacao()) && getCodigoCaraterInternacao() == laudo.getCodigoCaraterInternacao() && Objects.equals(getCodTabelaSusPrincipal(), laudo.getCodTabelaSusPrincipal()) && Objects.equals(getNumSessoes1Mes(), laudo.getNumSessoes1Mes()) && Objects.equals(getNumSessoes2mes(), laudo.getNumSessoes2mes()) && Objects.equals(getNumSessoes3Mes(), laudo.getNumSessoes3Mes());
    }

    public Laudo(Long codigoLaudo, Long codLaudoPrestador, Long cnesSolicitante, Long cnesExecutante, EnumTipoAPAC tipoAPAC, DateTime dataInicioValidade, DateTime dataFimValidade, String descricaoDiagnosticoInicial, String observacao, String codigoCidPrincipal, Long codCidSecundario, String codigoCidCausasAssociadas, String numCNSProfissionalSolicitante, String numCPFProfisionalSolicitante, String nomeProfissionalSolicitante, EnumSiglaOrgaoProfissional sgOrgaoProfissionalSolicitante, String ufConsProfissionalSolicitante, String numConsProfissionalSolicitante, String numCboProfissionalSolicitante, Date dataSolicitacao, EnumCodigoCaraterInternacao codigoCaraterInternacao, String codTabelaSusPrincipal, Long numSessoes1Mes, Long numSessoes2mes, Long numSessoes3Mes) {
        CodigoLaudo = codigoLaudo;
        CodLaudoPrestador = codLaudoPrestador;
        CnesSolicitante = cnesSolicitante;
        CnesExecutante = cnesExecutante;
        TipoAPAC = tipoAPAC;
        DataInicioValidade = dataInicioValidade;
        DataFimValidade = dataFimValidade;
        DescricaoDiagnosticoInicial = descricaoDiagnosticoInicial;
        Observacao = observacao;
        CodigoCidPrincipal = codigoCidPrincipal;
        CodCidSecundario = codCidSecundario;
        CodigoCidCausasAssociadas = codigoCidCausasAssociadas;
        NumCNSProfissionalSolicitante = numCNSProfissionalSolicitante;
        NumCPFProfisionalSolicitante = numCPFProfisionalSolicitante;
        NomeProfissionalSolicitante = nomeProfissionalSolicitante;
        SgOrgaoProfissionalSolicitante = sgOrgaoProfissionalSolicitante;
        UfConsProfissionalSolicitante = ufConsProfissionalSolicitante;
        NumConsProfissionalSolicitante = numConsProfissionalSolicitante;
        NumCboProfissionalSolicitante = numCboProfissionalSolicitante;
        DataSolicitacao = dataSolicitacao;
        CodigoCaraterInternacao = codigoCaraterInternacao;
        CodTabelaSusPrincipal = codTabelaSusPrincipal;
        NumSessoes1Mes = numSessoes1Mes;
        NumSessoes2mes = numSessoes2mes;
        NumSessoes3Mes = numSessoes3Mes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoLaudo(), getCodLaudoPrestador(), getCnesSolicitante(), getCnesExecutante(), getTipoAPAC(), getDataInicioValidade(), getDataFimValidade(), getDescricaoDiagnosticoInicial(), getObservacao(), getCodigoCidPrincipal(), getCodCidSecundario(), getCodigoCidCausasAssociadas(), getNumCNSProfissionalSolicitante(), getNumCPFProfisionalSolicitante(), getNomeProfissionalSolicitante(), getSgOrgaoProfissionalSolicitante(), getUfConsProfissionalSolicitante(), getNumConsProfissionalSolicitante(), getNumCboProfissionalSolicitante(), getDataSolicitacao(), getCodigoCaraterInternacao(), getCodTabelaSusPrincipal(), getNumSessoes1Mes(), getNumSessoes2mes(), getNumSessoes3Mes());



    }
}

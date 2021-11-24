package com.webserviceapac.WebServiceApac.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.Objects;

@Entity
public class Nefrologia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank
    private Date DataPrimeiraDialiseRealizada;

    @NotBlank
    private String VlrPeso;

    @NotBlank
    private String VlrAltura;

    @NotBlank
    private String VlrDiurese;

    @NotBlank
    private String VlrGlicose;

    @NotBlank
    private String VlrAlbimina;

    @NotBlank
    private String VlrHbPrimeroAtendimento;

    @NotBlank
    private Boolean IndAcessoVascular;

    @NotBlank
    private Boolean IndHivPrimeiroAtendimento;

    @NotBlank
    private Boolean IndHcvPrimeiroAtendimento;

    @NotBlank
    private Boolean IndHbsagPrimAtendimento;

    @NotBlank
    private Boolean IndUltrasonografiaAbdominal;

    @NotBlank
    private String VlrHbSeguimento;

    @NotBlank
    private String VlrAlbuminaSeguimento ;

    @NotBlank
    private Long VlrIntervencaoFistola;

    @NotBlank
    private Boolean IndListaCncdo;

    @NotBlank
    private Boolean IndHivSeguimento;

    @NotBlank
    private Boolean IndHcvSeguimento;

    @NotBlank
    private Boolean IndHbsagSeguimento;

    @NotBlank
    private Long NumSessoes1Mes;

    private Long NumSessoes2Mes;

    private Long NumSessoes3Mes;

    public Nefrologia() {

    }

    public Date getDataPrimeiraDialiseRealizada() {
        return DataPrimeiraDialiseRealizada;
    }

    public void setDataPrimeiraDialiseRealizada(Date dataPrimeiraDialiseRealizada) {
        DataPrimeiraDialiseRealizada = dataPrimeiraDialiseRealizada;
    }

    public String getVlrPeso() {
        return VlrPeso;
    }

    public void setVlrPeso(String vlrPeso) {
        VlrPeso = vlrPeso;
    }

    public String getVlrAltura() {
        return VlrAltura;
    }

    public void setVlrAltura(String vlrAltura) {
        VlrAltura = vlrAltura;
    }

    public String getVlrDiurese() {
        return VlrDiurese;
    }

    public void setVlrDiurese(String vlrDiurese) {
        VlrDiurese = vlrDiurese;
    }

    public String getVlrGlicose() {
        return VlrGlicose;
    }

    public void setVlrGlicose(String vlrGlicose) {
        VlrGlicose = vlrGlicose;
    }

    public String getVlrAlbimina() {
        return VlrAlbimina;
    }

    public void setVlrAlbimina(String vlrAlbimina) {
        VlrAlbimina = vlrAlbimina;
    }

    public String getVlrHbPrimeroAtendimento() {
        return VlrHbPrimeroAtendimento;
    }

    public void setVlrHbPrimeroAtendimento(String vlrHbPrimeroAtendimento) {
        VlrHbPrimeroAtendimento = vlrHbPrimeroAtendimento;
    }

    public Boolean getIndAcessoVascular() {
        return IndAcessoVascular;
    }

    public void setIndAcessoVascular(Boolean indAcessoVascular) {
        IndAcessoVascular = indAcessoVascular;
    }

    public Boolean getIndHivPrimeiroAtendimento() {
        return IndHivPrimeiroAtendimento;
    }

    public void setIndHivPrimeiroAtendimento(Boolean indHivPrimeiroAtendimento) {
        IndHivPrimeiroAtendimento = indHivPrimeiroAtendimento;
    }

    public Boolean getIndHcvPrimeiroAtendimento() {
        return IndHcvPrimeiroAtendimento;
    }

    public void setIndHcvPrimeiroAtendimento(Boolean indHcvPrimeiroAtendimento) {
        IndHcvPrimeiroAtendimento = indHcvPrimeiroAtendimento;
    }

    public Boolean getIndHbsagPrimAtendimento() {
        return IndHbsagPrimAtendimento;
    }

    public void setIndHbsagPrimAtendimento(Boolean indHbsagPrimAtendimento) {
        IndHbsagPrimAtendimento = indHbsagPrimAtendimento;
    }

    public Boolean getIndUltrasonografiaAbdominal() {
        return IndUltrasonografiaAbdominal;
    }

    public void setIndUltrasonografiaAbdominal(Boolean indUltrasonografiaAbdominal) {
        IndUltrasonografiaAbdominal = indUltrasonografiaAbdominal;
    }

    public String getVlrHbSeguimento() {
        return VlrHbSeguimento;
    }

    public void setVlrHbSeguimento(String vlrHbSeguimento) {
        VlrHbSeguimento = vlrHbSeguimento;
    }

    public String getVlrAlbuminaSeguimento() {
        return VlrAlbuminaSeguimento;
    }

    public void setVlrAlbuminaSeguimento(String vlrAlbuminaSeguimento) {
        VlrAlbuminaSeguimento = vlrAlbuminaSeguimento;
    }

    public Long getVlrIntervencaoFistola() {
        return VlrIntervencaoFistola;
    }

    public void setVlrIntervencaoFistola(Long vlrIntervencaoFistola) {
        VlrIntervencaoFistola = vlrIntervencaoFistola;
    }

    public Boolean getIndListaCncdo() {
        return IndListaCncdo;
    }

    public void setIndListaCncdo(Boolean indListaCncdo) {
        IndListaCncdo = indListaCncdo;
    }

    public Boolean getIndHivSeguimento() {
        return IndHivSeguimento;
    }

    public void setIndHivSeguimento(Boolean indHivSeguimento) {
        IndHivSeguimento = indHivSeguimento;
    }

    public Boolean getIndHcvSeguimento() {
        return IndHcvSeguimento;
    }

    public void setIndHcvSeguimento(Boolean indHcvSeguimento) {
        IndHcvSeguimento = indHcvSeguimento;
    }

    public Boolean getIndHbsagSeguimento() {
        return IndHbsagSeguimento;
    }

    public void setIndHbsagSeguimento(Boolean indHbsagSeguimento) {
        IndHbsagSeguimento = indHbsagSeguimento;
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
        if (!(o instanceof Nefrologia)) return false;
        Nefrologia that = (Nefrologia) o;
        return Objects.equals(getDataPrimeiraDialiseRealizada(), that.getDataPrimeiraDialiseRealizada()) && Objects.equals(getVlrPeso(), that.getVlrPeso()) && Objects.equals(getVlrAltura(), that.getVlrAltura()) && Objects.equals(getVlrDiurese(), that.getVlrDiurese()) && Objects.equals(getVlrGlicose(), that.getVlrGlicose()) && Objects.equals(getVlrAlbimina(), that.getVlrAlbimina()) && Objects.equals(getVlrHbPrimeroAtendimento(), that.getVlrHbPrimeroAtendimento()) && Objects.equals(getIndAcessoVascular(), that.getIndAcessoVascular()) && Objects.equals(getIndHivPrimeiroAtendimento(), that.getIndHivPrimeiroAtendimento()) && Objects.equals(getIndHcvPrimeiroAtendimento(), that.getIndHcvPrimeiroAtendimento()) && Objects.equals(getIndHbsagPrimAtendimento(), that.getIndHbsagPrimAtendimento()) && Objects.equals(getIndUltrasonografiaAbdominal(), that.getIndUltrasonografiaAbdominal()) && Objects.equals(getVlrHbSeguimento(), that.getVlrHbSeguimento()) && Objects.equals(getVlrAlbuminaSeguimento(), that.getVlrAlbuminaSeguimento()) && Objects.equals(getVlrIntervencaoFistola(), that.getVlrIntervencaoFistola()) && Objects.equals(getIndListaCncdo(), that.getIndListaCncdo()) && Objects.equals(getIndHivSeguimento(), that.getIndHivSeguimento()) && Objects.equals(getIndHcvSeguimento(), that.getIndHcvSeguimento()) && Objects.equals(getIndHbsagSeguimento(), that.getIndHbsagSeguimento()) && Objects.equals(getNumSessoes1Mes(), that.getNumSessoes1Mes()) && Objects.equals(getNumSessoes2Mes(), that.getNumSessoes2Mes()) && Objects.equals(getNumSessoes3Mes(), that.getNumSessoes3Mes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDataPrimeiraDialiseRealizada(), getVlrPeso(), getVlrAltura(), getVlrDiurese(), getVlrGlicose(), getVlrAlbimina(), getVlrHbPrimeroAtendimento(), getIndAcessoVascular(), getIndHivPrimeiroAtendimento(), getIndHcvPrimeiroAtendimento(), getIndHbsagPrimAtendimento(), getIndUltrasonografiaAbdominal(), getVlrHbSeguimento(), getVlrAlbuminaSeguimento(), getVlrIntervencaoFistola(), getIndListaCncdo(), getIndHivSeguimento(), getIndHcvSeguimento(), getIndHbsagSeguimento(), getNumSessoes1Mes(), getNumSessoes2Mes(), getNumSessoes3Mes());
    }

    public Nefrologia(Date dataPrimeiraDialiseRealizada, String vlrPeso, String vlrAltura, String vlrDiurese, String vlrGlicose, String vlrAlbimina, String vlrHbPrimeroAtendimento, Boolean indAcessoVascular, Boolean indHivPrimeiroAtendimento, Boolean indHcvPrimeiroAtendimento, Boolean indHbsagPrimAtendimento, Boolean indUltrasonografiaAbdominal, String vlrHbSeguimento, String vlrAlbuminaSeguimento, Long vlrIntervencaoFistola, Boolean indListaCncdo, Boolean indHivSeguimento, Boolean indHcvSeguimento, Boolean indHbsagSeguimento, Long numSessoes1Mes, Long numSessoes2Mes, Long numSessoes3Mes) {
        DataPrimeiraDialiseRealizada = dataPrimeiraDialiseRealizada;
        VlrPeso = vlrPeso;
        VlrAltura = vlrAltura;
        VlrDiurese = vlrDiurese;
        VlrGlicose = vlrGlicose;
        VlrAlbimina = vlrAlbimina;
        VlrHbPrimeroAtendimento = vlrHbPrimeroAtendimento;
        IndAcessoVascular = indAcessoVascular;
        IndHivPrimeiroAtendimento = indHivPrimeiroAtendimento;
        IndHcvPrimeiroAtendimento = indHcvPrimeiroAtendimento;
        IndHbsagPrimAtendimento = indHbsagPrimAtendimento;
        IndUltrasonografiaAbdominal = indUltrasonografiaAbdominal;
        VlrHbSeguimento = vlrHbSeguimento;
        VlrAlbuminaSeguimento = vlrAlbuminaSeguimento;
        VlrIntervencaoFistola = vlrIntervencaoFistola;
        IndListaCncdo = indListaCncdo;
        IndHivSeguimento = indHivSeguimento;
        IndHcvSeguimento = indHcvSeguimento;
        IndHbsagSeguimento = indHbsagSeguimento;
        NumSessoes1Mes = numSessoes1Mes;
        NumSessoes2Mes = numSessoes2Mes;
        NumSessoes3Mes = numSessoes3Mes;
    }
}









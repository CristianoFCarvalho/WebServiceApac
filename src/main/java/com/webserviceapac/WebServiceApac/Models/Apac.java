package com.webserviceapac.WebServiceApac.Models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.Objects;

@Entity

public class Apac<DateTime> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotBlank
    private Long NomeUsuario;

    @NotBlank
    private String NomeMae ;


    private String NomeResponsavemUsuario;


    private String TelefoneResponsavelUsuario;
    @Enumerated(value = EnumType.STRING)

    @NotBlank
    private Enumnacionalidade IdentificaNacionalidade;

    @NotBlank
    private Long CodigoPais;


    private Date DataEntradaPais;

    private Long MunicipioNaturalidade;
    @Enumerated(value = EnumType.STRING)

    @NotBlank
    private Enumsexo Sexo;

    @NotBlank
    private Date  DataNascimento;

    private EnumIndicaRacaCor IndicaRacaCor;

    private Long CodigoEtiniaIndigena;

    private String  NumeroProntuario;

    private String NumeroTelefone;

    private String NumeroTelefoneCelular;

    private String NumeroTelefoneContato;

    @NotBlank
    private String NumeroCartaoNacional;


    private String NumeroCPF;


    private Long CepUsuario;

    @NotBlank
    private String LogradouroUsuario;

    @NotBlank
    private EnumTipoLogradouroUsuario TipoLogradouroUsuario ;

    @NotBlank
    private Long NumeroPredialEnderecoUsuario;

    private String DescricaoComplementoEndereco;

    @NotBlank
    private Long CodigoIBGEEnderecoUsuario;

    @NotBlank
    private String NomeBairroEnderecoUsuario;

    public Apac() {

    }


    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Long getNomeUsuario() {
        return NomeUsuario;
    }

    public void setNomeUsuario(Long nomeUsuario) {
        NomeUsuario = nomeUsuario;
    }

    public String getNomeMae() {
        return NomeMae;
    }

    public void setNomeMae(String nomeMae) {
        NomeMae = nomeMae;
    }

    public String getNomeResponsavemUsuario() {
        return NomeResponsavemUsuario;
    }

    public void setNomeResponsavemUsuario(String nomeResponsavemUsuario) {
        NomeResponsavemUsuario = nomeResponsavemUsuario;
    }

    public String getTelefoneResponsavelUsuario() {
        return TelefoneResponsavelUsuario;
    }

    public void setTelefoneResponsavelUsuario(String telefoneResponsavelUsuario) {
        TelefoneResponsavelUsuario = telefoneResponsavelUsuario;
    }

    public Enumnacionalidade getIdentificaNacionalidade() {
        return IdentificaNacionalidade;
    }

    public void setIdentificaNacionalidade(Enumnacionalidade identificaNacionalidade) {
        IdentificaNacionalidade = identificaNacionalidade;
    }

    public Long getCodigoPais() {
        return CodigoPais;
    }

    public void setCodigoPais(Long codigoPais) {
        CodigoPais = codigoPais;
    }

    public Date getDataEntradaPais() {
        return DataEntradaPais;
    }

    public void setDataEntradaPais(Date dataEntradaPais) {
        DataEntradaPais = dataEntradaPais;
    }

    public Long getMunicipioNaturalidade() {
        return MunicipioNaturalidade;
    }

    public void setMunicipioNaturalidade(Long municipioNaturalidade) {
        MunicipioNaturalidade = municipioNaturalidade;
    }

    public Enumsexo getSexo() {
        return Sexo;
    }

    public void setSexo(Enumsexo sexo) {
        Sexo = sexo;
    }

    public Date getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public EnumIndicaRacaCor getIndicaRacaCor() {
        return IndicaRacaCor;
    }

    public void setIndicaRacaCor(EnumIndicaRacaCor indicaRacaCor) {
        IndicaRacaCor = indicaRacaCor;
    }

    public Long getCodigoEtiniaIndigena() {
        return CodigoEtiniaIndigena;
    }

    public void setCodigoEtiniaIndigena(Long codigoEtiniaIndigena) {
        CodigoEtiniaIndigena = codigoEtiniaIndigena;
    }

    public String getNumeroProntuario() {
        return NumeroProntuario;
    }

    public void setNumeroProntuario(String numeroProntuario) {
        NumeroProntuario = numeroProntuario;
    }

    public String getNumeroTelefone() {
        return NumeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        NumeroTelefone = numeroTelefone;
    }

    public String getNumeroTelefoneCelular() {
        return NumeroTelefoneCelular;
    }

    public void setNumeroTelefoneCelular(String numeroTelefoneCelular) {
        NumeroTelefoneCelular = numeroTelefoneCelular;
    }

    public String getNumeroTelefoneContato() {
        return NumeroTelefoneContato;
    }

    public void setNumeroTelefoneContato(String numeroTelefoneContato) {
        NumeroTelefoneContato = numeroTelefoneContato;
    }

    public String getNumeroCartaoNacional() {
        return NumeroCartaoNacional;
    }

    public void setNumeroCartaoNacional(String numeroCartaoNacional) {
        NumeroCartaoNacional = numeroCartaoNacional;
    }

    public String getNumeroCPF() {
        return NumeroCPF;
    }

    public void setNumeroCPF(String numeroCPF) {
        NumeroCPF = numeroCPF;
    }

    public Long getCepUsuario() {
        return CepUsuario;
    }

    public void setCepUsuario(Long cepUsuario) {
        CepUsuario = cepUsuario;
    }

    public String getLogradouroUsuario() {
        return LogradouroUsuario;
    }

    public void setLogradouroUsuario(String logradouroUsuario) {
        LogradouroUsuario = logradouroUsuario;
    }

    public EnumTipoLogradouroUsuario getTipoLogradouroUsuario() {
        return TipoLogradouroUsuario;
    }

    public void setTipoLogradouroUsuario(EnumTipoLogradouroUsuario tipoLogradouroUsuario) {
        TipoLogradouroUsuario = tipoLogradouroUsuario;
    }

    public Long getNumeroPredialEnderecoUsuario() {
        return NumeroPredialEnderecoUsuario;
    }

    public void setNumeroPredialEnderecoUsuario(Long numeroPredialEnderecoUsuario) {
        NumeroPredialEnderecoUsuario = numeroPredialEnderecoUsuario;
    }

    public String getDescricaoComplementoEndereco() {
        return DescricaoComplementoEndereco;
    }

    public void setDescricaoComplementoEndereco(String descricaoComplementoEndereco) {
        DescricaoComplementoEndereco = descricaoComplementoEndereco;
    }

    public Long getCodigoIBGEEnderecoUsuario() {
        return CodigoIBGEEnderecoUsuario;
    }

    public void setCodigoIBGEEnderecoUsuario(Long codigoIBGEEnderecoUsuario) {
        CodigoIBGEEnderecoUsuario = codigoIBGEEnderecoUsuario;
    }

    public String getNomeBairroEnderecoUsuario() {
        return NomeBairroEnderecoUsuario;
    }

    public void setNomeBairroEnderecoUsuario(String nomeBairroEnderecoUsuario) {
        NomeBairroEnderecoUsuario = nomeBairroEnderecoUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apac)) return false;
        Apac<?> apac = (Apac<?>) o;
        return Objects.equals(getCodigo(), apac.getCodigo()) && Objects.equals(getNomeUsuario(), apac.getNomeUsuario()) && Objects.equals(getNomeMae(), apac.getNomeMae()) && Objects.equals(getNomeResponsavemUsuario(), apac.getNomeResponsavemUsuario()) && Objects.equals(getTelefoneResponsavelUsuario(), apac.getTelefoneResponsavelUsuario()) && getIdentificaNacionalidade() == apac.getIdentificaNacionalidade() && Objects.equals(getCodigoPais(), apac.getCodigoPais()) && Objects.equals(getDataEntradaPais(), apac.getDataEntradaPais()) && Objects.equals(getMunicipioNaturalidade(), apac.getMunicipioNaturalidade()) && getSexo() == apac.getSexo() && Objects.equals(getDataNascimento(), apac.getDataNascimento()) && getIndicaRacaCor() == apac.getIndicaRacaCor() && Objects.equals(getCodigoEtiniaIndigena(), apac.getCodigoEtiniaIndigena()) && Objects.equals(getNumeroProntuario(), apac.getNumeroProntuario()) && Objects.equals(getNumeroTelefone(), apac.getNumeroTelefone()) && Objects.equals(getNumeroTelefoneCelular(), apac.getNumeroTelefoneCelular()) && Objects.equals(getNumeroTelefoneContato(), apac.getNumeroTelefoneContato()) && Objects.equals(getNumeroCartaoNacional(), apac.getNumeroCartaoNacional()) && Objects.equals(getNumeroCPF(), apac.getNumeroCPF()) && Objects.equals(getCepUsuario(), apac.getCepUsuario()) && Objects.equals(getLogradouroUsuario(), apac.getLogradouroUsuario()) && getTipoLogradouroUsuario() == apac.getTipoLogradouroUsuario() && Objects.equals(getNumeroPredialEnderecoUsuario(), apac.getNumeroPredialEnderecoUsuario()) && Objects.equals(getDescricaoComplementoEndereco(), apac.getDescricaoComplementoEndereco()) && Objects.equals(getCodigoIBGEEnderecoUsuario(), apac.getCodigoIBGEEnderecoUsuario()) && Objects.equals(getNomeBairroEnderecoUsuario(), apac.getNomeBairroEnderecoUsuario());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo(), getNomeUsuario(), getNomeMae(), getNomeResponsavemUsuario(), getTelefoneResponsavelUsuario(), getIdentificaNacionalidade(), getCodigoPais(), getDataEntradaPais(), getMunicipioNaturalidade(), getSexo(), getDataNascimento(), getIndicaRacaCor(), getCodigoEtiniaIndigena(), getNumeroProntuario(), getNumeroTelefone(), getNumeroTelefoneCelular(), getNumeroTelefoneContato(), getNumeroCartaoNacional(), getNumeroCPF(), getCepUsuario(), getLogradouroUsuario(), getTipoLogradouroUsuario(), getNumeroPredialEnderecoUsuario(), getDescricaoComplementoEndereco(), getCodigoIBGEEnderecoUsuario(), getNomeBairroEnderecoUsuario());
    }

    public Apac(Long codigo, Long nomeUsuario, String nomeMae, String nomeResponsavemUsuario, String telefoneResponsavelUsuario, Enumnacionalidade identificaNacionalidade, Long codigoPais, Date dataEntradaPais, Long municipioNaturalidade, Enumsexo sexo, Date dataNascimento, EnumIndicaRacaCor indicaRacaCor, Long codigoEtiniaIndigena, String numeroProntuario, String numeroTelefone, String numeroTelefoneCelular, String numeroTelefoneContato, String numeroCartaoNacional, String numeroCPF, Long cepUsuario, String logradouroUsuario, EnumTipoLogradouroUsuario tipoLogradouroUsuario, Long numeroPredialEnderecoUsuario, String descricaoComplementoEndereco, Long codigoIBGEEnderecoUsuario, String nomeBairroEnderecoUsuario) {
        this.codigo = codigo;
        NomeUsuario = nomeUsuario;
        NomeMae = nomeMae;
        NomeResponsavemUsuario = nomeResponsavemUsuario;
        TelefoneResponsavelUsuario = telefoneResponsavelUsuario;
        IdentificaNacionalidade = identificaNacionalidade;
        CodigoPais = codigoPais;
        DataEntradaPais = dataEntradaPais;
        MunicipioNaturalidade = municipioNaturalidade;
        Sexo = sexo;
        DataNascimento = dataNascimento;
        IndicaRacaCor = indicaRacaCor;
        CodigoEtiniaIndigena = codigoEtiniaIndigena;
        NumeroProntuario = numeroProntuario;
        NumeroTelefone = numeroTelefone;
        NumeroTelefoneCelular = numeroTelefoneCelular;
        NumeroTelefoneContato = numeroTelefoneContato;
        NumeroCartaoNacional = numeroCartaoNacional;
        NumeroCPF = numeroCPF;
        CepUsuario = cepUsuario;
        LogradouroUsuario = logradouroUsuario;
        TipoLogradouroUsuario = tipoLogradouroUsuario;
        NumeroPredialEnderecoUsuario = numeroPredialEnderecoUsuario;
        DescricaoComplementoEndereco = descricaoComplementoEndereco;
        CodigoIBGEEnderecoUsuario = codigoIBGEEnderecoUsuario;
        NomeBairroEnderecoUsuario = nomeBairroEnderecoUsuario;
    }
}





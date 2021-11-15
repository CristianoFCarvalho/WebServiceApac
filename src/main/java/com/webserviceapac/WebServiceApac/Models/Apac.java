package com.webserviceapac.WebServiceApac.Models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity

public class Apac {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @NotBlank
    private Long NomeUsuario;
    @NotBlank

    private String NomeMae ;
    @NotBlank

    private String NomeResponsavemUsuario;

    private String TelefoneResponsavelUsuario;

    @Enumerated(value = EnumType.STRING)
    private Enumnacionalidade IdentificaNacionalidade;

    private Long CodigoPais;
    @NotBlank

    private Date DataEntradaPais;

    private Date MunicipioNaturalidade;


    @Enumerated(value = EnumType.STRING)
    private Enumsexo Sexo;
    @NotBlank

    private Date  DataNascimento;
    @NotBlank

    private EnumIndicaRacaCor IndicaRacaCor;

    private Long CodigoEtiniaIndigena;

    private String  NumeroProntuario;

    private String NumeroTelefone;

    private String NumeroTelefoneCelular;

    private String NumeroTelefoneContato;

    private String NumeroCartaoNacional;
    @NotBlank

    private String NumeroCPF;
    @NotBlank

    private Long CepUsuario;

    private String LogradouroUsuario;
    @NotBlank

    private EnumLogradouroUsuario logradouroUsuario ;
    @NotBlank

    private Long NumeroPredialEnderecoUsuario;
    @NotBlank

    private String DescricaoComplementoEndereco;

    private Long CodigoIBGEEnderecoUsuario;

    private String NomeBairroEnderecoUsuario;


}




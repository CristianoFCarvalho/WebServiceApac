package com.webserviceapac.WebServiceApac.Models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

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



                    //LAUDO//
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



                        //Procedimentos//

    @NotBlank
    private String CodTabelaSusOficial;

    @NotBlank
  //  private Long NumSessoes1Mes;

    @NotBlank
    private Long NumSessoes2Mes;

    @NotBlank
   // private Long NumSessoes3Mes;




                    //Oncologia//

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













}





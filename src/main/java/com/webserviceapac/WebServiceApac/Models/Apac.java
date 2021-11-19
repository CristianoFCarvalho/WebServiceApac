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

                    //Tratamentos Anteriores
    @NotBlank
    private String CodCid;

    @NotBlank
    private Date DataInicioTratamentoAnterior;

                    //Quimioterapia
    @NotBlank
    private Boolean IndContinuidadeTratamento;

    @NotBlank
    private Date dataInicioTratamento;

    @NotBlank
    private String  DscEsquema;

    @NotBlank
    private Long NumTotalMesPlanejado;

            //Radioterapia

    @NotBlank
   // private Boolean IndContinuidadeTratamento;

    @NotBlank
    private Date InicioTratamento;

    @NotBlank
    private EnumTipFinalidadeTratamento TipFinalidadeTratamento;

    @NotBlank
  //  private String CodCid;

            //Area Irradiada
    @NotBlank
    private String DscAreaIrradiada;

    @NotBlank
    private Long Numincercoes;

    @NotBlank
    private Date DateInicioAreaIrradiada;

    @NotBlank
    private Date DateTerminoAreaIrradiada;


                //Nefrologia
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
  //  private Long NumSessoes1Mes;

  // private Long NumSessoes2Mes;

  //  private Long NumSessoes3Mes;



            //Protese Mamaria
    @NotBlank
    private Long CodCnesFces;

    @NotBlank
    private EnumTipMarcaProtese  TipMarcaProtese;

    @NotBlank
    private Long VlrAnoImplantacaoProtese;

            //Pre-Bariatrica

    @NotBlank
    private Date DatPrimeiraAvaliacao;

    @NotBlank
    private String VlrImcPrimAvaliacao;

    @NotBlank
 //   private String VlrPeso;

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

            //Pos-Bariatrica
    @NotBlank
    private String VlrImcAtual;

    @NotBlank
    private Long VlrPercPesoPerdido;

    @NotBlank
    private String VlrKgPerdidos;

    @NotBlank
//    private String CodTabelaSusOficial;

    @NotBlank
    private Date DatCirurgiaBariatrica;

    @NotBlank
    private Long NumApacCirurgiaBariatrica;

    @NotBlank
    private Long NumMesAcompanhamento;

    @NotBlank
    private Long NumAnoAcompanhamento;

    @NotBlank
 //   private EnumTipPontuacaoBaros  TipPontuacaoBaros;

    @NotBlank
    private Boolean IndComorbUsoMedicamentos;

    @NotBlank
    private Boolean IndComorbusoPolivitaminicos;

    @NotBlank
//    private Boolean IndComorbAtividadeFisica;

    @NotBlank
    private Boolean IndiComorbGanhoPeso;

    @NotBlank
    private Boolean IndComorbAliemtoSaudavel;

                //Plastica Pos-Bariátrica
    @NotBlank
 //   private String CodTabelaSusOficial;

    @NotBlank
    private Long ValosTempoPosBariatrica;


                //CID10 Pos-Bariátrica
    @NotBlank
    private String  ListaCidComorbidadesPosBariatricas;








}





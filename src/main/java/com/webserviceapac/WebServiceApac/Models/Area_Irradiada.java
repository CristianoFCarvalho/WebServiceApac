package com.webserviceapac.WebServiceApac.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.Objects;

@Entity

    public class Area_Irradiada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank
    private String DscAreaIrradiada;

    @NotBlank
    private Long Numincercoes;

    @NotBlank
    private Date DateInicioAreaIrradiada;

    @NotBlank
    private Date DateTerminoAreaIrradiada;

    public Area_Irradiada() {

    }

    public String getDscAreaIrradiada() {
        return DscAreaIrradiada;
    }

    public void setDscAreaIrradiada(String dscAreaIrradiada) {
        DscAreaIrradiada = dscAreaIrradiada;
    }

    public Long getNumincercoes() {
        return Numincercoes;
    }

    public void setNumincercoes(Long numincercoes) {
        Numincercoes = numincercoes;
    }

    public Date getDateInicioAreaIrradiada() {
        return DateInicioAreaIrradiada;
    }

    public void setDateInicioAreaIrradiada(Date dateInicioAreaIrradiada) {
        DateInicioAreaIrradiada = dateInicioAreaIrradiada;
    }

    public Date getDateTerminoAreaIrradiada() {
        return DateTerminoAreaIrradiada;
    }

    public void setDateTerminoAreaIrradiada(Date dateTerminoAreaIrradiada) {
        DateTerminoAreaIrradiada = dateTerminoAreaIrradiada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Area_Irradiada)) return false;
        Area_Irradiada that = (Area_Irradiada) o;
        return Objects.equals(getDscAreaIrradiada(), that.getDscAreaIrradiada()) && Objects.equals(getNumincercoes(), that.getNumincercoes()) && Objects.equals(getDateInicioAreaIrradiada(), that.getDateInicioAreaIrradiada()) && Objects.equals(getDateTerminoAreaIrradiada(), that.getDateTerminoAreaIrradiada());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDscAreaIrradiada(), getNumincercoes(), getDateInicioAreaIrradiada(), getDateTerminoAreaIrradiada());
    }

    public Area_Irradiada(String dscAreaIrradiada, Long numincercoes, Date dateInicioAreaIrradiada, Date dateTerminoAreaIrradiada) {
        DscAreaIrradiada = dscAreaIrradiada;
        Numincercoes = numincercoes;
        DateInicioAreaIrradiada = dateInicioAreaIrradiada;
        DateTerminoAreaIrradiada = dateTerminoAreaIrradiada;
    }
}

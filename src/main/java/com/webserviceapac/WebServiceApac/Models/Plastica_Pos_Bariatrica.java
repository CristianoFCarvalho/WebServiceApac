package com.webserviceapac.WebServiceApac.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Entity
public class Plastica_Pos_Bariatrica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @NotBlank
    private String CodTabelaSusOficial;

    @NotBlank
    private Long ValosTempoPosBariatrica;

    public Plastica_Pos_Bariatrica() {

    }

    public String getCodTabelaSusOficial() {
        return CodTabelaSusOficial;
    }

    public void setCodTabelaSusOficial(String codTabelaSusOficial) {
        CodTabelaSusOficial = codTabelaSusOficial;
    }

    public Long getValosTempoPosBariatrica() {
        return ValosTempoPosBariatrica;
    }

    public void setValosTempoPosBariatrica(Long valosTempoPosBariatrica) {
        ValosTempoPosBariatrica = valosTempoPosBariatrica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plastica_Pos_Bariatrica)) return false;
        Plastica_Pos_Bariatrica that = (Plastica_Pos_Bariatrica) o;
        return Objects.equals(getCodTabelaSusOficial(), that.getCodTabelaSusOficial()) && Objects.equals(getValosTempoPosBariatrica(), that.getValosTempoPosBariatrica());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodTabelaSusOficial(), getValosTempoPosBariatrica());
    }


    public Plastica_Pos_Bariatrica(String codTabelaSusOficial, Long valosTempoPosBariatrica) {
        CodTabelaSusOficial = codTabelaSusOficial;
        ValosTempoPosBariatrica = valosTempoPosBariatrica;
    }
}

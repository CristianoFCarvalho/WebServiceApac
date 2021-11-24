package com.webserviceapac.WebServiceApac.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Entity
public class CID10_Pos_Bariátrica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank
    private String  ListaCidComorbidadesPosBariatricas;


    public String getListaCidComorbidadesPosBariatricas() {
        return ListaCidComorbidadesPosBariatricas;
    }

    public void setListaCidComorbidadesPosBariatricas(String listaCidComorbidadesPosBariatricas) {
        ListaCidComorbidadesPosBariatricas = listaCidComorbidadesPosBariatricas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CID10_Pos_Bariátrica)) return false;
        CID10_Pos_Bariátrica that = (CID10_Pos_Bariátrica) o;
        return Objects.equals(getListaCidComorbidadesPosBariatricas(), that.getListaCidComorbidadesPosBariatricas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getListaCidComorbidadesPosBariatricas());
    }

    public CID10_Pos_Bariátrica(String listaCidComorbidadesPosBariatricas) {
        ListaCidComorbidadesPosBariatricas = listaCidComorbidadesPosBariatricas;
    }
}





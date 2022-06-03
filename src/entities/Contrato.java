package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
    
    private Integer contratoNumero;
    private Date contratoData;
    private Double contratoValor;
   
    private List<Prestacao> prestacoes = new ArrayList<>();

    public Contrato(Integer contratoNumero, Date contratoData, Double contratoValor) {
        this.contratoNumero = contratoNumero;
        this.contratoData = contratoData;
        this.contratoValor = contratoValor;
  
    }

    public Integer getContratoNumero() {
        return contratoNumero;
    }

    public void setContratoNumero(Integer contratoNumero) {
        this.contratoNumero = contratoNumero;
    }

    public Date getContratoData() {
        return contratoData;
    }

    public void setContratoData(Date contratoData) {
        this.contratoData = contratoData;
    }

    public Double getContratoValor() {
        return contratoValor;
    }

    public void setContratoValor(Double contratoValor) {
        this.contratoValor = contratoValor;
    }

    public List<Prestacao> getPrestacoes() {
        return prestacoes;
    }

    public void addPrestacao(Prestacao prestacao) {
       prestacoes.add(prestacao);
    }
    
    public void removePrestacao(Prestacao prestacao) {
        prestacoes.remove(prestacao);
    }

}

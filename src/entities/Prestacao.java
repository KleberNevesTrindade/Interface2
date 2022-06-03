package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestacao {

    private Date prestacaoData;
    private Double prestacaoValor;

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Prestacao(Date prestacaoData, Double prestacaoValor) {
        this.prestacaoData = prestacaoData;
        this.prestacaoValor = prestacaoValor;
    }

    public Date getPrestacaoData() {
        return prestacaoData;
    }

    public void setPrestacaoData(Date prestacaoData) {
        this.prestacaoData = prestacaoData;
    }

    public Double getPrestacaoValor() {
        return prestacaoValor;
    }

    public void setPrestacaoValor(Double prestacaoValor) {
        this.prestacaoValor = prestacaoValor;
    }

    @Override
    public String toString() {
        return sdf.format(prestacaoData) + " - " + String.format("%.2f", prestacaoValor);
    }

}

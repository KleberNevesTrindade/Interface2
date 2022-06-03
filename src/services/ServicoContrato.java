package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contrato;
import entities.Prestacao;

public class ServicoContrato {
    
    private ServicoPagamentoGeral servicoPagamentoGeral;

    public ServicoContrato(ServicoPagamentoGeral servicoPagamentoGeral){
        this.servicoPagamentoGeral = servicoPagamentoGeral;
    }

    public void processarContrato(Contrato contrato, int numeroParcelas){
        Double valorParcelaBase = contrato.getContratoValor() / numeroParcelas;
        for (int i = 1; i <= numeroParcelas; i++) {
            Date data = somaMes(contrato.getContratoData(), i);
            double atualizaValor = valorParcelaBase + servicoPagamentoGeral.calculaJuros(valorParcelaBase, i);
            double totalValor = atualizaValor + servicoPagamentoGeral.calculaTaxa(atualizaValor);
            contrato.addPrestacao(new Prestacao(data, totalValor));
        }
    }

    private Date somaMes(Date data, int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        cal.add(Calendar.MONTH, n);

        return cal.getTime();
    }

}

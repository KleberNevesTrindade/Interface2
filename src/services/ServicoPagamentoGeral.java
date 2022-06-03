package services;

public interface ServicoPagamentoGeral {
    
    Double calculaTaxa (double valor);
    Double calculaJuros (double valor, int numeroParcelas);

}

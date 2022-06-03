package services;

public class ServicoPaypal implements ServicoPagamentoGeral {
    
    private static final double VALORTAXAIMPOSTO = 0.02;
    private static final double VALORJUROS = 0.01;
    
    @Override
    public Double calculaTaxa(double valor) {
        return valor * VALORTAXAIMPOSTO;
    
    }
    
    @Override
    public Double calculaJuros(double valor, int numeroParcelas) {
        return valor * VALORJUROS * numeroParcelas;

    }

}

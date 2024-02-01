package br.com.alura.conversordemoedas.calculos;

import br.com.alura.conversordemoedas.interfaces.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {
    private double valorEmDolar;
    private static final double TAXA_DE_CAMBIO = 4.8;
    @Override
    public double converterDolarParaReal(double valorEmDolar) {
        return valorEmDolar * TAXA_DE_CAMBIO;
    }
}

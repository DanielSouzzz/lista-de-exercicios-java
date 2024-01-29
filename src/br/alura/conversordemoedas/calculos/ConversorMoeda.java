package br.alura.conversordemoedas.calculos;

import br.alura.conversordemoedas.interfaces.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {
    double valorEmDolar;

    public double getValorEmDolar() {
        return valorEmDolar;
    }

    public void setValorEmDolar(double valorEmDolar) {
        this.valorEmDolar = valorEmDolar;
    }

    @Override
    public double converterDolarParaReal() {
        return valorEmDolar * 5;
    }
}

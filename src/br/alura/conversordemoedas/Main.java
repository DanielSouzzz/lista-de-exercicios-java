package br.alura.conversordemoedas;

import br.alura.conversordemoedas.calculos.ConversorMoeda;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversorDolar = new ConversorMoeda();
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o valor em dolar");
        Double valor = input.nextDouble();
        input.close();

        conversorDolar.setValorEmDolar(valor);
        double valorEmReais = conversorDolar.converterDolarParaReal();
        System.out.println("O valor convertido para reais é: " + valorEmReais);
    }
}
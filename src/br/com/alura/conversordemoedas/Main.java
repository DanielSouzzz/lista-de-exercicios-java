package br.com.alura.conversordemoedas;

import br.com.alura.conversordemoedas.calculos.ConversorMoeda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversorDolar = new ConversorMoeda();
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o valor em dolar");
        Double valorEmDolar = input.nextDouble();
        input.close();

        double valorEmReais = conversorDolar.converterDolarParaReal(valorEmDolar);
        System.out.println("O valor convertido para reais é: " + valorEmReais);
    }
}
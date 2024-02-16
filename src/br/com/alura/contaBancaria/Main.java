package br.com.alura.contaBancaria;

public class Main {
    public static void main(String[] args) {
    CurrentAccount currentAc = new CurrentAccount("6397172-0", 527.11);
    currentAc.setClientName("Caroline Lafuente");
    currentAc.setTypeAccount(true);
    currentAc.setBank("Inter");
        System.out.println(currentAc);

    var currentAc1 = new CurrentAccount("7628304-9",0.00);
    currentAc1.setClientName("Daniel Souza");
    currentAc1.setTypeAccount(true);
    currentAc1.setBank("Nubank");

    var saving = new SavingsAccount("8810653-5", 5.50);
    saving.setClientName("Carlonis Souza");
    saving.setTypeAccount(false);
    saving.setBank("Santander");


    }
}

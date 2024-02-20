package br.com.alura.contaBancaria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    CurrentAccount currentAc = new CurrentAccount("6397172-0", 527.11);
    currentAc.setClientName("Caroline Lafuente");
    currentAc.setTypeAccount(true);
    currentAc.setBank("Inter");
        //System.out.println(currentAc);

    var currentAc1 = new CurrentAccount("7628304-9",852.00);
    currentAc1.setClientName("Daniel Souza");
    currentAc1.setTypeAccount(true);
    currentAc1.setBank("Nubank");

    var saving = new SavingsAccount("8810653-5", 500.50);
    saving.setClientName("Carlonis Souza");
    saving.setTypeAccount(false);
    saving.setBank("Santander");
        //System.out.println(saving);

        ArrayList<AccountBank> bankList = new ArrayList<>();
        bankList.add(currentAc);
        bankList.add(currentAc1);
        bankList.add(saving);

        AccountBank highestBankBalance = bankList.get(0); // assumi que primeira conta é a que tem maior saldo
        for (AccountBank account : bankList){ // para cada elemento contido em um array, uma instrução é dada
            if (account.getAccountBalance() > highestBankBalance.getAccountBalance()){ // compara qual o maior saldo
                highestBankBalance = account;
            }
        }
                System.out.println(highestBankBalance.getAccountBalance());

    }
}

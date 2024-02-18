package br.com.alura.contaBancaria;

public class SavingsAccount extends AccountBank implements Conta{


    public SavingsAccount(String accountNumber, Double accountBalance) {
        super(accountNumber, accountBalance);
    }

    @Override
    public String toString() {
        return "{" +
                "\"bank\": \"" + this.getBank() + "\",\n" +
                "\"clientName\": \"" + this.getClientName() + "\",\n" +
                "\"typeAccount\": \"" + (this.isTypeAccount() ? "current" : "savings") + "\",\n" +
                "\"accountNumber\": \"" + this.getAccountNumber() + "\",\n" +
                "\"accountBalance\": " + this.getAccountBalance() +
                "}";
    }

    @Override
    public Double getSaldo() {
        return null;
    }
}

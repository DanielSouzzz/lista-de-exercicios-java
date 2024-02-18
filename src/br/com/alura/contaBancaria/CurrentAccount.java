package br.com.alura.contaBancaria;

public class CurrentAccount extends AccountBank implements Conta{

    public CurrentAccount(String accountNumber, Double accountBalance) {
        super(accountNumber, accountBalance);
    }
    @Override
    public String toString() {
        return "{\n" +
                "\"bank\": \"" + this.getBank() + "\",\n" +
                "\"clientName\": \"" + this.getClientName() + "\",\n" +
                "\"typeAccount\": \"" + (this.isTypeAccount() ? "current" : "savings") + "\",\n" +
                "\"accountNumber\": \"" + this.getAccountNumber() + "\",\n" +
                "\"accountBalance\": " + this.getAccountBalance() +
                "\n}";
    }
    @Override
    public Double getSaldo() {
        return null;
    }
}

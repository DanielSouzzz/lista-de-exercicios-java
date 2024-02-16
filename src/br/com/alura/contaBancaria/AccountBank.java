package br.com.alura.contaBancaria;

public class AccountBank {
    private String bank;
    private String clientName;
    private boolean typeAccount; // if is true is current, else is savings
    private String accountNumber;
    private Double accountBalance;

    public AccountBank(String accountNumber, Double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public boolean isTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(boolean typeAccount) {
        this.typeAccount = typeAccount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }
}

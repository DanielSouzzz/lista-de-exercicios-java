package br.com.alura.loja.tipos;

public class ProdutoPerecivel extends Produto{
    private String expirationDate;

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public ProdutoPerecivel(String brand, double price) {
        super(brand, price);
    }
}

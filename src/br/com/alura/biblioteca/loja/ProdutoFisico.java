package br.com.alura.biblioteca.loja;

public class ProdutoFisico implements Calculavel {
    private String nomeProduto;
    private Double pesoProduto;
    private Double preco;
    private double IMPOSTO_ICMS = 0.3;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Double getPesoProduto() {
        return pesoProduto;
    }

    public double getIMPOSTO_ICMS() {
        return IMPOSTO_ICMS;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPesoProduto(Double pesoProduto) {
        this.pesoProduto = pesoProduto;
    }

    public void setIMPOSTO_ICMS(double IMPOSTO_ICMS) {
        this.IMPOSTO_ICMS = IMPOSTO_ICMS;
    }

    @Override
    public Double calcularPrecoFinal() {
        return preco - IMPOSTO_ICMS;
    }
}


package br.com.alura.biblioteca.loja;

public class Livro extends ProdutoFisico implements Calculavel {
    private double IMPOSTO_LIVRO = 0.89;

    @Override
    public Double calcularPrecoFinal() {
        return super.calcularPrecoFinal() - IMPOSTO_LIVRO;
    }
}

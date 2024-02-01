package br.com.alura.biblioteca.loja;

public class Main {
    public static void main(String[] args){
    ProdutoFisico produtoFis = new ProdutoFisico();
    produtoFis.setNomeProduto("Cadeira");
    produtoFis.setPesoProduto(2.2);
    produtoFis.setPreco(55.90);
    Double precoFinal = produtoFis.calcularPrecoFinal();
        System.out.println("O produto físico tem o preço final de "+precoFinal);

    Livro livro = new Livro(); // Novo objeto
        livro.setNomeProduto("Livro Java");
        livro.setPesoProduto(0.5);
        livro.setPreco(29.0);
        Double precoLivro = livro.calcularPrecoFinal();
        System.out.println("O preço final do livro é "+precoLivro);
    }
}

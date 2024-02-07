package br.com.alura.loja;

import br.com.alura.loja.tipos.Produto;

public class Main {
    public static void main(String[] args) {
    var chinelo = new Produto();
    chinelo.setBrand("havaianas");
    chinelo.setPrice(49.99);
    chinelo.setQuantity(8);

    var tenis = new Produto();
    tenis.setBrand("Adidas");
    tenis.setPrice(999.99);
    tenis.setQuantity(6);

    var bota = new Produto();
    tenis.setBrand("Scarpa");
    tenis.setPrice(777.49);
    tenis.setQuantity(11);
    }
}

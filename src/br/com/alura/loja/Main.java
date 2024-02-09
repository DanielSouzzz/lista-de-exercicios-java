package br.com.alura.loja;

import br.com.alura.loja.tipos.Produto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    var chinelo = new Produto();
    chinelo.setBrand("havaianas");
    chinelo.setPrice(49.99);
    chinelo.setQuantity(8);
        System.out.println("A marca do chinelo é: "+ chinelo.getBrand());
        System.out.println(chinelo);

    var tenis = new Produto();
    tenis.setBrand("Adidas");
    tenis.setPrice(999.99);
    tenis.setQuantity(6);
        System.out.println("A marca do tênis é: "+tenis.getBrand());

    var bota = new Produto();
    bota.setBrand("Scarpa");
    bota.setPrice(777.49);
    bota.setQuantity(11);
        System.out.println("A marca da bota é: "+bota.getBrand());

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(chinelo);
        listaDeProdutos.add(tenis);
        listaDeProdutos.add(bota);
        System.out.printf("O catálogo possui %d produtos", listaDeProdutos.size());
    }


}

package br.com.alura.loja;

import br.com.alura.loja.tipos.Produto;
import br.com.alura.loja.tipos.ProdutoPerecivel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    var chinelo = new Produto("Havaianas", 49.99);
    chinelo.setQuantity(8);
        System.out.println("A marca do chinelo é: "+ chinelo.getBrand());

    var tenis = new Produto("Adidas", 999.99);
    tenis.setQuantity(6);
        System.out.println("A marca do tênis é: "+tenis.getBrand());

    var bota = new Produto("Scarpa",777.49);
    bota.setQuantity(11);
        System.out.println("A marca da bota é: "+bota.getBrand());

    var ketchup = new ProdutoPerecivel("Heinz", 9.60);
    ketchup.setQuantity(3);
    ketchup.setExpirationDate("21/05/2024");

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(chinelo);
        listaDeProdutos.add(tenis);
        listaDeProdutos.add(bota);
        listaDeProdutos.add(ketchup);
        System.out.printf("O catálogo possui %d produtos", listaDeProdutos.size());
        System.out.println(listaDeProdutos);
    }


}

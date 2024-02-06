package br.com.alura.pessoas;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    var pessoa1 = new Pessoa();
    pessoa1.setNome("Daniel");
    pessoa1.setIdade(21);
    pessoa1.setAltura(1.90);
    pessoa1.setPeso(90.2);
        System.out.println(pessoa1);

    var pessoa2 = new Pessoa();
    pessoa2.setNome("Felipe");
    pessoa2.setIdade(20);
    pessoa2.setAltura(1.60);
    pessoa2.setPeso(71.0);
        System.out.println(pessoa2);

    var pessoa3 = new Pessoa();
    pessoa3.setNome("Arthur");
    pessoa3.setIdade(17);
    pessoa3.setAltura(1.79);
    pessoa3.setPeso(80.0);
        System.out.println(pessoa3);

    ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
    listaDePessoas.add(pessoa1);
    listaDePessoas.add(pessoa2);
    listaDePessoas.add(pessoa3);
        System.out.println("O tamanho da lista é: " + listaDePessoas.size());
        System.out.println(listaDePessoas);
        System.out.println("A primeira pessoa da lista é: " + listaDePessoas.get(0).getNome());
    }
}

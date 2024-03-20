package readandwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File arquivo = new File("/home/danielsouza/IdeaProjects/lista-de-exercicios-java/src/readandwrite/arquivo");
            Scanner scanner = new Scanner(arquivo);

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }

            scanner.close();
        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado!");
        }
    }
}

package br.com.alura.github;

public class ErroConsultaGitHubException extends RuntimeException {
    public ErroConsultaGitHubException( String mensagem){
       super(mensagem);
    }
}

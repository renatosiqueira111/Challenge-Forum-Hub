package Renato.ChallengeForumHub.Dados;

import java.time.LocalDate;

public record DadosTopico(int id, String titulo, String mensagem, EstadoTopico estadoDoTopico, String autor, String curso, LocalDate dataAtual) {

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getAutor() {
        return autor;
    }
}

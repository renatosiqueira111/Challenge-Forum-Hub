package Renato.ChallengeForumHub.Topico;

import Renato.ChallengeForumHub.Dados.DadosTopico;
import Renato.ChallengeForumHub.Dados.EstadoTopico;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Optional;

@Table(name = "topicos")
@Entity(name = "topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of ="id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    private String autor;
    @Enumerated(EnumType.STRING)
    private EstadoTopico  estadoDoTopico;

    private String curso;
    private LocalDate dataAtual;


    public Topico(DadosTopico dados) {
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.autor = dados.autor();
        this.estadoDoTopico = dados.estadoDoTopico();
        this.curso = dados.curso();
        this.dataAtual = LocalDate.now();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

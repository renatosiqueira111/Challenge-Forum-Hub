package Renato.ChallengeForumHub.Controller;

import Renato.ChallengeForumHub.Dados.DadosTopico;
import Renato.ChallengeForumHub.Topico.Topico;
import Renato.ChallengeForumHub.Topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;

    @PostMapping("/cadastrarTopico")
    public void cadastrar(@RequestBody DadosTopico dados) {
        repository.save(new Topico(dados));
    }

    @GetMapping("/listarTopicos")
    public List<Topico> listar() {
        return repository.findAll();
    }

    @GetMapping("/topico/{id}")
    public ResponseEntity<Topico> detalharTopico(@PathVariable Long id) {
        Optional<Topico> optionalTopico = repository.findById(id);
        return optionalTopico.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/topicos/{id}")
    public ResponseEntity<Topico> atualizarTopico(@PathVariable Long id, @RequestBody DadosTopico dados) {
        Optional<Topico> optionalTopico = repository.findById(id);
        if (optionalTopico.isPresent()) {
            Topico topico = optionalTopico.get();
            topico.setTitulo(dados.getTitulo());
            topico.setMensagem(dados.getMensagem());
            topico.setAutor(dados.getAutor());
            repository.save(topico);
            return ResponseEntity.ok(topico);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/topicos/{id}")
    public ResponseEntity<Void> excluirTopico(@PathVariable Long id) {
        Optional<Topico> optionalTopico = repository.findById(id);
        if (optionalTopico.isPresent()) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

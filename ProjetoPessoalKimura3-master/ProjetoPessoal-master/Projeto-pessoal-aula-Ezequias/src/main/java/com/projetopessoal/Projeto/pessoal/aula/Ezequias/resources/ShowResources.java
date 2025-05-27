package com.projetopessoal.Projeto.pessoal.aula.Ezequias.resources;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.ProdutoraDTO;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.ShowDTO;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Show;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.services.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shows")
public class ShowResources {

    @Autowired
    private ShowService showService;

    public ResponseEntity<List<ShowDTO>> getShows(){
        List<ShowDTO> list = showService.buscarTodosShows();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("{id}")
    public ResponseEntity<ShowDTO> buscarShowPorId(@PathVariable Long id) {
        Show show = showService.buscarShowPorId(id);
        return ResponseEntity.ok(new ShowDTO(show));
    }

    @GetMapping("/buscar")
    public ResponseEntity<ShowDTO> buscarShowPorNome(@RequestParam String nome) {
        Show show = showService.buscarShowPorNome(nome);
        return ResponseEntity.ok(new ShowDTO(show));
    }

    @PostMapping()
    public ResponseEntity<ShowDTO> criarShow(@RequestBody ShowDTO showDTO) {
        return ResponseEntity.ok(showService.salvarShow(showDTO));
    }

    @PutMapping()
    public ResponseEntity<ShowDTO> atualizarShow(@RequestBody ShowDTO showDTO){
        return ResponseEntity.ok(showService.atualizarShow(showDTO));
    }

    @DeleteMapping()
    public ResponseEntity<ShowDTO> deletarShow(@RequestBody ShowDTO showDTO){
        showService.deletarShow(showDTO.getId());
        return ResponseEntity.noContent().build();
    }

}

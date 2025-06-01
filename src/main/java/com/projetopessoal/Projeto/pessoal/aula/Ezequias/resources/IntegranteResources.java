package com.projetopessoal.Projeto.pessoal.aula.Ezequias.resources;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.IntegranteDTO;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Integrante;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.services.IntegrantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/integrantes")
public class IntegranteResources {

    @Autowired
    private IntegrantesService integrantesService;
    @GetMapping
    public ResponseEntity<List<IntegranteDTO>> getIntegrantes(){
        List<IntegranteDTO> list = integrantesService.buscaTodos();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("{id}")
    public ResponseEntity<IntegranteDTO> buscarIntegrantesPorId(@PathVariable Long id) {
        Integrante integrante = integrantesService.buscarIntegrantesPorId(id);
        return ResponseEntity.ok(integrantesService.converterIntegrantesParaIntegrantesDTO(integrante));
    }


    @GetMapping("/buscar")
    public ResponseEntity<IntegranteDTO> buscarIntegrantesPorEmail(@RequestParam String nome) {
        IntegranteDTO integranteDTO = integrantesService.converterIntegrantesParaIntegrantesDTO(integrantesService.buscarIntegrantesPorNome(nome));
        return ResponseEntity.ok(integranteDTO);
    }

    @PostMapping()
    public ResponseEntity<IntegranteDTO> criarIntegrantes(@RequestBody IntegranteDTO integranteDTO) {
        System.out.println("criando integrantes");
        System.out.println(integranteDTO.getIdBanda());
        System.out.println(integranteDTO.getNome());
        return ResponseEntity.ok(integrantesService.salvarIntegrantes(integranteDTO));
    }



    @PutMapping("{id}")
    public ResponseEntity<IntegranteDTO> atualizarIntegrantes(@RequestBody IntegranteDTO integranteDTO) {
        return ResponseEntity.ok(integrantesService.atualizarIntegrantes(integranteDTO));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<IntegranteDTO> deletarIntegrantes(@RequestBody IntegranteDTO integranteDTO) {
        integrantesService.deletarIntegrantes(integranteDTO.getId());
        return ResponseEntity.noContent().build();
    }


}
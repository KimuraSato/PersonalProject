package com.projetopessoal.Projeto.pessoal.aula.Ezequias.resources;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.IntegranteDTO;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Integrante;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.services.IntegrantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/integrantes")
public class IntegranteResources {

    @Autowired
    private IntegrantesService integrantesService;

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
    public ResponseEntity<IntegranteDTO> criarIntegrantes(@RequestBody IntegranteDTO usuarioDTO) {
        return ResponseEntity.ok(integrantesService.salvarIntegrantes(usuarioDTO));
    }

    @PutMapping()
    public ResponseEntity<IntegranteDTO> atualizarIntegrantes(@RequestBody IntegranteDTO usuarioDTO) {
        return ResponseEntity.ok(integrantesService.atualizarIntegrantes(usuarioDTO));
    }

    @DeleteMapping()
    public ResponseEntity<IntegranteDTO> deletarIntegrantes(@RequestBody IntegranteDTO usuarioDTO) {
        integrantesService.deletarIntegrantes(usuarioDTO.getId());
        return ResponseEntity.noContent().build();
    }
}
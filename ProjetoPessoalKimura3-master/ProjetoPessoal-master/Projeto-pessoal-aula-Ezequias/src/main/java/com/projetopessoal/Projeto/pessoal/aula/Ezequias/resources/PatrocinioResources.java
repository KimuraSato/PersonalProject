package com.projetopessoal.Projeto.pessoal.aula.Ezequias.resources;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.IntegranteDTO;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.PatrocinioDTO;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Patrocinio;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.services.PatrociniosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patrocinios")
public class PatrocinioResources {

    @Autowired
    private PatrociniosService patrociniosService;

    public ResponseEntity<List<PatrocinioDTO>> getPatrocinios(){
        List<PatrocinioDTO> list = patrociniosService.buscarTodosPatrocinios();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("{id}")
    public ResponseEntity<PatrocinioDTO> buscarPatrociniosPorId(@PathVariable Long id) {
        Patrocinio patrocinio = patrociniosService.buscarPatrociniosPorId(id);
        return ResponseEntity.ok(patrociniosService.converterPatrociniosParaPatrociniosDTO(patrocinio));
    }

    @GetMapping("/buscar")
    public ResponseEntity<PatrocinioDTO> buscarPatrociniosPorEmail(@RequestParam String nome) {
        PatrocinioDTO patrocinioDTO = patrociniosService
                .converterPatrociniosParaPatrociniosDTO(patrociniosService.buscarPatrociniosPorNome(nome));
        return ResponseEntity.ok(patrocinioDTO);
    }



    @PostMapping()
    public ResponseEntity<PatrocinioDTO> criarPatrocinios(@RequestBody PatrocinioDTO usuarioDTO) {
        return ResponseEntity.ok(patrociniosService.salvarPatrocinios(usuarioDTO));
    }

    @PutMapping()
    public ResponseEntity<PatrocinioDTO> atualizarPrdoutoras(@RequestBody PatrocinioDTO usuarioDTO) {
        return ResponseEntity.ok(patrociniosService.atualizarPatrocinios(usuarioDTO));
    }

    @DeleteMapping()
    public ResponseEntity<PatrocinioDTO> deletarPatrocinios(@RequestBody PatrocinioDTO usuarioDTO) {
        patrociniosService.deletarPatrocinios(usuarioDTO.getId());
        return ResponseEntity.noContent().build();
    }
}

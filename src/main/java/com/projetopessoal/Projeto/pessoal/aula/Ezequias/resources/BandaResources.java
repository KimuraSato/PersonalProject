package com.projetopessoal.Projeto.pessoal.aula.Ezequias.resources;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.BandaDTO;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Banda;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.services.BandaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bandas")
public class BandaResources {

    @Autowired
    private BandaService bandaService;
    @GetMapping
    public ResponseEntity<List<BandaDTO>> getBandas(){
        List<BandaDTO> list = bandaService.buscaTodasBandas();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("{id}")
    public ResponseEntity<BandaDTO> buscarBandaPorId(@PathVariable Long id) {
        Banda banda = bandaService.buscarBandaPorId(id);
        return ResponseEntity.ok(bandaService.converterBandaParaBandaDTO(banda));
    }

    @GetMapping("/buscar")
    public ResponseEntity<BandaDTO> buscarBandaPorEmail(@RequestParam String nome) {
        BandaDTO bandaDTO = bandaService
                .converterBandaParaBandaDTO(bandaService.buscarBandaPorNome(nome));
        return ResponseEntity.ok(bandaDTO);
    }

    @PostMapping()
    public ResponseEntity<BandaDTO> criarBanda(@RequestBody BandaDTO usuarioDTO) {
        return ResponseEntity.ok(bandaService.salvarBanda(usuarioDTO));
    }

    @PutMapping("{id}")
    public ResponseEntity<BandaDTO> atualizarPrdoutoras(@RequestBody BandaDTO usuarioDTO) {
        return ResponseEntity.ok(bandaService.atualizarBanda(usuarioDTO));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<BandaDTO> deletarBanda(@RequestBody BandaDTO usuarioDTO) {
        bandaService.deletarBanda(usuarioDTO.getId());
        return ResponseEntity.noContent().build();
    }
}

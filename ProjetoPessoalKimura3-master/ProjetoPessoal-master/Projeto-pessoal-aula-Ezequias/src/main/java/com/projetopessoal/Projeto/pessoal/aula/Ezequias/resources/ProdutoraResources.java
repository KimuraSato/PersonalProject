package com.projetopessoal.Projeto.pessoal.aula.Ezequias.resources;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.ProdutoraDTO;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Produtora;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.services.ProdutorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtoras")
public class ProdutoraResources {
    @Autowired
    private ProdutorasService produtorasService;
    @GetMapping("{id}")
    public ResponseEntity<ProdutoraDTO> buscarProdutorasPorId(@PathVariable Long id) {
        Produtora produtora = produtorasService.buscarProdutorasPorId(id);
        return ResponseEntity.ok(produtorasService.converterProdutorasParaProdutorasDTO(produtora));
    }
    @GetMapping("/buscar")
    public ResponseEntity<ProdutoraDTO> buscarProdutorasPorEmail(@RequestParam Long cpf_cnpj) {
        ProdutoraDTO produtoraDTO = produtorasService.buscarProdutorasPorcpfCnpj(cpf_cnpj);
        return ResponseEntity.ok(produtoraDTO);
    }
    @PostMapping()
    public ResponseEntity<ProdutoraDTO> criarProdutoras(@RequestBody ProdutoraDTO usuarioDTO) {
        return ResponseEntity.ok(produtorasService.salvarProdutoras(usuarioDTO));
    }
    @PutMapping()
    public ResponseEntity<ProdutoraDTO> atualizarPrdoutoras(@RequestBody ProdutoraDTO usuarioDTO){
        return ResponseEntity.ok(produtorasService.atualizarProdutoras(usuarioDTO));
    }
    @DeleteMapping()
    public ResponseEntity<ProdutoraDTO> deletarProdutoras(@RequestBody ProdutoraDTO usuarioDTO){
        produtorasService.deletarProdutoras(usuarioDTO.getId());
        return ResponseEntity.noContent().build();
    }
}
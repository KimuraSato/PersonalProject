package com.projetopessoal.Projeto.pessoal.aula.Ezequias.resources;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.IntegranteDTO;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.UsuarioDTO;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Usuario;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioResources {

    @Autowired
    private UsuarioService usuarioService;
    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> getUsuarios(){
        List<UsuarioDTO> list = usuarioService.buscarTodosUsuarios();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("{id}")
    public ResponseEntity<UsuarioDTO> buscarUsuarioPorId(@PathVariable Long id) {
        Usuario usuario = usuarioService.buscarUsuarioPorId(id);
        return ResponseEntity.ok(usuarioService.converterUsuarioParaUsuarioDTO(usuario));
    }

    @GetMapping("/buscar")
    public ResponseEntity<UsuarioDTO> buscarUsuarioPorEmail(@RequestParam String email) {
        UsuarioDTO usuarioDTO = usuarioService.buscarUsuarioPorEmail(email);
        return ResponseEntity.ok(usuarioDTO);
    }

    @PostMapping()
    public ResponseEntity<UsuarioDTO> criarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        return ResponseEntity.ok(usuarioService.salvarUsuario(usuarioDTO));
    }

    @PutMapping("{id}")
    public ResponseEntity<UsuarioDTO> atualizarUsuario(@RequestBody UsuarioDTO usuarioDTO){
        return ResponseEntity.ok(usuarioService.atualizarUsuario(usuarioDTO));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<UsuarioDTO> deletarUsuario(@RequestBody UsuarioDTO usuarioDTO){
        usuarioService.deletarUsuario(usuarioDTO.getId());
        return ResponseEntity.noContent().build();
    }

}

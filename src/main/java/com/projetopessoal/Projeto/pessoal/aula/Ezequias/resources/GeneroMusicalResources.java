package com.projetopessoal.Projeto.pessoal.aula.Ezequias.resources;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.enums.GeneroMusical;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.enums.Nacao;
import org.antlr.v4.runtime.misc.Pair;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@RestController
@RequestMapping("/api/generos")
public class GeneroMusicalResources {

    @GetMapping
    public List<String> GetGeneroMusical(){
        return Arrays.stream(GeneroMusical.values()).map(Enum::name).collect(Collectors.toList());
    }

    @GetMapping("/desc")
    public List<Pair<GeneroMusical,String>> GetDescGeneroMusical(){
        List<Pair<GeneroMusical,String>> response = new ArrayList<>() ;
        Stream.of(GeneroMusical.values()).forEach(genero-> response.add( new Pair<GeneroMusical,String>(genero,genero.getDescricao())));
        return response;
    }
}


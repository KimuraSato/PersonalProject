package com.projetopessoal.Projeto.pessoal.aula.Ezequias.resources;



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
@RequestMapping("/api/nacao")
public class NacaoResources {

    @GetMapping("/nomes")
    public List<String> GetNomeNacao(){
        return Arrays.stream(Nacao.values()).map(Enum::name).collect(Collectors.toList());
    }

    @GetMapping("/desc")

    public List<Pair<Nacao,String>> GetDescNacao(){
        List<Pair<Nacao,String>> response = new ArrayList<>() ;
        Stream.of(Nacao.values()).forEach(nacao -> response.add( new Pair<Nacao,String>(nacao,nacao.getDescricao())));
        return response;
    }

}

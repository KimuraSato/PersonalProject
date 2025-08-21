package com.projetopessoal.Projeto.pessoal.aula.Ezequias.resources;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.enums.GeneroMusical;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.enums.Status;
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
@RequestMapping("/api/status")
public class StatusResources {
    @GetMapping
    public List<String> Getstatus(){
        return Arrays.stream(Status.values()).map(Enum::name).collect(Collectors.toList());
    }

    @GetMapping("/desc")
    public List<Pair<Status,String>> GetDescStatus(){
        List<Pair<Status,String>> response = new ArrayList<>() ;
        Stream.of(Status.values()).forEach(status-> response.add( new Pair<Status,String>(status,status.getDescricao())));
        return response;
}}

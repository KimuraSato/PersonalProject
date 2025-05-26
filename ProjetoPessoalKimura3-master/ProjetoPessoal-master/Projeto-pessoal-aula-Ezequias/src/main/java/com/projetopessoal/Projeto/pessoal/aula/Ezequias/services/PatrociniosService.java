package com.projetopessoal.Projeto.pessoal.aula.Ezequias.services;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.PatrocinioDTO;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Patrocinio;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.repositories.PatrocinioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class PatrociniosService {

    @Autowired
    private PatrocinioRepository patrocinioRepository;

    public PatrocinioDTO salvarPatrocinios(PatrocinioDTO PatrocinioDTO) {
        Patrocinio Patrocinio = converterPatrociniosDTOParaPatrocinios(PatrocinioDTO);
        Patrocinio = patrocinioRepository.save(Patrocinio);
        return converterPatrociniosParaPatrociniosDTO(Patrocinio);
    }

    private Patrocinio converterPatrociniosDTOParaPatrocinios(PatrocinioDTO PatrocinioDTO) {
        Patrocinio Patrocinio = new Patrocinio(PatrocinioDTO);
        return Patrocinio;
    }

    public PatrocinioDTO converterPatrociniosParaPatrociniosDTO(Patrocinio Patrocinio) {
        PatrocinioDTO PatrocinioDTO = new PatrocinioDTO(Patrocinio);
        return PatrocinioDTO;
    }

    public Patrocinio buscarPatrociniosPorId(Long id) {
        return patrocinioRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Patrocinios não encontrado"));
    }

    public Patrocinio buscarPatrociniosPorNome(String nome) {
        return patrocinioRepository.findByNome(nome)
                .orElseThrow(() -> new IllegalArgumentException("Patrocinios não encontrado"));
    }

    public PatrocinioDTO atualizarPatrocinios(PatrocinioDTO patrocinioDTO) {

        if (Objects.isNull(patrocinioDTO.getId())) {
            throw new IllegalArgumentException("Id não informado");
        }

        Patrocinio patrocinio = patrocinioRepository.findById(patrocinioDTO.getId())
                .orElseThrow(() -> new IllegalArgumentException("Patrocinios não encontrado"));

        patrocinio = converterPatrociniosDTOParaPatrocinios(patrocinioDTO);
        patrocinio = patrocinioRepository.save(patrocinio);

        return converterPatrociniosParaPatrociniosDTO(patrocinio);

    }

    public void deletarPatrocinios(Long id) {
        patrocinioRepository.deleteById(id);

    }
}
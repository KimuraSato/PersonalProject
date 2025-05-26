package com.projetopessoal.Projeto.pessoal.aula.Ezequias.services;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.IntegranteDTO;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Integrante;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.repositories.IntegranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class IntegrantesService {
    
    @Autowired
    private IntegranteRepository integranteRepository;

    public IntegranteDTO salvarIntegrantes(IntegranteDTO IntegranteDTO) {
        Integrante Integrante = converterIntegrantesDTOParaIntegrantes(IntegranteDTO);
        Integrante = integranteRepository.save(Integrante);
        return converterIntegrantesParaIntegrantesDTO(Integrante);
    }

    private Integrante converterIntegrantesDTOParaIntegrantes(IntegranteDTO IntegranteDTO) {
        Integrante Integrante = new Integrante(IntegranteDTO);
        return Integrante;
    }

    public IntegranteDTO converterIntegrantesParaIntegrantesDTO(Integrante Integrante) {
        IntegranteDTO IntegranteDTO = new IntegranteDTO(Integrante);
        return IntegranteDTO;
    }

    public Integrante buscarIntegrantesPorId(Long id) {
        return integranteRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Integrante não encontrado"));
    }

    public Integrante buscarIntegrantesPorNome(String nome) {
        return integranteRepository.findByNome(nome)
                .orElseThrow(() -> new IllegalArgumentException("Integrante não encontrado"));
    }

    public IntegranteDTO atualizarIntegrantes(IntegranteDTO integranteDTO) {

        if (Objects.isNull(integranteDTO.getId())) {
            throw new IllegalArgumentException("Id não informado");
        }

        Integrante integrante = integranteRepository.findById(integranteDTO.getId()).orElseThrow(()
                -> new IllegalArgumentException("Integrante não encontrado"));

        integrante = converterIntegrantesDTOParaIntegrantes(integranteDTO);
        integrante = integranteRepository.save(integrante);

        return converterIntegrantesParaIntegrantesDTO(integrante);

    }

    public void deletarIntegrantes(Long id) {
        integranteRepository.deleteById(id);

    }
}

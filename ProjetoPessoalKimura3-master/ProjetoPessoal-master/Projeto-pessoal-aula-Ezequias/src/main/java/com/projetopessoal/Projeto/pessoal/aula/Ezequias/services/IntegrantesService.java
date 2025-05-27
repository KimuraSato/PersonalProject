package com.projetopessoal.Projeto.pessoal.aula.Ezequias.services;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.IntegranteDTO;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Integrante;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.repositories.IntegranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class IntegrantesService {
    
    @Autowired
    private IntegranteRepository integranteRepository;

    public IntegranteDTO salvarIntegrantes(IntegranteDTO IntegranteDTO) {
        Integrante Integrante = converterIntegrantesDTOParaIntegrantes(IntegranteDTO);
        Integrante = integranteRepository.save(Integrante);
        return converterIntegrantesParaIntegrantesDTO(Integrante);
    }

    private Integrante converterIntegrantesDTOParaIntegrantes(IntegranteDTO integranteDTO) {
        Integrante integrante = new Integrante(integranteDTO);
        return integrante;
    }

    public IntegranteDTO converterIntegrantesParaIntegrantesDTO(Integrante Integrante) {
        IntegranteDTO IntegranteDTO = new IntegranteDTO(Integrante);
        return IntegranteDTO;
    }
    // --- NEW METHOD FOR LIST CONVERSION ---
    public List<IntegranteDTO> converterIntegrantesParaIntegrantesDTO(List<Integrante> integrantes) {
        return integrantes.stream()
                .map(this::converterIntegrantesParaIntegrantesDTO) // Reuses the single conversion method
                .collect(Collectors.toList());
    }
    // ------------------------------------

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

    public List<IntegranteDTO> buscaTodos() {
        List<Integrante> list = integranteRepository.findAll();
        // Now it calls the correct overloaded method for List conversion
        return converterIntegrantesParaIntegrantesDTO(list);
    }
}
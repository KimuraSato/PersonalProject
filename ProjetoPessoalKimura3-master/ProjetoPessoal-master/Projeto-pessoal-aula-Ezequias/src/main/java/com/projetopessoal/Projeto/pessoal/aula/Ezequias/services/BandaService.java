package com.projetopessoal.Projeto.pessoal.aula.Ezequias.services;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.BandaDTO;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Banda;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.repositories.BandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class BandaService {

    @Autowired
    private BandaRepository bandaRepository;

    public BandaDTO salvarBanda(BandaDTO BandaDTO) {
        Banda Banda = converterBandaDTOParaBanda(BandaDTO);
        Banda = bandaRepository.save(Banda);
        return converterBandaParaBandaDTO(Banda);
    }

    private Banda converterBandaDTOParaBanda(BandaDTO BandaDTO) {
        Banda Banda = new Banda(BandaDTO);
        return Banda;
    }

    public BandaDTO converterBandaParaBandaDTO(Banda Banda) {
        BandaDTO BandaDTO = new BandaDTO(Banda);
        return BandaDTO;
    }

    public Banda buscarBandaPorId(Long id) {
        return bandaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Integrante não encontrado"));
    }

    public Banda buscarBandaPorNome(String nome) {
        return bandaRepository.findByNome(nome)
                .orElseThrow(() -> new IllegalArgumentException("Integrante não encontrado"));
    }

    public BandaDTO atualizarBanda(BandaDTO bandaDTO) {

        if (Objects.isNull(bandaDTO.getId())) {
            throw new IllegalArgumentException("Id não informado");
        }

        Banda banda = bandaRepository.findById(bandaDTO.getId())
                .orElseThrow(() -> new IllegalArgumentException("Integrante não encontrado"));

        banda = converterBandaDTOParaBanda(bandaDTO);
        banda = bandaRepository.save(banda);

        return converterBandaParaBandaDTO(banda);

    }

    public void deletarBanda(Long id) {
        bandaRepository.deleteById(id);

    }
}
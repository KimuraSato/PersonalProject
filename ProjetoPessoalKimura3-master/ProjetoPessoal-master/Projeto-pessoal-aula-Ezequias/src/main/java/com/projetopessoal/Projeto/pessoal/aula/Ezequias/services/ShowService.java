package com.projetopessoal.Projeto.pessoal.aula.Ezequias.services;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.ShowDTO;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.UsuarioDTO;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Show;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Usuario;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.repositories.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ShowService {

    @Autowired
    private ShowRepository showRepository;

    public ShowDTO salvarShow(ShowDTO showDTO) {
        Show show = showRepository.save(new Show(showDTO));
        show = showRepository.findById(show.getId()).get();
        return showDTO;
    }

    private Show converterShowDTOParaShow(ShowDTO showDTO) {
        Show show = new Show();
        show.setId(showDTO.getId());
        show.setNome(showDTO.getNome());
        show.setDescricao(showDTO.getDescricao());
        show.setData(showDTO.getData());
        show.setNacao(showDTO.getNacao());
        show.sethorarioInicio(showDTO.gethorarioInicio());
        show.setIdprodutoras(showDTO.getIdprodutoras());
        return show;
    }

    public ShowDTO converterShowParaShowDTO(Show show) {
        ShowDTO showDTO = new ShowDTO();
        show.setId(showDTO.getId());
        show.setNome(showDTO.getNome());
        show.setDescricao(showDTO.getDescricao());
        show.setData(showDTO.getData());
        show.setNacao(showDTO.getNacao());
        show.sethorarioInicio(showDTO.gethorarioInicio());
        show.setIdprodutoras(showDTO.getIdprodutoras());
        return showDTO;
    }

    public Show buscarShowPorId(Long id) {
        return showRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Show não encontrado"));
    }

    public Show buscarShowPorNome(String nome) {
        return showRepository.findByNome(nome).orElseThrow(() -> new IllegalArgumentException("Show não encontrado"));
    }

    public ShowDTO atualizarShow(ShowDTO ShowDTO) {

        if (Objects.isNull(ShowDTO.getId())) {
            throw new IllegalArgumentException("Id não informado");
        }

        Show show = showRepository.findById(ShowDTO.getId()).orElseThrow(()
                -> new IllegalArgumentException("Usuário não encontrado"));

        show = converterShowDTOParaShow(ShowDTO);
        show = showRepository.save(show);

        return converterShowParaShowDTO(show);

    }

    public void deletarShow(Long id) {

        showRepository.deleteById(id);

    }

    }
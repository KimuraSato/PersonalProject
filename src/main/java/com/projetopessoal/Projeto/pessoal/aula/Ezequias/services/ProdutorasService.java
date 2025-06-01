package com.projetopessoal.Projeto.pessoal.aula.Ezequias.services;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.IntegranteDTO;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.ProdutoraDTO;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Integrante;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Produtora;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.repositories.ProdutoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ProdutorasService {

    @Autowired
    private ProdutoraRepository produtoraRepository;

    public ProdutoraDTO salvarProdutoras(ProdutoraDTO produtoraDTO) {
        Produtora produtora = converterProdutorasDTOParaProdutoras(produtoraDTO);
        produtora = produtoraRepository.save(produtora);
        return converterProdutorasParaProdutorasDTO(produtora);
    }

    private Produtora converterProdutorasDTOParaProdutoras(ProdutoraDTO produtoraDTO) {
        Produtora produtora = new Produtora();
        produtora.setId(produtoraDTO.getId());
        produtora.setNome(produtoraDTO.getNome());
        produtora.setcpfCnpj(produtoraDTO.getcpfCnpj());
        return produtora;
    }

    public ProdutoraDTO converterProdutorasParaProdutorasDTO(Produtora produtora) {
        ProdutoraDTO produtoraDTO = new ProdutoraDTO();
        produtoraDTO.setId(produtora.getId());
        produtoraDTO.setNome(produtora.getNome());
        produtoraDTO.setcpfCnpj(produtora.getcpfCnpj());
        produtora.setEmail(produtoraDTO.getEmail());
        return produtoraDTO;
    }

    public List<ProdutoraDTO> converterProdutorasParaProdutorasDTO(List<Produtora> produtoras) {
        return produtoras.stream()
                .map(this::converterProdutorasParaProdutorasDTO) // Reuses the single conversion method
                .collect(Collectors.toList());
    }

    public Produtora buscarProdutorasPorId(Long id) {
        return produtoraRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Produtoras não encontrada"));
    }

    public ProdutoraDTO buscarProdutorasPorcpfCnpj(Long cpfCnpj) {
        return converterProdutorasParaProdutorasDTO(produtoraRepository.findBycpfCnpj(cpfCnpj)
                .orElseThrow(() ->
                        new IllegalArgumentException("Produtoras não encontrada")));
    }

    public ProdutoraDTO atualizarProdutoras(ProdutoraDTO produtoraDTO) {

        if (Objects.isNull(produtoraDTO.getId())) {
            throw new IllegalArgumentException("Id não informado");
        }

        Produtora produtora = produtoraRepository.findById(produtoraDTO.getId()).orElseThrow(()
                -> new IllegalArgumentException("Produtoras não encontrada"));

        produtora = converterProdutorasDTOParaProdutoras(produtoraDTO);
        produtora = produtoraRepository.save(produtora);

        return converterProdutorasParaProdutorasDTO(produtora);

    }

    public void deletarProdutoras(Long id) {
        produtoraRepository.deleteById(id);

    }

    public List<ProdutoraDTO> buscarTodasProdutoras(){
        List<Produtora> list = produtoraRepository.findAll();
        return converterProdutorasParaProdutorasDTO(list);
    }

}
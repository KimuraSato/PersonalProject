package com.projetopessoal.Projeto.pessoal.aula.Ezequias.repositories;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Patrocinio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatrocinioRepository extends JpaRepository<Patrocinio, Long> {
    Optional<Patrocinio> findById(Long id);

    Optional<Patrocinio> findByNome(String nome);

}

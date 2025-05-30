package com.projetopessoal.Projeto.pessoal.aula.Ezequias.repositories;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShowRepository extends JpaRepository<Show, Long> {
    Optional<Show> findById(Long id);
    Optional<Show> findByNome(String nome);

}

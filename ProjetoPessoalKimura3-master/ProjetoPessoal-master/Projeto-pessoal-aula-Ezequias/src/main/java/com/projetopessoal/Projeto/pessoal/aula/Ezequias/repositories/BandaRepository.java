package com.projetopessoal.Projeto.pessoal.aula.Ezequias.repositories;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Banda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BandaRepository extends JpaRepository<Banda, Long> {
    Optional<Banda> findById(Long id);

    Optional<Banda> findByNome(String nome);

}

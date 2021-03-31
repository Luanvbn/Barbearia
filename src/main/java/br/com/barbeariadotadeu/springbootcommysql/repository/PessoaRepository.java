package br.com.barbeariadotadeu.springbootcommysql.repository;

import br.com.barbeariadotadeu.springbootcommysql.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}

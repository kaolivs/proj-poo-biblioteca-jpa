package com.biblioteca.repository;

import com.biblioteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    List<Livro> findByTituloContainingIgnoreCase(String titulo);
    List<Livro> findByAutorIgnoreCase(String autor);
    List<Livro> findByCategoria_NomeIgnoreCase(String nomeCategoria);
    List<Livro> findByQuantidadeGreaterThan(Integer quantidadeMinima);
}

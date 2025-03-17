package com.biblioteca.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O título é obrigatório.")
    private String titulo;

    @NotBlank(message = "O autor é obrigatório.")
    private String autor;

    @NotBlank(message = "O ISBN é obrigatório.")
    private String isbn;

    @NotBlank(message = "A editora é obrigatória.")
    private String editora;

    @NotNull(message = "A quantidade não pode ser nula.")
    private Integer quantidade;

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;

    public Livro() {}

    // Getters e Setters
}

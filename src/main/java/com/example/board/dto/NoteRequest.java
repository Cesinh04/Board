package com.example.board.dto;
import jakarta.validation.constraints.NotBlank;
public record NoteRequest(
        @NotBlank(message = "Título é obrigatório") String title,
        @NotBlank(message = "Conteúdo é obrigatório") String content
) {}
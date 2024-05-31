package br.com.alura.screenmatch.dto;

import br.com.alura.screenmatch.model.Categoria;

import java.util.List;
import java.util.stream.Collector;

public record SerieDTO( Long id,
             String titulo,
             Integer totalTemporadas,
             Double avaliacao,
             Categoria genero,
            String atores,
            String poster,
            String sinopse) {
}

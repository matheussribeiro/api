package com.noticiasgard.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity // Notation responsável por defenir que a classe é uma entidade do Banco
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Noticia {
    @Id // Notation que define a PK da tabela no Banco
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Notation que define o incremento do ID no banco
    Long id;
    String titulo;
    String categoria;
    String descricao;
    String conteudo;
    String img;
    Boolean isDestaque;
    Date dataInicio;
    Date dataFim;
}

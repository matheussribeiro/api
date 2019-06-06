package com.noticiasgard.api.repository;

import com.noticiasgard.api.model.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticiaRepository extends JpaRepository<Noticia,Long> {  // Parametros : Classe / Tipo do PK
}

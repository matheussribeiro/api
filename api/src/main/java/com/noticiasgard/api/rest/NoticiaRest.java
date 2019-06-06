package com.noticiasgard.api.rest;

import com.noticiasgard.api.model.Noticia;
import com.noticiasgard.api.service.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/noticias")
public class NoticiaRest {

    @Autowired // cria um serviço
    private NoticiaService noticiaService;

    @GetMapping
    public ResponseEntity<List<Noticia>> getNoticias(){
        return ResponseEntity.ok(noticiaService.getNoticias());

    }
}

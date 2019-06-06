package com.noticiasgard.api.service;

import com.noticiasgard.api.model.Noticia;
import com.noticiasgard.api.repository.NoticiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticiaService {

    @Autowired
    private NoticiaRepository noticiaRepository;


     public List<Noticia> getNoticias() {
        return noticiaRepository.findAll();

    }
}

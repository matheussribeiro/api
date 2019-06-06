package com.noticiasgard.api.service;

import com.noticiasgard.api.model.Noticia;
import com.noticiasgard.api.repository.NoticiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@Service
public class CreateDevDbService {
    @Autowired
    NoticiaRepository noticiaRepository;

    public void createDb(){
        Noticia n1 = new Noticia(
                null,
                "Titulo1",
                "Esportes",
                "Veja a treta do Neymar meu Libido",
                "Neymar boladoNeymar boladoNeymar boladoNeymar " +
                        "boladoNeymar boladoNeymar boladoNeymar boladoNeymar boladoNeymar boladoNeymar bolado,",
                "imagemaqui",
                true,
                new Date(),
                null
        );


        Noticia n2 = new Noticia(
                null,
                "Titulo2",
                "Esportes",
                "Veja a treta do Neymar meu Libido",
                "Neymar boladoNeymar boladoNeymar boladoNeymar " +
                        "boladoNeymar boladoNeymar boladoNeymar boladoNeymar boladoNeymar boladoNeymar bolado,",
                "imagemaqui",
                true,
                new Date(),
                null
        );

        Noticia n3 = new Noticia(
                null,
                "Titulo3",
                "Esportes",
                "Veja a treta do Neymar meu Libido",
                "Neymar boladoNeymar boladoNeymar boladoNeymar " +
                        "boladoNeymar boladoNeymar boladoNeymar boladoNeymar boladoNeymar boladoNeymar bolado,",
                "imagemaqui",
                true,
                new Date(),
                null
        );


        Noticia n4 = new Noticia(
                null,
                "Titulo4",
                "Esportes",
                "Veja a treta do Neymar meu Libido",
                "Neymar boladoNeymar boladoNeymar boladoNeymar " +
                        "boladoNeymar boladoNeymar boladoNeymar boladoNeymar boladoNeymar boladoNeymar bolado,",
                "imagemaqui",
                true,
                new Date(),
                null
        );


        Noticia n5 = new Noticia(
                null,
                "Titulo5",
                "Jogos",
                "Veja a treta do Neymar meu Libido",
                "Neymar boladoNeymar boladoNeymar boladoNeymar " +
                        "boladoNeymar boladoNeymar boladoNeymar boladoNeymar boladoNeymar boladoNeymar bolado,",
                "imagemaqui",
                false,
                new Date(),
                null
        );


        Noticia n6 = new Noticia(
                null,
                "Titulo6",
                "Jogos",
                "Veja a treta do Neymar meu Libido",
                "Neymar boladoNeymar boladoNeymar boladoNeymar " +
                        "boladoNeymar boladoNeymar boladoNeymar boladoNeymar boladoNeymar boladoNeymar bolado,",
                "imagemaqui",
                false,
                new Date(),
                null
        );



        Noticia n7 = new Noticia(
                null,
                "Titulo7",
                "Jogos",
                "Veja a treta do Neymar meu Libido",
                "Neymar boladoNeymar boladoNeymar boladoNeymar " +
                        "boladoNeymar boladoNeymar boladoNeymar boladoNeymar boladoNeymar boladoNeymar bolado,",
                "imagemaqui",
                false,
                new Date(),
                null
        );


        Noticia n8 = new Noticia(
                null,
                "Titulo8",
                "Jogos",
                "Veja a treta do Neymar meu Libido",
                "Neymar boladoNeymar boladoNeymar boladoNeymar " +
                        "boladoNeymar boladoNeymar boladoNeymar boladoNeymar boladoNeymar boladoNeymar bolado,",
                "imagemaqui",
                false,
                new Date(),
                null
        );


        Noticia n9 = new Noticia(
                null,
                "Titulo9",
                "Jogos",
                "Veja a treta do Neymar meu Libido",
                "Neymar boladoNeymar boladoNeymar boladoNeymar " +
                        "boladoNeymar boladoNeymar boladoNeymar boladoNeymar boladoNeymar boladoNeymar bolado,",
                "imagemaqui",
                false,
                new Date(),
                null
        );


        Noticia n10= new Noticia(
                null,
                "Titulo10",
                "Jogos",
                "Veja a treta do Neymar meu Libido",
                "Neymar boladoNeymar boladoNeymar boladoNeymar " +
                        "boladoNeymar boladoNeymar boladoNeymar boladoNeymar boladoNeymar boladoNeymar bolado,",
                "imagemaqui",
                false,
                new Date(),
                null
        );

        noticiaRepository.saveAll(Arrays.asList(n1,n2,n3,n4,n5,n6,n7,n8,n9,n10));


    }
}

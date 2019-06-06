package com.noticiasgard.api.config;

import com.noticiasgard.api.service.CreateDevDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {
    @Autowired // instancia o Objeto
    private CreateDevDbService createDevDbService;

    @Bean  // Informa ao SpringBoot que deve ser rodado na inicialização
    public boolean createDb(){

        createDevDbService.createDb();
        return true;
    }
}

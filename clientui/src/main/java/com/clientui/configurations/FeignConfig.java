package com.clientui.configurations;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    //Permet au client de s'authentifier sur ZUUL
    @Bean
    public BasicAuthRequestInterceptor BARI(){
        return new BasicAuthRequestInterceptor("utilisateur", "mdp");

    }

}

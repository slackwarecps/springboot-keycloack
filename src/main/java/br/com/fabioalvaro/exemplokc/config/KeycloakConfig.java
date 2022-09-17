package br.com.fabioalvaro.exemplokc.config;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeycloakConfig {

    Logger logger = LoggerFactory.getLogger(KeycloakConfig.class);


    @Bean
    public KeycloakSpringBootConfigResolver keycloakConfigResolver() {
        logger.info("#1 passou no kc: KeycloakConfig >> keycloakConfigResolver");
        return new KeycloakSpringBootConfigResolver();
    }
}

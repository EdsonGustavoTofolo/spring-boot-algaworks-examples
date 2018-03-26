package br.com.algaworks.edsontofolo.gestaofesta.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * Created by Edson on 25/03/2018.
 */
@Configuration
@EnableWebSecurity
public class InMemorySecurityConfig {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder managerBuilder) throws Exception {
        managerBuilder.inMemoryAuthentication()
                .withUser("joao").password("{noop}joao").roles("USER")
                .and()
                .withUser("alexandre").password("{noop}alexandre").roles("USER")
                .and()
                .withUser("thiago").password("{noop}thiago").roles("USER");
    }
}

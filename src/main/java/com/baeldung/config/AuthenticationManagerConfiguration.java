package com.baeldung.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AuthenticationManagerConfiguration extends GlobalAuthenticationConfigurerAdapter {

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        // resource server users
        auth.inMemoryAuthentication().withUser("baeldung-user").password("password").roles("USER");
        auth.inMemoryAuthentication().withUser("baeldung-admin").password("password").roles("ADMIN");
        // auth server user
        auth.inMemoryAuthentication()
            .withUser(AuthorizationServerConfig.CLIENT_ID)
            .password(AuthorizationServerConfig.CLIENT_SECRET).roles("");
        auth.inMemoryAuthentication().passwordEncoder(passwordEncoder());
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

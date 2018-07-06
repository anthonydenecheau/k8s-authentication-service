package com.scc.authentication.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;


@Configuration
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

   @Override
    @Bean
    public UserDetailsService userDetailsServiceBean() throws Exception {
        return super.userDetailsServiceBean();
    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
	        .inMemoryAuthentication()
	        .withUser("HrsPfurTg4wtk9KQPYC9").password("pwd").roles("ODS")
	        .and()
	        .withUser("Its06Tfcshew8HQeVmP80").password("pwd").roles("AGRIA")
	        .and()
	        .withUser("POyIiqsN6gQxde7zxuX5").password("pwd").roles("SCC_EXPOS");
    }
}
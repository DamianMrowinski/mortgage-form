package com.mortgageform.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    @Qualifier("usersDataSource")
    private DataSource usersDataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(usersDataSource);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/loans/confirm-form*").hasAnyRole("EMPLOYEE", "MANAGER")
                .antMatchers("/loans/save-updated-form*").hasAnyRole("EMPLOYEE", "MANAGER")
                .antMatchers("/loans/save-new-form*").permitAll()
                .antMatchers("/loans/delete").hasRole("MANAGER")
                .antMatchers("/loans/list").hasAnyRole("EMPLOYEE", "MANAGER")
                .antMatchers("/resources/**").permitAll()
                .and()
                .formLogin().loginPage("/login").loginProcessingUrl("/authenticateTheUser").permitAll()
                .and()
                .logout().permitAll()
                .and().exceptionHandling().accessDeniedPage("/no-access");
    }
}







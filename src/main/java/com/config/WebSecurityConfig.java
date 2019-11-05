package com.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

//    @Autowired
//    UserRealizationDAO userRealizationDAO;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
      /*  http.authorizeRequests().anyRequest().hasAnyRole("ADMIN","USER")
                .and()
                .authorizeRequests().antMatchers("/login**").permitAll()
                .and()
                .formLogin().loginPage("/login").loginProcessingUrl("/loginAction").permitAll()
                .and()
                .logout().logoutSuccessUrl("/login").permitAll()
                .and()
                .csrf().disable();*/


       /* http.authorizeRequests()
                .anyRequest().authenticated()
                .and().formLogin()
                .loginPage("/login").permitAll();*/
    }
}

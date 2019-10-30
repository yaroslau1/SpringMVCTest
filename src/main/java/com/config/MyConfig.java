package com.config;

import com.configuration.HibernateSessionFactoryUtil;
import com.dao.AccountRealizationDAO;
import com.dao.UserRealizationDAO;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan("com")
@EnableWebMvc
public class MyConfig extends WebMvcConfigurerAdapter {

    @Override
    public  void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/WEB-INF/pages/**").addResourceLocations("/pages/");

    }
    @Bean
    public  InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver resolver= new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/pages/");
        resolver.setSuffix(".jsp");
        return resolver;

    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
    public HibernateSessionFactoryUtil hibernateSessionFactoryUtil() {
        return new HibernateSessionFactoryUtil();
    }

    @Bean
    public SessionFactory sessionFactory(){
        return hibernateSessionFactoryUtil().getSessionFactory();

    }
    @Bean
    public AccountRealizationDAO accountDao() {
        return new AccountRealizationDAO(sessionFactory());
    }

    @Bean
    public UserRealizationDAO userDao(){
        return new UserRealizationDAO(sessionFactory());
    }

}

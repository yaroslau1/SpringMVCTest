package com.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan("com")
@EnableWebMvc
@PropertySource("classpath:database.properties")
@PropertySource("classpath:hibernate.properties")
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    Environment environment;

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
    public LocalSessionFactoryBean sessionFactoryBean(@Autowired DataSource dataSource){
        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        localSessionFactoryBean.setDataSource(dataSource);
        localSessionFactoryBean. setPackagesToScan("com.entity");
        localSessionFactoryBean.setHibernateProperties(createHibernateProperties());
        return localSessionFactoryBean;
    }

    private Properties createHibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", environment.getProperty("hibernate.dialect"));
        properties.put("hibernate.hbm2dll.auto", environment.getProperty("hibernate.hbm2dll.auto"));
        properties.put("hibernate.showSql", environment.getProperty("hibernate.showSql"));
        return properties;
    }

    @Bean
    public BasicDataSource dataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(environment.getProperty("database.url"));
        dataSource.setUsername(environment.getProperty("database.username"));
        dataSource.setPassword(environment.getProperty("database.password"));
        dataSource.setDriverClassName(environment.getProperty("database.driver"));
        return dataSource;
    }

    @Bean
    public HibernateTransactionManager transactionManager(@Autowired SessionFactory sessionFactory){
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory);
        return transactionManager;
    }

//    @Bean
//    public HibernateSessionFactoryUtil hibernateSessionFactoryUtil() {
//        return new HibernateSessionFactoryUtil();
//    }

//    @Bean
//    public SessionFactory sessionFactory(){
//        return hibernateSessionFactoryUtil().getSessionFactory();
//
//    }
//    @Bean
//    public AccountRealizationDAO accountDao() {
//        return new AccountRealizationDAO(sessionFactory());
//    }
//
//    @Bean
//    public UserRealizationDAO userDao(){
//        return new UserRealizationDAO(sessionFactory());
//    }

}

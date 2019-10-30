package com.configuration;

import com.entity.AccountEntity;
import com.entity.UserEntity;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {

    public HibernateSessionFactoryUtil() {
    }

    public SessionFactory getSessionFactory() {
        try {

            Configuration configuration =
                    new Configuration().configure();
            configuration.addAnnotatedClass(UserEntity.class);
            configuration.addAnnotatedClass(AccountEntity.class);

            StandardServiceRegistryBuilder builder =
                    new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
            return configuration.buildSessionFactory(builder.build());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }
}

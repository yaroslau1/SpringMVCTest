package dao;

import com.config.WebMvcConfig;
import com.dao.IUser;
import com.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;

@ComponentScan(basePackages = "com")
@WebAppConfiguration
@ContextConfiguration(classes = {WebMvcConfig.class})
@PropertySource("classpath:database.properties")
@PropertySource("classpath:hibernate.properties")
@RunWith(SpringRunner.class)
public class UserRealizationDAOTest {

    @Autowired
    IUser user;

    @Test
    @Rollback
    public void findById() {
        User check = user.findById(1);
        assertEquals(1, check.getIdUser());
    }
}
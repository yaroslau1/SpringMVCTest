package dao;

import com.config.WebMvcConfig;
import com.dao.IUser;
import com.dao.UserRealizationDAO;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@ComponentScan(basePackages = "com")
@WebAppConfiguration
@ContextConfiguration(classes = {WebMvcConfig.class})
@PropertySource("classpath:database.properties")
@PropertySource("classpath:hibernate.properties")
public class UserRealizationDAOTestNG  extends AbstractTestNGSpringContextTests {


    @Autowired
    IUser user;

    @Test
    public void findById() {
        User check = user.findById(1);
        assertEquals(1, check.getIdUser());
    }
}
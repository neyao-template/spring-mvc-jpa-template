package org.oursight.learning.jpa;

import org.oursight.learning.jpa.bo.User;
import org.oursight.learning.jpa.config.AppicationContextConfig;
import org.oursight.learning.jpa.config.DataSourceConfiguration;
import org.oursight.learning.jpa.config.JpaConfiguration;
import org.oursight.learning.jpa.dao.JpaUserDao;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 * Created by neyao@github.com on 2016/4/25.
 */
public class TestJpa {

    public static void main(String[] args) {

        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(AppicationContextConfig.class);
        ctx.register(DataSourceConfiguration.class);
        //ctx.register(HibernateConfiguration.class);
        ctx.register(JpaConfiguration.class);

        JpaUserDao userDao =  (JpaUserDao)ctx.getBean("userDao");

        User user  = new User();
        user.setUsername("userName");
        user.setEmail("test@test.com");
        user.setPassword("123456");
        user.setAge(40);

        userDao.save(user);

        ctx.close();
    }
}

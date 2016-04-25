package cn.com.deepdata.keystone;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import cn.com.deepdata.keystone.config.ApplicationContextConfig;
import cn.com.deepdata.keystone.config.DataSourceConfig;
import cn.com.deepdata.keystone.config.JpaConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext container) throws ServletException {

        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.setServletContext(container);
        ctx.register(ApplicationContextConfig.class);
        ctx.register(DataSourceConfig.class);
        ctx.register(JpaConfig.class);


        ServletRegistration.Dynamic servlet = container.addServlet(
                "dispatcher", new DispatcherServlet(ctx));

        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }

}

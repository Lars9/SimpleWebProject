package test;

import dao.JdbcDao;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Alex.Titov on 23.07.2015.
 */

public class TestClass {


    private JdbcDao jdbcDao;
    private EmbeddedDatabase db;

    @Before
    public void setUp(){
        db = new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).addScript("db/create-db.sql").addScript("db/insert-data.sql").build();
    }

    @Test
    public void testGetObjects(){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-app.xml");
        jdbcDao = (JdbcDao) context.getBean("jdbcDao");
        List<Map<String, Object>> list = jdbcDao.getObjects();
        Assert.assertNotNull(list);
    }

    @After
    public void shutDown(){

        db.shutdown();
    }

}

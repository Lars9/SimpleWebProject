//import org.springframework.context.support.ClassPathXmlApplicationContext;
/*import org.springframework.context.support.ClassPathXmlApplicationContext;
import dao.SpringJdbc;*/

//import dao.JdbcDao;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.JdbcDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Alex.Titov on 22.07.2015.
 */
public class TestClass {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-app.xml");
        JdbcDao springJdbc = (JdbcDao)context.getBean("springJdbc");

       System.out.println(springJdbc.getObjects());


    }
}


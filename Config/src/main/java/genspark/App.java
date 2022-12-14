package annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {


    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Configs.class);
        student s1 = (student)context.getBean("student1");
        student s2 = (student)context.getBean("student2");
        System.out.println(s1);
        System.out.println(s2);
    }
}


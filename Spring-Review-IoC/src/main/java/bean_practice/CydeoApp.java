package bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class CydeoApp {


    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class, StringConfig.class);


        FullTimeEmployee fullTimeEmployee = container.getBean(FullTimeEmployee.class);
        PartTimeEmployee partTimeEmployee = container.getBean(PartTimeEmployee.class);

        fullTimeEmployee.createAccount();
        partTimeEmployee.createAccount();

        String str = container.getBean("str1", String.class);
        System.out.println(str);

        String str2 = container.getBean("str2", String.class);
        System.out.println(str2);
    }


}

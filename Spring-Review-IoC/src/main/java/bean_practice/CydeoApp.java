package bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {


    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

        FullTimeEmployee fullTimeEmployee = container.getBean(FullTimeEmployee.class);
        PartTimeEmployee partTimeEmployee = container.getBean(PartTimeEmployee.class);

        fullTimeEmployee.createAccount();
        partTimeEmployee.createAccount();
    }


}

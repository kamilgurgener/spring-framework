package stereotype_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stereotype_annotations.config.AppConfig;
import stereotype_annotations.model.DataStructure;
import stereotype_annotations.model.Microservice;

public class CydeoApp {

    public CydeoApp() {
    }

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);



       DataStructure dataStructure =  context.getBean(DataStructure.class);
       Microservice microservice = context.getBean(Microservice.class);



        dataStructure.getTotalHours();
        microservice.getTotalHours();

    }
}

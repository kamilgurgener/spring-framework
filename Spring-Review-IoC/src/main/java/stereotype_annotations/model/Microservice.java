package stereotype_annotations.model;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Microservice {

    public void getTotalHours(){
        System.out.println("Total Hours: " + 30 );
    }

}

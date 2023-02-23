package stereotype_annotations.model;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataStructure {

    ExrtaHours exrtaHours;

    public void getTotalHours(){
        System.out.println("Total Hours: " + (20 + exrtaHours.getHours()));
    }
}

package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class StringConfig {

    @Bean
    @Primary
    public String str1(){
        return "Welcome to CydeoApp";
    }


    @Bean
    public String str2(){
        return "Spring Core Practice";
    }
}

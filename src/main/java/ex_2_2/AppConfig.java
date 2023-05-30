package ex_2_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MyClass myClass() {
        MyClass myClass = new MyClass(10);
        myClass.init(true);
        return myClass;
    }
}
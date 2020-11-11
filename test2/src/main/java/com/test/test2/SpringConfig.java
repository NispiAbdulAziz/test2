package com.test.test2;

import com.test.test2.service.HumanServiceImpl;
import com.test.test2.service.HumanServie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {


    @Bean
    HumanServie humanServie() {
        return new HumanServiceImpl();
    }
}

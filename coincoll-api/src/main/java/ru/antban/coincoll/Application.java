package ru.antban.coincoll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import ru.antban.coincoll.api.controller.SpringControllersMarker;

@SpringBootApplication
@ComponentScan(basePackageClasses = SpringControllersMarker.class)
public class Application {
    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}

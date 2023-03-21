package at.htld.module.appointmentapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AppointmentApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppointmentApiApplication.class, args);
    }

}

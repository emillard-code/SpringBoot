package com.project;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import vehicle.Car;
import vehicle.Vehicle;

@SpringBootApplication(scanBasePackages = {"com.project", "tire", "vehicle"})
public class Main {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

        Vehicle vehicle1 = (Vehicle) context.getBean("car");
        Vehicle vehicle2 = (Vehicle) context.getBean("truck");

        vehicle1.drive();
        vehicle2.drive();

    }

}

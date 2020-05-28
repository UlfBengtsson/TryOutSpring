package org.example;

import org.example.data.CarDao;
import org.example.models.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;


public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppComponentConfig.class);

        CarDao carManager = context.getBean(CarDao.class);

        Car aCar = context.getBean(Car.class);

        Car mySaab = carManager.create("Saab","900S","ABC123");

        System.out.println(mySaab);

    }

}

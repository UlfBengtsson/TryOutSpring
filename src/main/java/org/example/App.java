package org.example;

import org.example.configs.AppComponentConfig;
import org.example.data.CarDao;
import org.example.models.CPU;
import org.example.models.Car;
import org.example.models.PC;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppComponentConfig.class);

        CarDao carManager = context.getBean(CarDao.class);

        Car mySaab = carManager.create("Saab","900S","ABC123");

        System.out.println("mySaab: " + mySaab);

        PC myPC = context.getBean(PC.class);

        System.out.println(myPC.getCpu().getBrand());

        CPU myCPU = context.getBean("cleanCPU", CPU.class);

        System.out.println("clean CPU: " + myCPU.getBrand());

    }

}

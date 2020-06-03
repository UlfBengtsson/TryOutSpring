package org.example.configs;

import org.example.models.CPU;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class AppComponentConfig {
    @Bean
    public CPU cpu() {
        CPU cpu = new CPU();
        cpu.setBrand("foo");
        cpu.setModelName("bar");
        return cpu;
    }
}

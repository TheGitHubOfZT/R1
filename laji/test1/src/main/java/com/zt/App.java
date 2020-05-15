package com.zt;

import com.zt.config.XmlConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

//
@SpringBootApplication
public class App {
    public static void main(String[] args) {

        SpringApplication.run(App.class, args);
    }
}

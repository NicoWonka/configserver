package cl.apiservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
@EnableConfigServer
public class ConfigApplication{
	
	public static void main(String[] args){
		SpringApplication.run(ConfigApplication.class, args);
	}
}
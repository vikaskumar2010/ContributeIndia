package com.contribute.india.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan({"com.contribute.india"})
public class App {
	private static String DEFAULT_CONF_DIR = "/home/vikas/Documents/ContributeIndia";
    public static void main(String[] args) {
    	
    	if(System.getProperty("CONF_DIR") == null){
    		System.out.println("CONG_DIR is not set. Falling back to "+DEFAULT_CONF_DIR);
    		System.setProperty("CONF_DIR", DEFAULT_CONF_DIR);
    	}
    	
        SpringApplication.run(App.class, args);
    }

}

package com.raj.dev;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyWebApplicationLisnter
 *
 */
@WebListener
public class MyWebApplicationLisnter implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MyWebApplicationLisnter() {
        // TODO Auto-generated constructor stub
    }
	
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContext Initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext Destroyed");
    }
}

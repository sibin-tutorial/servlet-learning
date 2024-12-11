package com.raj.dev;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MySessionListnre
 *
 */
@WebListener
public class MySessionListnre implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public MySessionListnre() {
        // TODO Auto-generated constructor stub
    }
	
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Session Created: " + se.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Session Destroyed: " + se.getSession().getId());
    }
}

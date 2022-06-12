package com.example;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent event) {

        ServletContext servletContext = event.getServletContext();

        String dogBreed = servletContext.getInitParameter("breed");
        Dog dog = new Dog(dogBreed);
        servletContext.setAttribute("dog", dog);
    }

    public void contextDestroyed(ServletContextEvent event) {}

}

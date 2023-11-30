/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajoPracticoIntegrador.gestionDeOrdenes.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author sebas
 */
public class SessionFactoryProvider {
     public static SessionFactory provideSessionFactory() 
    { 
        Configuration config=new Configuration(); 
        config.configure(); 
        return config.buildSessionFactory(); 
    } 
}

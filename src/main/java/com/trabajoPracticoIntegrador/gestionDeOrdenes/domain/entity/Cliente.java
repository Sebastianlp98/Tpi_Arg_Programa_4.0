package com.trabajoPracticoIntegrador.gestionDeOrdenes.domain.entity;

import jakarta.persistence.*;

import java.util.List;

    @Entity
    public class Cliente {
    @Id    
    private Long id;
    @Column(name = " dni")
    private String dni;
    @Column(name="nombre")
    private String nombre;
    @Column(name="direccion")
    private String direccion;
    @Column(name="mail")
    private String mail;
    
    @OneToMany(mappedBy ="cliente")
    private List<Orden> orden; 
    
    public Cliente(){}

    public Cliente(Long id, String dni, String nombre, String direccion, String mail, List<Orden> orden) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.mail = mail;
        this.orden = orden;
    }

    public List<Orden> getOrden() {
        return orden;
    }

    public void setOrden(List<Orden> orden) {
        this.orden = orden;
    }

   
    
    public void setId(Long id){
    this.id = id;
    }
    
    public Long getId(){
    return this.id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
}

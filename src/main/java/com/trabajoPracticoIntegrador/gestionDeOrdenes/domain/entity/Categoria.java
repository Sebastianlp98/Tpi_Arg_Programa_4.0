package com.trabajoPracticoIntegrador.gestionDeOrdenes.domain.entity;

import jakarta.persistence.*;

import java.util.List;



    @Entity
    public class Categoria {
    @Id
    private Long idCategoria;
    @Column(name = "descripcionCategoria")
    private String descripcionCategoria;
    
    @OneToMany(mappedBy = "categoria")
    private List<Orden> orden;

    public Categoria(Long idCategoria, String descripcionCategoria) {
    this.idCategoria = idCategoria;
    this.descripcionCategoria = descripcionCategoria;
    }
        
    public Categoria(){}

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }
        
        
}


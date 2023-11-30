package com.trabajoPracticoIntegrador.gestionDeOrdenes.domain.entity;
    
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;



    @Entity
    public class Tecnico {
    @Id 
    private Long idTecnico;
    @Column(name = "nombreApellido")
    private String nombreApellido;

    public Tecnico(Long idTecnico, String nombreApellido) {
        this.idTecnico = idTecnico;
        this.nombreApellido = nombreApellido;
    }

        public Tecnico() {

        }

        public Long getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(Long idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }
    
}



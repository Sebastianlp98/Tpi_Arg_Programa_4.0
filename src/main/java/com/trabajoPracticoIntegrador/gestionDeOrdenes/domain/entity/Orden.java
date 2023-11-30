package com.trabajoPracticoIntegrador.gestionDeOrdenes.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.trabajoPracticoIntegrador.gestionDeOrdenes.exception.InvalidClientException;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Date;


@Entity
public class Orden {
    @Id
    private Long idOrden;
    @Column(name="descripcionOrden")
    private String descripcionOrden;
    @Column(name="costo")
    private double costo;
    @Column(name="fechaOrden")
    private Date fechaOrden;
    @Column(name="estado")
    private String estado;
    @ManyToOne
    @JoinColumn(name = "id")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private Categoria categoria;
    
    @ManyToOne
    @JoinColumn(name = "idTecnico")
    private Tecnico tecnico;

    public Orden(Long idOrden, String descripcionOrden, double costo, Date fechaOrden, String estado,
                 Cliente cliente, Categoria categoria, Tecnico tecnico) {
        
        if(cliente.getDni() != null || !cliente.getDni().equals("") ){
        this.idOrden = idOrden;
        this.descripcionOrden = descripcionOrden;
        this.costo = costo;
        this.fechaOrden = fechaOrden;
        this.estado = estado;
        this.cliente = cliente;
        this.categoria = categoria;
        this.tecnico = tecnico;
        }else{
        throw new InvalidClientException("El dni no puede ser vacio o nulo");
        }
        
      
    }

    public Long getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Long idOrden) {
        this.idOrden = idOrden;
    }

    public String getDescripcionOrden() {
        return descripcionOrden;
    }

    public void setDescripcionOrden(String descripcionOrden) {
        this.descripcionOrden = descripcionOrden;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
    
    
    
    
    
    
    
}


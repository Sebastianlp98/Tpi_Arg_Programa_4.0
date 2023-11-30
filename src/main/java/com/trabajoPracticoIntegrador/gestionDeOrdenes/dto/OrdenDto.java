package com.trabajoPracticoIntegrador.gestionDeOrdenes.dto;

import java.util.Date;

public class OrdenDto {

    private String nombreCliente;

    private String nombreTecnico;

    private Date fechaOrden;

    private String categoria;

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreTecnico() {
        return nombreTecnico;
    }

    public void setNombreTecnico(String nombreTecnico) {
        this.nombreTecnico = nombreTecnico;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public OrdenDto(String nombreCliente, String nombreTecnico, Date fechaOrden, String categoria) {
        this.nombreCliente = nombreCliente;
        this.nombreTecnico = nombreTecnico;
        this.fechaOrden = fechaOrden;
        this.categoria = categoria;
    }


}

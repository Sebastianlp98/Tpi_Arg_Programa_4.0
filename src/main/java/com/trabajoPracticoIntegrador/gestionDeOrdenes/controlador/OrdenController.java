package com.trabajoPracticoIntegrador.gestionDeOrdenes.controlador;

import com.trabajoPracticoIntegrador.gestionDeOrdenes.domain.entity.Orden;
import com.trabajoPracticoIntegrador.gestionDeOrdenes.domain.repositorio.OrdenRepository;
import com.trabajoPracticoIntegrador.gestionDeOrdenes.domain.service.OrdenService;
import com.trabajoPracticoIntegrador.gestionDeOrdenes.dto.OrdenDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/orden")
@CrossOrigin(origins = "*")
public class OrdenController {

    @Autowired
    private OrdenService service;

    @PostMapping("/date")
    ResponseEntity<List<OrdenDto>> getByDate(@RequestBody Map<String, String> date){
        String fechaStr = date.get("fecha");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = new Date();

        try {
           fecha  = dateFormat.parse(String.valueOf(fechaStr));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return new ResponseEntity<>(service.processDto(fecha), HttpStatus.OK);
    }

}

package com.trabajoPracticoIntegrador.gestionDeOrdenes.domain.service;

import com.trabajoPracticoIntegrador.gestionDeOrdenes.domain.repositorio.OrdenRepository;
import com.trabajoPracticoIntegrador.gestionDeOrdenes.dto.OrdenDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrdenService {

    @Autowired
    private OrdenRepository ordenRepository;

    public List<OrdenDto> processDto(Date fecha){
        List<Object[]> ordenListObject = ordenRepository.findByFecha(fecha);
        List<OrdenDto> ordenDtoList = new ArrayList<>();
        for(Object[] objectArray : ordenListObject ) {
            ordenDtoList.add(new OrdenDto((String)objectArray[8],(String)objectArray[10],(Date) objectArray[6],(String)objectArray[9]));
        }
        return ordenDtoList;
    }

}

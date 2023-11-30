package com.trabajoPracticoIntegrador.gestionDeOrdenes.domain.repositorio;

import com.trabajoPracticoIntegrador.gestionDeOrdenes.config.SessionFactoryProvider;
import com.trabajoPracticoIntegrador.gestionDeOrdenes.domain.entity.Categoria;
import com.trabajoPracticoIntegrador.gestionDeOrdenes.domain.entity.Orden;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
@Repository
public class OrdenRepository {

    @Transactional
    public List<Object[]> findByFecha(Date fecha) {
        SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
        List<Object[]> listaDeOrdenes = null;
        String sql = "SELECT " +
                "c.id," +
                "t.idTecnico,"+
                "cat.idCategoria," +
                "o.idOrden, " +
                "o.descripcionOrden, " +
                "o.costo, " +
                "o.fechaOrden, " +
                "o.estado, " +
                "c.nombre as nombreCliente, " +
                "cat.descripcionCategoria," +
                "t.nombreApellido as nombreTecnico " +
                "FROM Orden o " +
                "JOIN Cliente c ON o.id = c.id " +
                "JOIN Tecnico t ON o.idTecnico = t.idTecnico " +
                "JOIN Categoria cat ON o.idCategoria = cat.idCategoria " +
                "WHERE o.fechaOrden = :fecha";  // Tu consulta aquí

        try (Session session = sessionFactory.openSession()) {
            listaDeOrdenes = session.createNativeQuery(sql)
                    .setParameter("fecha", fecha)
                    .getResultList();
        } catch (Exception ex) {
            Logger.getLogger(OrdenRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaDeOrdenes;
    }
}

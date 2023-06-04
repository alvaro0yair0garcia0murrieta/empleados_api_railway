package com.aeropuerto.empleados;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositorio extends CrudRepository<Empleado,Integer> {
    Empleado findByNombre(String nombre);
}
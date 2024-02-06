package com.despliegue.dokerdb.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatosDao extends JpaRepository<Datos, Long> {
}

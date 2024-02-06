package com.despliegue.dokerdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    DatosDao datosDao;

    @GetMapping("")
    public List<Datos> getAll() {
        return this.datosDao.findAll();
    }

}

package com.database.test.memorydatabase.controller;

import com.database.test.memorydatabase.model.Sucursal;
import com.database.test.memorydatabase.service.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class SucursalController {

    @Autowired
    private SucursalService sucursalService;

    @PostMapping("crear")
    public Sucursal createUser(@RequestBody Sucursal sucursal){

        Sucursal newSucursal = sucursalService.CreateSucursal(sucursal);
        return newSucursal;
    }

    @GetMapping("obtenerTodos")
    public List<Sucursal> getAll(){
        List<Sucursal> sucursalList = sucursalService.GetAllSucursal();
        return sucursalList;
    }

    @GetMapping("obtenerSucursal")
    public Sucursal getSucursal(Integer id){
        Sucursal sucursal = sucursalService.GetSucursalById(id);
        return sucursal;
    }

    @DeleteMapping("Eliminar")
    public String deleteSucursal(Integer id){
        sucursalService.deleteSucursal(id);
        return "OK";
    }

}

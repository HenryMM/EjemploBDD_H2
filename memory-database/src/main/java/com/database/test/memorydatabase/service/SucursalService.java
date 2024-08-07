package com.database.test.memorydatabase.service;

import com.database.test.memorydatabase.model.Sucursal;
import com.database.test.memorydatabase.repository.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class SucursalService {
    @Autowired
    private SucursalRepository sucursalRepository;

    public Sucursal CreateSucursal(Sucursal sucursal){

        return sucursalRepository.save(sucursal);
    }

    public Sucursal GetSucursalById(Integer id){


        Optional<Sucursal> optionalSucursal = sucursalRepository.findById(id);
        return optionalSucursal.get();
    }

    public List<Sucursal> GetAllSucursal(){

        return sucursalRepository.findAll();
    }

    public void deleteSucursal(Integer id){

        sucursalRepository.deleteById(id);
    }
}

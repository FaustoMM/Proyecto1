package com.example.demo.service;

import com.example.demo.model.Producto;
import com.example.demo.repository.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service 
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    //Obtine todos los productos verdaderos por estado
    public List<Producto> getAllProductos() {
        return productoRepository.findByEstadoTrue();
    }
    
    //Trae-obtiene un solo producto por su id
    public Producto getAProductoById (Integer id) {
        if(id == null) {
            throw new IllegalArgumentException("El ID NO puede ser nulo.");
        }
        return productoRepository.findById(id).orElse(null);
    }



}

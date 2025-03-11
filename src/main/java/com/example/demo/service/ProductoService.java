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
     //Crea Producto
     public void createProducto(Producto producto) {
            if (producto == null) {
                throw new IllegalArgumentException("El Producto no puede ser nulo");
            }
            productoRepository.save(producto);
        }

        //ACTUALIZAR PRODUCTO
        //void crea un espacio en blanco para recibir informacion
        public void updateProducto(Producto producto) {
            if(producto == null || producto.getId() == null ) {
                throw new IllegalArgumentException("El Producto o el ID no pueden ser nulos");
            }
            if (!productoRepository.existsById(producto.getId())) {
                throw new IllegalArgumentException("Producto con el ID " + producto.getId() + " No Encontrado" );
            }
            productoRepository.save(producto);
        }

        //SET SE USA PARA ACTUALIZAR-MODIFICAR EL DATO 
        //Eliminar producto
        public Producto deleteProducto (Integer id) {
            if (id == null) {
                throw new IllegalArgumentException("El ID NO PUEDE SER NULO.");
            }
            Producto producto = productoRepository.findById(id).orElse(null);
            if (producto != null) {
                producto.setEstado(false);
                return productoRepository.save(producto);
            }
            return null;
        }

}

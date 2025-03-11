package com.example.demo.service;

import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service 
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    //Obtine todos los clientes verdaderos por estado
    public List<Cliente> getAllClientes() { //al ser publico puede ser llamado por cualquier otra clase 
        return clienteRepository.findByEstadoTrue();
    }
    
    //Trae-obtiene un solo cliente por su id
    public Cliente getAClienteById (Integer id) {
        if(id == null) {
            throw new IllegalArgumentException("El ID NO puede ser nulo.");
        }
        return clienteRepository.findById(id).orElse(null);
    } 

     //Crea Cliente
     public void createCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("El Cliente no puede ser nulo");
        }
        clienteRepository.save(cliente);
    }

    //ACTUALIZAR Cliente
    //void crea un espacio en blanco para recibir informacion
    public void updateCliente(Cliente cliente) {
        if(cliente == null || cliente.getDni() == null ) {
            throw new IllegalArgumentException("El Cliente o el ID no pueden ser nulos");
        }
        if (!clienteRepository.existsById(cliente.getDni())) {
            throw new IllegalArgumentException("Cliente con el ID " + cliente.getDni() + " No Encontrado" );
        }
        clienteRepository.save(cliente);
    }

    //SET SE USA PARA ACTUALIZAR-MODIFICAR EL DATO 
    //Eliminar Cliente
    public Cliente deleteCliente (Integer dni) {
        if (dni == null) {
            throw new IllegalArgumentException("El ID NO PUEDE SER NULO.");
        }
        Cliente cliente = clienteRepository.findById(dni).orElse(null);
        if (cliente != null) {
            cliente.setEstado(false);
            return clienteRepository.save(cliente);
        }
        return null;
    }




}
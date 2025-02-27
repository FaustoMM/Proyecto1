package com.example.demo.model;


import jakarta.persistence;

@Entity
public class Producto { //crea tabla mysql y puede cumplir otras funciones como eliminar, defin los tipos de datos de los atributos//parametros
   @Id 
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nombre;

    @Column
    private String marca;

    @Column
    private String tipo;

    @Column
    private double precio;

    @Column
    private Integer cantidad; 

    @Column
    private boolean estado = true;


    public Producto(){

    }

    public Producto(Integer id, String nombre, String marca, String tipo, double precio, Integer cantidad, boolean estado){
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.estado = estado;
    }
    
    //getters and setters
 public Integer getId(){
    return id;
 }

 public void setId(Integer id){
    this.id = id;
 }

 public String getNombre(){
    return nombre;
 }

 public void setNombre(String nombre){
    this.nombre = nombre;
 }

 public String getMarca(){
    return marca;
 }

 public void setMarca(String marca){
    this.marca = marca;
 }

 public String getTipo(){
    return tipo;
 }

 public void setTipo(String tipo){
    this.tipo = tipo;
 }

 public double getPrecio(){
    return precio;
 }

 public void setPrecio(double precio){
    this.precio = precio;
 }

 public Integer getCantidad(){
    return cantidad;
 }

 public void setCantidad(Integer cantidad){
    this.cantidad = cantidad;
 }

 public boolean getEstado(){
    return estado;
 }

 public void setEstado(boolean estado){
    this.estado = estado;
 }


 
}

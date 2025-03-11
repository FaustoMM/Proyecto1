package com.example.demo.model;

import jakarta.persistence.*;
// Import java.time.LocalDate;

@Entity
public class Cliente {
   @Id 
   @GeneratedValue(strategy = GenerationType.IDENTITY) //en esta linea se generan el id automaticamente
    private Integer dni; 

    @Column
    private String nombre; 

    @Column
    private String apellido;

    @Column
    private Integer edad; 

    @Column
    private Integer fechadeNacimiento;
    
    @Column
    private String correo;

    @Column
    private Integer codigodeArea;

    @Column
    private Integer telefono; 

    @Column
    private String intereses;

    @Column
    private Integer comprasRealizadas;

    @Column
    private boolean estado = true;


    public Cliente(){

    }

    public Cliente(Integer dni, String nombre, String apellido, Integer edad, Integer fechadeNacimiento, String correo, Integer codigodeArea, Integer telefono, String intereses, Integer comprasRealizadas, boolean estado ){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechadeNacimiento = fechadeNacimiento;
        this.correo = correo;
        this.codigodeArea = codigodeArea;
        this.telefono = telefono;
        this.intereses = intereses;
        this.comprasRealizadas = comprasRealizadas;
        this.estado = estado;
    }
    
    //getters and setters
 public Integer getDni(){
    return dni;
 }

 public void setDni(Integer dni){
    this.dni = dni;
 }

 public String getNombre(){
    return nombre;
 }

 public void setNombre(String nombre){
    this.nombre = nombre;
 }

 public String getApellido(){
    return apellido;
 }

 public void setApellido(String apellido){
    this.apellido = apellido;
 }

 public Integer getEdad(){
    return edad;
 }

 public void setEdad(Integer edad){
    this.edad = edad;
 }

 public Integer getFechadeNacimiento(){
    return fechadeNacimiento;
 }

 public void setFechadeNacimiento(Integer fechadeNacimiento){
    this.fechadeNacimiento = fechadeNacimiento;
 }

 public String getCorreo(){
    return correo;
 }

 public void setCorreo(String correo){
    this.correo = correo;
 }

 public Integer getCodigoArea(){
    return codigodeArea;
 }

 public void setCodigoArea(Integer codigodeArea){
    this.codigodeArea = codigodeArea;
 }

 public Integer getTelefono(){
    return telefono;
 }

 public void setTelefono(Integer telefono){
    this.telefono = telefono;
 }

 public String getIntereses(){
    return intereses;
 }

 public void setIntereses(String intereses){
    this.intereses = intereses;
 }

 public Integer getComprasRealizadas(){
    return comprasRealizadas;
 }

 public void setComprasRealizadas(Integer comprasRealizadas){
    this.comprasRealizadas = comprasRealizadas;
 }

 public boolean getEstado(){
    return estado;
 }

 public void setEstado(boolean estado){
    this.estado = estado;
 }

}

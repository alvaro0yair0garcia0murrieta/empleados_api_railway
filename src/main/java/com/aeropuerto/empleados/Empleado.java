package com.aeropuerto.empleados;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Empleado{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nombre;
    private  String correo;
    private  String numeroTelefonico;
    private String departamento;
    private String puesto;

    public Empleado(){}

    public Empleado(String nombre, String correo, String numeroTelefonico, String departamento, String puesto) {
        
        this.nombre = nombre;
        this.correo = correo;
        this.numeroTelefonico = numeroTelefonico;
        this.departamento = departamento;
        this.puesto = puesto;
    }
   
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }
    public void setNumeroTelefonico(String numeroTefonico) {
        this.numeroTelefonico = numeroTefonico;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String depatamento) {
        this.departamento = depatamento;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public Integer getId() {
        return id;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.cajero;


public class Cliente {
    
    String Nombre;
    String Apellido;
    String Email;
    String FechaNacimiento;
    String Usuario;
    String clave;

    public Cliente(String Nombre, String Apellido, String Email, String FechaNacimiento, String Usuario, String clave) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.FechaNacimiento = FechaNacimiento;
        this.Usuario = Usuario;
        this.clave = clave;
    }

    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
 
    // Se crea para luego poder mostrar todo en un ArrayList
    @Override
    public String toString() {
        return "Cliente{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Email=" + Email + ", FechaNacimiento=" + FechaNacimiento + ", Usuario=" + Usuario + ", clave=" + clave + '}';
    }
    
}

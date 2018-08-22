package com.example.bautista.prueba_listar;

import java.io.Serializable;

public class Entidades implements Serializable{

    private String Documento;
    private String Nombre;
    private String Apellidos;
    private String Fecha_Nacimiento;
    private String Foto;
    private String Sueldo;
    private Double DirLat;
    private Double DirLng;
    private String Email;
    private String Telefono;

    public Entidades() {

    }

    public Entidades(String documento, String nombre, String apellidos, String fecha_Nacimiento, String foto, String sueldo, Double dirLat, Double dirLng, String email, String telefono) {
        Documento = documento;
        Nombre = nombre;
        Apellidos = apellidos;
        Fecha_Nacimiento = fecha_Nacimiento;
        Foto = foto;
        Sueldo = sueldo;
        DirLat = dirLat;
        DirLng = dirLng;
        Email = email;
        Telefono = telefono;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String documento) {
        Documento = documento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String fecha_Nacimiento) {
        Fecha_Nacimiento = fecha_Nacimiento;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String foto) {
        Foto = foto;
    }

    public String getSueldo() {
        return Sueldo;
    }

    public void setSueldo(String sueldo) {
        Sueldo = sueldo;
    }

    public Double getDirLat() {
        return DirLat;
    }

    public void setDirLat(Double dirLat) {
        DirLat = dirLat;
    }

    public Double getDirLng() {
        return DirLng;
    }

    public void setDirLng(Double dirLng) {
        DirLng = dirLng;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
}

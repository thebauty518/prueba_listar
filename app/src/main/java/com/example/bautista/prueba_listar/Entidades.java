package com.example.bautista.prueba_listar;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

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
    long uno;
    public Entidades() {

    }


   public long mtdRegistrar(Context context){
       clOpenHelper base = new clOpenHelper(context,"bdListar",null,1);
       SQLiteDatabase datos=base.getWritableDatabase();
        try {

            ContentValues values = new ContentValues();
            values.put("Documento",Documento);
            values.put("Nombres", Nombre);
            values.put("Apellidos", Apellidos);
            values.put("FechaNacimiento", Fecha_Nacimiento);
            values.put("Sueldo", Sueldo);
            values.put("Foto", "uno");
            values.put("DirLat", DirLat);
            values.put("DirLng", DirLng);
            values.put("Email", Email);
            values.put("Telefono", Telefono);
            uno= datos.insert("tblEmpleado",null,values);


        }catch (Exception e){
              Toast.makeText(context, ""+uno, Toast.LENGTH_SHORT).show();

        }


        return uno;
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

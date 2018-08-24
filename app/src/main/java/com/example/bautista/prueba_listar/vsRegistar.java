package com.example.bautista.prueba_listar;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class vsRegistar extends AppCompatActivity {
    EditText Documento, Nombre, Apellidos, FeNacimiento, Sueldo, DirLat, DirLng, Telefono, Email;
    Button registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vs_registar);
        Documento = findViewById(R.id.txtDocumento);
        Nombre = findViewById(R.id.txtNombre);
        Apellidos = findViewById(R.id.txtApellidos);
        FeNacimiento = findViewById(R.id.txtFechaNacimiento);
        Sueldo = findViewById(R.id.txtSueldo);
        DirLat = findViewById(R.id.txtDireccionLat);
        DirLng = findViewById(R.id.txtDireccionLng);
        Telefono = findViewById(R.id.txtTelefono);
        Email = findViewById(R.id.txtEmail);
        registro = findViewById(R.id.Regsitrar);

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Entidades entidades = new Entidades();
                entidades.setDocumento(Documento.getText().toString());
                entidades.setApellidos(Apellidos.getText().toString());
                entidades.setNombre(Nombre.getText().toString());
                entidades.setFecha_Nacimiento(FeNacimiento.getText().toString());
                entidades.setSueldo(Sueldo.getText().toString());
                entidades.setDirLat(Double.valueOf(DirLat.getText().toString()));
                entidades.setDirLng(Double.valueOf(DirLng.getText().toString()));
                entidades.setEmail(Email.getText().toString());
                entidades.setTelefono(Telefono.getText().toString());
                Long uno = entidades.mtdRegistrar(vsRegistar.this);
                if (uno>0){
                    Toast.makeText(vsRegistar.this, "Registrado con Exito"+uno, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(vsRegistar.this, vsLista.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(vsRegistar.this, "Registro fallido", Toast.LENGTH_SHORT).show();

                }




            }
        });
    }


}

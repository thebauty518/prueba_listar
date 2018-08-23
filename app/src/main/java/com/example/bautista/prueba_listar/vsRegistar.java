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
    EditText Documento,Nombre,Apellidos,FeNacimiento,Sueldo,DirLat,DirLng,Telefono,Email;
    Button registro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vs_registar);
        Documento= findViewById(R.id.txtDocumento);
        Nombre= findViewById(R.id.txtNombre);
        Apellidos= findViewById(R.id.txtApellidos);
        FeNacimiento =findViewById(R.id.txtFechaNacimiento);
        Sueldo= findViewById(R.id.txtSueldo);
        DirLat=findViewById(R.id.txtDireccionLat);
        DirLng=findViewById(R.id.txtDireccionLng);
        Telefono=findViewById(R.id.txtTelefono);
        Email=findViewById(R.id.txtEmail);
        registro=findViewById(R.id.Regsitrar);

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clOpenHelper base = new clOpenHelper(vsRegistar.this,"bdListar",null,1);
                SQLiteDatabase Datos =base.getWritableDatabase();
                String documento= Documento.getText().toString();
                String nombre = Nombre.getText().toString();
                String apellido = Apellidos.getText().toString();
                String fecha = FeNacimiento.getText().toString();
                String sueldo = Sueldo.getText().toString();
                String dirlat = DirLat.getText().toString();
                String dirLng = DirLng.getText().toString();
                String email= Email.getText().toString();
                String telefono= Telefono.getText().toString();
                ContentValues values = new ContentValues();
                values.put("Documento",documento);
                values.put("Nombres",nombre);
                values.put("Apellidos",apellido);
                values.put("FechaNacimiento",fecha);
                values.put("Sueldo",sueldo);
                values.put("Foto","uno");
                values.put("DirLat",dirlat);
                values.put("DirLng",dirLng);
                values.put("Email",email);
                values.put("Telefono",telefono);
                Datos.insert("tblEmpleado",null,values);

                Toast.makeText(vsRegistar.this, "Registrado con Exito", Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(vsRegistar.this, vsLista.class);
                startActivity(intent);

            }
        });
    }



}

package com.example.bautista.prueba_listar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class vsInformacion extends AppCompatActivity {

    TextView lbDocumento, lbNombre, lbApellido, lbFnacimiento, lbSueldo, lbEmail, lbTefono;
    ImageView imgFoto, imgMapa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vs_informacion);





        imgFoto=(ImageView)findViewById(R.id.imgFoto);
        lbDocumento=(TextView)findViewById(R.id.lbDocumentos);
        lbNombre=(TextView)findViewById(R.id.lbNombre);
        lbApellido=(TextView)findViewById(R.id.lbApellidos);
        lbFnacimiento=(TextView)findViewById(R.id.lbFechaNacimiento);
        lbSueldo=(TextView)findViewById(R.id.lbSueldo);
        lbEmail=(TextView)findViewById(R.id.lbEmail);
        lbTefono=(TextView)findViewById(R.id.lbTelefono);
        imgMapa=(ImageView)findViewById(R.id.imgMapa);
        imgMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(vsInformacion.this, Mapa.class);
                Bundle objeto= getIntent().getExtras();
                Entidades entidades = null;
                entidades=(Entidades) objeto.getSerializable("entidad");
                String DirLat = entidades.getDirLat().toString();
                String DirLng = entidades.getDirLng().toString();
              //  String Direccion[]  ={DirLat, DirLng};
                String Direccion[] = {"hola"," mundo"};
                intent.putExtra("d",Direccion);
                startActivity(intent);
            }
        });

        Bundle objeto= getIntent().getExtras();
        Entidades entidades = null;

        if (objeto != null){
            entidades=(Entidades) objeto.getSerializable("entidad");
            lbDocumento.setText(entidades.getDocumento().toString());
            lbNombre.setText(entidades.getNombre().toString());
            lbApellido.setText(entidades.getApellidos().toString());
            lbFnacimiento.setText(entidades.getApellidos().toString());
            lbSueldo.setText(entidades.getSueldo().toString());
            lbEmail.setText(entidades.getEmail().toString());
            lbTefono.setText(entidades.getTelefono().toString());







        }



    }


}

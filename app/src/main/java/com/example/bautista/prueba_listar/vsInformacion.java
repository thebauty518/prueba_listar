package com.example.bautista.prueba_listar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class vsInformacion extends AppCompatActivity {

    TextView lbDocumento, lbNombre, lbApellido, lbFnacimiento, lbSueldo, lbEmail, lbTefono;
    ImageView imgFoto;

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

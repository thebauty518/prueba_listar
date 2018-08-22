package com.example.bautista.prueba_listar;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class vsLista extends AppCompatActivity {

    ListView lvLista ;

    ArrayList<String> Informacion;

    ArrayList<Entidades> ListaUsuario;
    clOpenHelper Admin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vs_lista);

        lvLista=(ListView)findViewById(R.id.lvlista);
        Admin = new clOpenHelper(getApplicationContext(),"bdListar", null, 1);

        ConsultarListar();
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Informacion);
        lvLista.setAdapter(adapter);



    }

    private void ConsultarListar() {

        SQLiteDatabase dbSql =  Admin.getReadableDatabase();
        Entidades entidades = null;
        ListaUsuario = new ArrayList<Entidades>();
        Cursor cursor = dbSql.rawQuery("select * from tblEmpleado", null);

        while (cursor.moveToNext()){
            entidades = new Entidades();

           // entidades.setDocumento(cursor.getString(0));
            entidades.setDocumento(cursor.getString(1));
            entidades.setNombre(cursor.getString(2));
            entidades.setApellidos(cursor.getString(3));
            entidades.setFecha_Nacimiento(cursor.getString(4));
            entidades.setFoto(cursor.getString(5));
            entidades.setSueldo(cursor.getString(6));
            entidades.setDirLat(cursor.getDouble(7));
            entidades.setDirLng(cursor.getDouble(8));
            entidades.setEmail(cursor.getString(9));
            entidades.setTelefono(cursor.getString(10));

            ListaUsuario.add(entidades);


            obtenerLista();

        }

    }

    private void obtenerLista() {
        Informacion = new ArrayList<String>();
        for (int i=0; i<ListaUsuario.size(); i++){
            Informacion.add("\n"+"Nombres: "+ListaUsuario.get(i).getNombre()+"\n"
            +"Apellidos: "+ListaUsuario.get(i).getApellidos()+"\n"
            +"Email: "+ListaUsuario.get(i).getEmail());
        }


    }


}

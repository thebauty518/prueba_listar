package com.example.bautista.prueba_listar;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class clOpenHelper extends SQLiteOpenHelper{
    public clOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE tblEmpleado (\n" +
                "    idEmpleado      INTEGER      PRIMARY KEY AUTOINCREMENT,\n" +
                "    Documento       VARCHAR (30),\n" +
                "    Nombres         VARCHAR (30),\n" +
                "    Apellidos       VARCHAR (30),\n" +
                "    FechaNacimiento DATE,\n" +
                "    Foto            VARCHAR (30),\n" +
                "    Sueldo          REAL,\n" +
                "    DirLat          DOUBLE,\n" +
                "    DirLng          DOUBLE,\n" +
                "    Email           VARCHAR (30),\n" +
                "    Telefono        VARCHAR (30) \n" +
                ");");
                //5.720242, -72.928679
        sqLiteDatabase.execSQL("Insert Into tblEmpleado (Documento, Nombres, Apellidos, FechaNacimiento,"
                + "Foto, Sueldo,DirLat,DirLng, Email, Telefono)values('1234567890','John Alexander', 'Bautista Balaguera'," +
                " '9/may/1999', 'foto1', '870.000', '5.720242', '-72.928679', 'Jabautista065@misena.edu.co', '3209332147')," +
            "('1234567891','John Alexander', 'Bautista Balaguera'," +
                 " '9/may/1999', 'foto1', '870.000', '5.720242', '-72.928679', 'Jabautista065@misena.edu.co', '3209332147'),"+
            "('1234567892','John Alexander', 'Bautista Balaguera'," +
                " '9/may/1999', 'foto1', '870.000', '5.720242', '-72.928679', 'Jabautista065@misena.edu.co', '3209332147')");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

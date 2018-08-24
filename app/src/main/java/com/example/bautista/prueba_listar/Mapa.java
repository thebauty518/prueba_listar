package com.example.bautista.prueba_listar;

import android.content.ContentResolver;
import android.content.Intent;
import android.provider.Settings;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class Mapa extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    //String entidades[]= getIntent().getStringArrayExtra("d");
    String[] entidades= getIntent().getStringArrayExtra("d");
    //Double lat= Double.valueOf(entidades[0]);
    String lat= entidades[0];


    Double lng= Double.valueOf(entidades[1]);
    Double lati=5.729212;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

/*
        try {
            int gps= Settings.Secure.getInt(getApplication().getContentResolver(), Settings.Secure.LOCATION_MODE);
                if (gps == 0){
                    Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                    startActivity(intent);
                }

        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
        }*/
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;





        // Add a marker in Sogamoso and move the camera
        LatLng sogamoso = new LatLng(5.729212, -72.729212);
        mMap.addMarker(new MarkerOptions().position(sogamoso).title("Sogamoso"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sogamoso));

        Toast.makeText(this, lat+", "+lng , Toast.LENGTH_SHORT).show();



    }

}

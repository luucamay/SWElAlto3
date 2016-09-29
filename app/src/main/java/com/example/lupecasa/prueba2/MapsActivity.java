package com.example.lupecasa.prueba2;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
        mMap.getUiSettings().setMyLocationButtonEnabled(true);
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
        } else {

        }

     /*   Drawable circle = getResources().getDrawable(R.drawable.icono_bus);
        Canvas canvas = new Canvas();
        Bitmap bitmap = Bitmap.createBitmap(circle.getIntrinsicWidth(), circle.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        canvas.setBitmap(bitmap);
        circle.setBounds(0, 0, circle.getIntrinsicWidth(), circle.getIntrinsicHeight());
        circle.draw(canvas);
        BitmapDescriptor bd = BitmapDescriptorFactory.fromBitmap(bitmap);*/
        // Add a marker in some potition and move the camera
        LatLng waynabus1 = new LatLng(-16.508587, -68.166488);
        mMap.addMarker(new MarkerOptions().position(waynabus1).title("Bus en 10 min") .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus4)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(waynabus1));
        LatLng waynabus2 = new LatLng(-16.510414, -68.168586);
        mMap.addMarker(new MarkerOptions().position(waynabus2).title("Bus en 15 min") .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus4)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(waynabus2));
        LatLng waynabus3 = new LatLng(-16.509210, -68.170474);
        mMap.addMarker(new MarkerOptions().position(waynabus3).title("Bus en 20 min") .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus4)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(waynabus3));
        LatLng waynabus4 = new LatLng(-16.508154, -68.159986);
        mMap.addMarker(new MarkerOptions().position(waynabus4).title("Bus en 25 min") .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus4)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(waynabus4));
        LatLng waynabus5 = new LatLng(-16.506122, -68.159838);
        mMap.addMarker(new MarkerOptions().position(waynabus5).title("Bus en 30 min")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus4)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(waynabus5));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15));

    }

}

package com.example.maplocation;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.maplocation.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    LatLng qutubminar = new LatLng(28.524462141265165,77.18585138639969 );
    LatLng hauzkhas = new LatLng(28.547802688243017, 77.2033807969614);
    LatLng cannauhgt = new LatLng(28.632630841230984, 77.21949261448285);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
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

        mMap.addMarker(new MarkerOptions().position(qutubminar).title("Marker in Delhi"));
       /* mMap.addCircle(new CircleOptions()).getTag();*/
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(qutubminar, 16));
    /*    mMap.addPolyline((new PolylineOptions()).add(qutubminar, hauzkhas, cannauhgt).
                // below line is use to specify the width of poly line.
                        width(5)
                // below line is use to add color to our poly line.
                .color(Color.BLUE)
                // below line is to make our poly line geodesic.
                .geodesic(true));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(qutubminar, 10));*/
       /* mMap.addPolyline(new PolylineOptions().add());
        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(28.669155, 77.453758);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Ghaziabad"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));*/
    }
}
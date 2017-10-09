package com.mapboundaryview;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    Circle myCircle1;
    Circle myCircle2;
    Circle myCircle3;
    Circle myCircle4;
    Circle myCircle5;
    Circle myCircle6;

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

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(11.004556, 76.961632);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker"));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        // Add a marker in Sydney and move the camera
        CameraPosition INIT =
                new CameraPosition.Builder()
                        .target(sydney)
                        .zoom(21f)
                        .build();

        // use map to move camera into position
        mMap.moveCamera(CameraUpdateFactory.newCameraPosition(INIT));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sydney, 12.0f));
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        addingCircleView(sydney);
    }


    /**
     * Method to toggle periodic location updates
     */
    private void addingCircleView(LatLng mLatLng) {
        CircleOptions circleOptions = new CircleOptions()
                .center(mLatLng)   //set center
                .radius(10)   //set radius in meters
                .fillColor(Color.parseColor("#1AFB2323"))  //default
                .strokeColor(Color.parseColor("#1AFB2323"))
                .strokeWidth(1);
        myCircle1 = mMap.addCircle(circleOptions);
        circleOptions = new CircleOptions()
                .center(mLatLng)   //set center
                .radius(8)   //set radius in meters
                .fillColor(Color.parseColor("#40FB2323"))  //default
                .strokeColor(Color.parseColor("#40FB2323"))
                .strokeWidth(1);
        myCircle2 = mMap.addCircle(circleOptions);
        circleOptions = new CircleOptions()
                .center(mLatLng)   //set center
                .radius(6)   //set radius in meters
                .fillColor(Color.parseColor("#66FB2323"))  //default
                .strokeColor(Color.parseColor("#66FB2323"))
                .strokeWidth(1);
        myCircle3 = mMap.addCircle(circleOptions);
        circleOptions = new CircleOptions()
                .center(mLatLng)   //set center
                .radius(4)   //set radius in meters
                .fillColor(Color.parseColor("#8CFB2323"))  //default
                .strokeColor(Color.parseColor("#8CFB2323"))
                .strokeWidth(1);
        myCircle4 = mMap.addCircle(circleOptions);
        circleOptions = new CircleOptions()
                .center(mLatLng)   //set center
                .radius(2)   //set radius in meters
                .fillColor(Color.parseColor("#A6FB2323"))  //default
                .strokeColor(Color.parseColor("#A6FB2323"))
                .strokeWidth(1);
        myCircle5 = mMap.addCircle(circleOptions);

        circleOptions = new CircleOptions()
                .center(mLatLng)   //set center
                .radius(1)   //set radius in meters
                .fillColor(Color.parseColor("#CCFB2323"))  //default
                .strokeColor(Color.parseColor("#CCFB2323"))
                .strokeWidth(1);
        myCircle6 = mMap.addCircle(circleOptions);
    }
}

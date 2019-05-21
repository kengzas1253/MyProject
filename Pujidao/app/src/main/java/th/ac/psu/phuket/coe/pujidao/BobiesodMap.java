package th.ac.psu.phuket.coe.pujidao;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class BobiesodMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bobiesod_map);
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
        LatLng bobie1 = new LatLng(7.883668, 98.381158);
        mMap.addMarker(new MarkerOptions().position(bobie1).title("ปอเปี๊ยะสดหล่อโรง"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(bobie1,12),4000,null);

        LatLng bobie2 = new LatLng(7.915796, 98.346540);
        mMap.addMarker(new MarkerOptions().position(bobie2).title("ปอเปี๊ยะสด(แม่เบ๋ง)"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(bobie2,12),4000,null);

        LatLng bobie3 = new LatLng(7.886210, 98.387485);
        mMap.addMarker(new MarkerOptions().position(bobie3).title("ลกเที้ยน ศูนย์รวมอาหารพื้นเมืองภูเก็ต"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(bobie3,12),4000,null);
    }
}

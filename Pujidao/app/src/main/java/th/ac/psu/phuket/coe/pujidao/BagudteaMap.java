package th.ac.psu.phuket.coe.pujidao;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class BagudteaMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagudtea_map);
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
        LatLng bagud1 = new LatLng(7.903837, 98.352274);
        mMap.addMarker(new MarkerOptions().position(bagud1).title("เก็ตโฮ่ติ่มซำ"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bagud1));

        LatLng bagud2 = new LatLng(7.893469, 98.365402);
        mMap.addMarker(new MarkerOptions().position(bagud2).title("โรงเตี๊ยม"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bagud2));

        LatLng bagud3 = new LatLng(7.881430, 98.365701);
        mMap.addMarker(new MarkerOptions().position(bagud3).title("สภากาแฟ Sr แต๋เตี้ยม-นาคา"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bagud3));

        LatLng bagud4 = new LatLng(7.887465, 98.375720);
        mMap.addMarker(new MarkerOptions().position(bagud4).title("โชคชัยติ่มซำ"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(bagud4,12),4000,null);
    }
}

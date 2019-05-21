package th.ac.psu.phuket.coe.pujidao;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MeehunbachangMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meehunbachang_map);
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
        LatLng meehun1 = new LatLng(7.874214, 98.392902);
        mMap.addMarker(new MarkerOptions().position(meehun1).title("หมี่หุ้นกระดูกหมูจี้ใจบางเหนียว"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(meehun1,12),4000,null);

        LatLng meehun2 = new LatLng(7.899846, 98.347932);
        mMap.addMarker(new MarkerOptions().position(meehun2).title("เพื่อนติ๋มซำ"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(meehun2,12),4000,null);

        LatLng meehun3 = new LatLng(7.883701, 98.381192);
        mMap.addMarker(new MarkerOptions().position(meehun3).title("ตลาดหล่อโรง"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(meehun3,12),4000,null);

        LatLng meehun4 = new LatLng(7.885864, 98.387182);
        mMap.addMarker(new MarkerOptions().position(meehun4).title("อี๋เป๋งหมี่หุ้นกระดูกหมู "));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(meehun4,12),4000,null);
    }
}

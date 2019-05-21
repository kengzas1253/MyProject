package th.ac.psu.phuket.coe.pujidao;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MoohongMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moohong_map);
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
        LatLng moohong1 = new LatLng(7.900699, 98.340482);
        mMap.addMarker(new MarkerOptions().position(moohong1).title("สุข้าวแกงทุ่งทอง"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(moohong1,12),4000,null);

        LatLng moohong2 = new LatLng(7.899939, 98.348371);
        mMap.addMarker(new MarkerOptions().position(moohong2).title("อันดาข้าวแกงพื้นบ้าน"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(moohong2,12),4000,null);

        LatLng moohong3 = new LatLng(7.885865, 98.390974);
        mMap.addMarker(new MarkerOptions().position(moohong3).title("ระย้า"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(moohong3,12),4000,null);

        LatLng moohong4 = new LatLng(7.883637, 98.387971);
        mMap.addMarker(new MarkerOptions().position(moohong4).title("ตู้กับข้าว"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(moohong4,12),4000,null);
    }
}

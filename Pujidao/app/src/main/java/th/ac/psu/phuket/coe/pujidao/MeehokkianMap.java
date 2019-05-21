package th.ac.psu.phuket.coe.pujidao;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MeehokkianMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meehokkian_map);
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
        LatLng meehok = new LatLng(7.916139, 98.345872);
        mMap.addMarker(new MarkerOptions().position(meehok).title("ครัวจงจิต "));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(meehok,18),4000,null);

        LatLng meehok2 = new LatLng(7.910916, 98.334461);
        mMap.addMarker(new MarkerOptions().position(meehok2).title("หมี่ต้นโพธิ์สาขา2"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(meehok2,18),4000,null);

        LatLng meehok3 = new LatLng(7.886213, 98.387526);
        mMap.addMarker(new MarkerOptions().position(meehok3).title("ศูนย์อาหารพื้นเมืองลกเที้ยน"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(meehok3,18),4000,null);

        LatLng meehok4 = new LatLng(7.880186, 98.391998);
        mMap.addMarker(new MarkerOptions().position(meehok4).title("หมี่ต้นโพธิ์ ภูเก็ต"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(meehok4,18),4000,null);

        LatLng meehok5 = new LatLng(7.876216, 98.388572);
        mMap.addMarker(new MarkerOptions().position(meehok5).title("หมี่อ่าวเก"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(meehok5,18),4000,null);

        LatLng meehok6 = new LatLng(7.876216, 98.388572);
        mMap.addMarker(new MarkerOptions().position(meehok6).title("ร้านสามสาว"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(meehok6,18),4000,null);

        LatLng meehok7 = new LatLng(7.876584, 98.393012);
        mMap.addMarker(new MarkerOptions().position(meehok7).title("ร้านหมี่โกลา"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(meehok7,10),4000,null);

        LatLng meehok8 = new LatLng(7.947436, 98.391831);
        mMap.addMarker(new MarkerOptions().position(meehok8).title("ร้านหมี่สะปำ "));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(meehok8,12),4000,null);
    }
}

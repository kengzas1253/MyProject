package th.ac.psu.phuket.coe.pujidao;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class OeawMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oeaw_map);
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
        LatLng oeaw1 = new LatLng(7.883646, 98.381071);
        mMap.addMarker(new MarkerOptions().position(oeaw1).title("โอ้วเอ๋วตลาดหล่อโรง"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(oeaw1,12),4000,null);

        LatLng oeaw2 = new LatLng(7.886131, 98.387461);
        mMap.addMarker(new MarkerOptions().position(oeaw2).title("แป๊วเหนียว สยามเจ้าเก่า"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(oeaw2,12),4000,null);

        LatLng oeaw3 = new LatLng(7.885813, 98.387374);
        mMap.addMarker(new MarkerOptions().position(oeaw3).title("โอ้เอ๋ว เจ้าเก่า"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(oeaw3,12),4000,null);

        LatLng oeaw4 = new LatLng(7.884719, 98.390879);
        mMap.addMarker(new MarkerOptions().position(oeaw4).title("โอ้วเอ๋วแถวน้ำ"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(oeaw4,12),4000,null);
    }
}

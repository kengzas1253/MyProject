package th.ac.psu.phuket.coe.pujidao;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class LobaMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loba_map);
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
        LatLng loba1 = new LatLng(7.883674, 98.381169);
        mMap.addMarker(new MarkerOptions().position(loba1).title("โลบะ(จี้กุ่ย)"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(loba1,12),4000,null);

        LatLng loba2 = new LatLng(7.888770, 98.381808);
        mMap.addMarker(new MarkerOptions().position(loba2).title("โลบะ บางเหนียว"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(loba2,12),4000,null);

        LatLng loba3 = new LatLng(7.885029, 98.383177);
        mMap.addMarker(new MarkerOptions().position(loba3).title("โลบะศาลเจ้าแม่ย่านาง"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(loba3,12),4000,null);

        LatLng loba4 = new LatLng(7.886191, 98.387503);
        mMap.addMarker(new MarkerOptions().position(loba4).title("ลกเที้ยนศูนย์รวมอาหารพื้นเมืองภูเก็ต"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(loba4,12),4000,null);
    }
}

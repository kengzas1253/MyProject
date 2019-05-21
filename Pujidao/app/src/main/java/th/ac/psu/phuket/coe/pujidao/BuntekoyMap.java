package th.ac.psu.phuket.coe.pujidao;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class BuntekoyMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buntekoy_map);
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
        LatLng buntekoy1 = new LatLng(7.883223, 98.386058);
        mMap.addMarker(new MarkerOptions().position(buntekoy1).title("ตลาดสดสาธารณะ 1 เทศบาลนครภูเก็ต"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(buntekoy1,10),4000,null);

        LatLng buntekoy2 = new LatLng(7.877789, 98.395252);
        mMap.addMarker(new MarkerOptions().position(buntekoy2).title("ตลาดเกษตร"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(buntekoy2,10),4000,null);

        LatLng buntekoy3 = new LatLng(7.883667, 98.381156);
        mMap.addMarker(new MarkerOptions().position(buntekoy3).title("ตลาดหล่อดโรฃ"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(buntekoy3,10),4000,null);

        LatLng buntekoy4 = new LatLng(7.875357, 98.379033);
        mMap.addMarker(new MarkerOptions().position(buntekoy4).title("กุลธิดา ขนมหวาน"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(buntekoy4,10),4000,null);
    }
}

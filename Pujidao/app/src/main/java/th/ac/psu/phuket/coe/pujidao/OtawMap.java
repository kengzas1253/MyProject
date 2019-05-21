package th.ac.psu.phuket.coe.pujidao;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class OtawMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otaw_map);
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
        LatLng otaw1 = new LatLng(7.900305, 98.341373);
        mMap.addMarker(new MarkerOptions().position(otaw1).title("แป๊ะก๋าวโอวต้าวทุ่งทอง"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(otaw1));

        LatLng otaw2 = new LatLng(7.883710, 98.382557);
        mMap.addMarker(new MarkerOptions().position(otaw2).title("โอวต้าวสี่แยกจุ๊ยตุ่ย"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(otaw2));

        LatLng otaw3 = new LatLng(7.878299, 98.388847);
        mMap.addMarker(new MarkerOptions().position(otaw3).title("โอวต้าว ี้เปี่ยน"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(otaw3));

        LatLng otaw4 = new LatLng(7.874220, 98.393720);
        mMap.addMarker(new MarkerOptions().position(otaw4).title("โอวต้าวบางเหนียว"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(otaw4));

        LatLng otaw5 = new LatLng(7.881177, 98.382215);
        mMap.addMarker(new MarkerOptions().position(otaw5).title("โอวต้าวเยาว์เย็นตาโฟ"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(otaw5,12),4000,null);
    }
}

package th.ac.psu.phuket.coe.pujidao;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class My_Locattions extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap,nMap,oMap,sMap,tpMap,tMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my__locattions);
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
        nMap = googleMap;
        oMap = googleMap;
        sMap = googleMap;
        tpMap = googleMap;
        tMap =  googleMap;

        // Add a marker in Sydney and move the camera
        LatLng otaws = new LatLng(7.900316, 98.341352);
        mMap.addMarker(new MarkerOptions().position(otaws).title("ร้านขายโอวต้าวและผัดไทย"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(otaws));

        LatLng Meehokkians = new LatLng(7.916128, 98.345807);
        nMap.addMarker(new MarkerOptions().position(Meehokkians).title("ครัวจงจิต ร้านขายหมี่ฮกเกี้ยน"));
        nMap.moveCamera(CameraUpdateFactory.newLatLng(Meehokkians));

        LatLng Meehokkian2 = new LatLng(7.910931, 98.334483);
        oMap.addMarker(new MarkerOptions().position(Meehokkian2).title("หมี่ต้นโพธิ์สาขา2 ร้านขายหมี่ฮกเกี้ยน"));
        oMap.moveCamera(CameraUpdateFactory.newLatLng(Meehokkian2));

        LatLng Kawkang = new LatLng(7.900713, 98.340497);
        sMap.addMarker(new MarkerOptions().position(Kawkang).title("สุข้าวแกงทุ่งทอง ร้านขายข้าวแกงพื้นเมืองภูเก็ต"));
        sMap.moveCamera(CameraUpdateFactory.newLatLng(Kawkang));

        LatLng timsum1 = new LatLng(7.899848, 98.347945);
        tpMap.addMarker(new MarkerOptions().position(timsum1).title("ร้านขายติ่มซำและหมี่หุ้นป้าช่าง"));
        tpMap.moveCamera(CameraUpdateFactory.newLatLng(timsum1));

        LatLng timsum2 = new LatLng(7.903855, 98.352273);
        tMap.addMarker(new MarkerOptions().position(timsum2).title("เก็ตโฮ่ติ่มซำ ร้านขายติ่มซำข้าวต้ม บะกุ๋ตเต๋"));
        tMap.moveCamera(CameraUpdateFactory.newLatLng(timsum2));

        LatLng khawsoi = new LatLng(7.910691, 98.334678);
        oMap.addMarker(new MarkerOptions().position(khawsoi).title("ร้านขายข้าวซอยและข้าวขาหมูโบราณ"));
        oMap.moveCamera(CameraUpdateFactory.newLatLng(khawsoi));

        LatLng kawkang1 = new LatLng(7.899912, 98.348147);
        tpMap.addMarker(new MarkerOptions().position(kawkang1).title("ร้านขายข้าวแกงพื้นบ้านภูเก็ต"));
        tpMap.moveCamera(CameraUpdateFactory.newLatLng(kawkang1));

        LatLng kawkang3 = new LatLng(7.912477, 98.346721);
        tpMap.addMarker(new MarkerOptions().position(kawkang3).title("ร้านขายข้าวแกงและข้าวขาหมู"));
        tpMap.moveCamera(CameraUpdateFactory.newLatLng(kawkang3));


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.map_options, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Change the map type based on the user's selection.
        switch (item.getItemId()) {
            case R.id.normal_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                return true;
            case R.id.hybrid_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                return true;
            case R.id.satellite_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                return true;
            case R.id.terrain_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

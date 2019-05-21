package th.ac.psu.phuket.coe.pujidao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gjiazhe.panoramaimageview.GyroscopeObserver;
import com.gjiazhe.panoramaimageview.PanoramaImageView;

public class PoliceboxView extends AppCompatActivity {
    private GyroscopeObserver gyroscopeObserver4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policebox_view);

        gyroscopeObserver4 = new GyroscopeObserver();
        gyroscopeObserver4.setMaxRotateRadian(Math.PI/9);

        PanoramaImageView panoramaImageView = (PanoramaImageView)findViewById(R.id.panorama_policebox);
        panoramaImageView.setGyroscopeObserver(gyroscopeObserver4);
    }
    @Override
    protected void onResume() {
        super.onResume();
        gyroscopeObserver4.register(this);
    }
    @Override
    protected void onPause() {
        super.onPause();
        gyroscopeObserver4.unregister();
    }
}

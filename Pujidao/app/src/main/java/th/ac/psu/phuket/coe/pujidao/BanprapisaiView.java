package th.ac.psu.phuket.coe.pujidao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gjiazhe.panoramaimageview.GyroscopeObserver;
import com.gjiazhe.panoramaimageview.PanoramaImageView;

public class BanprapisaiView extends AppCompatActivity {
    private GyroscopeObserver gyroscopeObserver3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banprapisai_view);

        gyroscopeObserver3 = new GyroscopeObserver();
        gyroscopeObserver3.setMaxRotateRadian(Math.PI/9);

        PanoramaImageView panoramaImageView = (PanoramaImageView)findViewById(R.id.panorama_banprapisai);
        panoramaImageView.setGyroscopeObserver(gyroscopeObserver3);
    }
    @Override
    protected void onResume() {
        super.onResume();
        gyroscopeObserver3.register(this);
    }
    @Override
    protected void onPause() {
        super.onPause();
        gyroscopeObserver3.unregister();
    }
}

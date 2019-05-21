package th.ac.psu.phuket.coe.pujidao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gjiazhe.panoramaimageview.GyroscopeObserver;
import com.gjiazhe.panoramaimageview.PanoramaImageView;

public class ThaihuaView extends AppCompatActivity {
    private GyroscopeObserver gyroscopeObserver2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thaihua_view);

        gyroscopeObserver2 = new GyroscopeObserver();
        gyroscopeObserver2.setMaxRotateRadian(Math.PI/9);

        PanoramaImageView panoramaImageView = (PanoramaImageView)findViewById(R.id.panorama_thaihua);
        panoramaImageView.setGyroscopeObserver(gyroscopeObserver2);
    }
    @Override
    protected void onResume() {
        super.onResume();
        gyroscopeObserver2.register(this);
    }
    @Override
    protected void onPause() {
        super.onPause();
        gyroscopeObserver2.unregister();
    }
}

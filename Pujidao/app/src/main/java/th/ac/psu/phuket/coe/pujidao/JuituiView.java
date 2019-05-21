package th.ac.psu.phuket.coe.pujidao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gjiazhe.panoramaimageview.GyroscopeObserver;
import com.gjiazhe.panoramaimageview.PanoramaImageView;

public class JuituiView extends AppCompatActivity {
    private GyroscopeObserver gyroscopeObserver21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juitui_view);

        gyroscopeObserver21 = new GyroscopeObserver();
        gyroscopeObserver21.setMaxRotateRadian(Math.PI/9);

        PanoramaImageView panoramaImageView = (PanoramaImageView)findViewById(R.id.panorama_juitui);
        panoramaImageView.setGyroscopeObserver(gyroscopeObserver21);
    }
    @Override
    protected void onResume() {
        super.onResume();
        gyroscopeObserver21.register(this);
    }
    @Override
    protected void onPause() {
        super.onPause();
        gyroscopeObserver21.unregister();
    }
}

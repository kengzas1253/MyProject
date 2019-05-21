package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ThreebeachView extends AppCompatActivity {
    ImageButton threebeach1,threebeach2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threebeach_view);
        threebeach1 = (ImageButton) findViewById(R.id.ithreebeach1);
        threebeach1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gtb1 = new Intent(ThreebeachView.this,Khaoprayai.class);
                startActivity(Gtb1);
            }
        });
        threebeach2 = (ImageButton) findViewById(R.id.ithreebeach3);
        threebeach2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gtb2 = new Intent(ThreebeachView.this,Viewpoint.class);
                startActivity(Gtb2);
            }
        });
    }
}

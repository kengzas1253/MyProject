package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HlorongShrine extends AppCompatActivity {
    ImageButton hlorong1,hlorong2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hlorong_shrine);
        hlorong1 = (ImageButton) findViewById(R.id.ihlorong1);
        hlorong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Glr1 = new Intent(HlorongShrine.this,Samkongshrine.class);
                startActivity(Glr1);
            }
        });
        hlorong2 = (ImageButton) findViewById(R.id.ihlorong3);
        hlorong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Glr2 = new Intent(HlorongShrine.this,Shrine.class);
                startActivity(Glr2);
            }
        });
    }
}

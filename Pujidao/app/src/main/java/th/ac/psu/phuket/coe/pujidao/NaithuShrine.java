package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class NaithuShrine extends AppCompatActivity {
    ImageButton naithu1,naithu2,naithu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naithu_shrine);
        naithu1 = (ImageButton) findViewById(R.id.inaithu1);
        naithu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gnth1 = new Intent(NaithuShrine.this,Juituishrine.class);
                startActivity(Gnth1);
            }
        });
        naithu2 = (ImageButton) findViewById(R.id.inaithu3);
        naithu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gnth2 = new Intent(NaithuShrine.this,Shrine.class);
                startActivity(Gnth2);
            }
        });
        naithu3 = (ImageButton) findViewById(R.id.inaithu2);
        naithu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gnth3 = new Intent(NaithuShrine.this,Bangniewshrine.class);
                startActivity(Gnth3);
            }
        });
    }
}

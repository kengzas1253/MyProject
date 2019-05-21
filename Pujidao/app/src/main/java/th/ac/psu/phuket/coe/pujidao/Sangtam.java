package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Sangtam extends AppCompatActivity {
    ImageButton sanggo1,sanggo2,sanggo3,sanggo4;
    ImageView sanggo5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sangtam);
        sanggo1 = (ImageButton) findViewById(R.id.isb1);
        sanggo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Sanggo1 = new Intent(Sangtam.this,Banprapisai.class);
                startActivity(Sanggo1);
            }
        });
        sanggo2 = (ImageButton) findViewById(R.id.isb3);
        sanggo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Sanggo2 = new Intent(Sangtam.this,PagePlace.class);
                startActivity(Sanggo2);
            }
        });
        sanggo3 = (ImageButton) findViewById(R.id.isb5);
        sanggo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Sanggo3 = new Intent(Sangtam.this,SangtamMap.class);
                startActivity(Sanggo3);
            }
        });
        sanggo4 = (ImageButton) findViewById(R.id.isb2);
        sanggo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Sanggo4 = new Intent(Sangtam.this,Banprapitak.class);
                startActivity(Sanggo4);
            }
        });
        sanggo5 = (ImageView) findViewById(R.id.SangView);
        sanggo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Sanggo5 = new Intent(Sangtam.this,SangtamView.class);
                startActivity(Sanggo5);
            }
        });
    }
}

package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Kian extends AppCompatActivity {
    ImageButton kian1,kian2,kian3,kian4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kian);
        kian1 = (ImageButton) findViewById(R.id.ikian1);
        kian1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Kian1 = new Intent(Kian.this,Moohong.class);
                startActivity(Kian1);
            }
        });
        kian2 = (ImageButton) findViewById(R.id.ikian3);
        kian2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Kian2 = new Intent(Kian.this,Food.class);
                startActivity(Kian2);
            }
        });
        kian3 = (ImageButton) findViewById(R.id.ikian5);
        kian3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Kian3 = new Intent(Kian.this,LobaMap.class);
                startActivity(Kian3);
            }
        });
        kian4 = (ImageButton) findViewById(R.id.ikian2);
        kian4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Kian4 = new Intent(Kian.this,Oeaw.class);
                startActivity(Kian4);
            }
        });

    }
}

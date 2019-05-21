package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Loba extends AppCompatActivity {
    ImageButton loba1,loba2,loba3,loba4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loba);
        loba1 = (ImageButton) findViewById(R.id.iloba1);
        loba1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Loba1 = new Intent(Loba.this,Meehunbachang.class);
                startActivity(Loba1);
            }
        });
        loba2 = (ImageButton) findViewById(R.id.iloba3);
        loba2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Loba2 = new Intent(Loba.this,Food.class);
                startActivity(Loba2);
            }
        });
        loba3 = (ImageButton) findViewById(R.id.iloba5);
        loba3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Loba3 = new Intent(Loba.this,LobaMap.class);
                startActivity(Loba3);
            }
        });
        loba4 = (ImageButton) findViewById(R.id.iloba2);
        loba4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Loba4 = new Intent(Loba.this,Moohong.class);
                startActivity(Loba4);
            }
        });
    }
}

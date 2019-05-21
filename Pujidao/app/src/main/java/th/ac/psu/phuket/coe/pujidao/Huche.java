package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Huche extends AppCompatActivity {
    ImageButton huche1,huche2,huche3,huche4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huche);
        huche1 = (ImageButton) findViewById(R.id.ihuche1);
        huche1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent H1 = new Intent(Huche.this,Bobiesod.class);
                startActivity(H1);
            }
        });
        huche2 = (ImageButton) findViewById(R.id.ihuche3);
        huche2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent H2 = new Intent(Huche.this,Food.class);
                startActivity(H2);
            }
        });
        huche3 = (ImageButton) findViewById(R.id.ihuche5);
        huche3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent H3 = new Intent(Huche.this,MoohongMap.class);
                startActivity(H3);
            }
        });
        huche4 = (ImageButton) findViewById(R.id.ihuche2);
        huche4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent H4 = new Intent(Huche.this,Namprikkung.class);
                startActivity(H4);
            }
        });
    }
}

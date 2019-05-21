package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Bobiesod extends AppCompatActivity {
    ImageButton bobie1,bobie2,bobie3,bobie4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bobiesod);
        bobie1 = (ImageButton) findViewById(R.id.ibobie1);
        bobie1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bo1 = new Intent(Bobiesod.this,Bagudtea.class);
                startActivity(Bo1);
            }
        });
        bobie2 = (ImageButton) findViewById(R.id.ibobie3);
        bobie2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bo2 = new Intent(Bobiesod.this,Food.class);
                startActivity(Bo2);
            }
        });
        bobie3 = (ImageButton) findViewById(R.id.ibobie5);
        bobie3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bo3 = new Intent(Bobiesod.this,BagudteaMap.class);
                startActivity(Bo3);
            }
        });
        bobie4 = (ImageButton) findViewById(R.id.ibobie2);
        bobie4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B4 = new Intent(Bobiesod.this,Huche.class);
                startActivity(B4);
            }
        });
    }
}

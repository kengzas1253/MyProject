package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Bagudtea extends AppCompatActivity {
    ImageButton bagud1,bagud2,bagud3,bagud4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagudtea);
        bagud1 = (ImageButton) findViewById(R.id.ibagud1);
        bagud1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B1 = new Intent(Bagudtea.this,Oeaw.class);
                startActivity(B1);
            }
        });
        bagud2 = (ImageButton) findViewById(R.id.ibagud3);
        bagud2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B2 = new Intent(Bagudtea.this,Food.class);
                startActivity(B2);
            }
        });
        bagud3 = (ImageButton) findViewById(R.id.ibagud5);
        bagud3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B3 = new Intent(Bagudtea.this,BagudteaMap.class);
                startActivity(B3);
            }
        });
        bagud4 = (ImageButton) findViewById(R.id.ibagud2);
        bagud4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B4 = new Intent(Bagudtea.this,Bobiesod.class);
                startActivity(B4);
            }
        });
    }
}

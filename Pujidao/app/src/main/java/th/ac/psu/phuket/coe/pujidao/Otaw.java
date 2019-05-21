package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Otaw extends AppCompatActivity {
    ImageButton otaw1,otaw2,otaw3,otaw4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otaw);
        otaw1 = (ImageButton) findViewById(R.id.iob1);
        otaw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Otaw1 = new Intent(Otaw.this,Meehokkian.class);
                startActivity(Otaw1);
            }
        });
        otaw2 = (ImageButton) findViewById(R.id.iob3);
        otaw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Otaw2 = new Intent(Otaw.this,Food.class);
                startActivity(Otaw2);
            }
        });
        otaw3 = (ImageButton) findViewById(R.id.iob5);
        otaw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Otaw3 = new Intent(Otaw.this,OtawMap.class);
                startActivity(Otaw3);
            }
        });
        otaw4 = (ImageButton) findViewById(R.id.iob2);
        otaw4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Otaw4 = new Intent(Otaw.this,Meehunbachang.class);
                startActivity(Otaw4);
            }
        });
    }
}

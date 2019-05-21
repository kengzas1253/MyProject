package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Oeaw extends AppCompatActivity {
    ImageButton oeaw1,oeaw2,oeaw3,oeaw4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oeaw);
        oeaw1 = (ImageButton) findViewById(R.id.ioeaw1);
        oeaw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Oeaw1 = new Intent(Oeaw.this,Kian.class);
                startActivity(Oeaw1);
            }
        });
        oeaw2 = (ImageButton) findViewById(R.id.ioeaw3);
        oeaw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Oeaw2 = new Intent(Oeaw.this,Food.class);
                startActivity(Oeaw2);
            }
        });
        oeaw3 = (ImageButton) findViewById(R.id.ioeaw5);
        oeaw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Oeaw3 = new Intent(Oeaw.this,OeawMap.class);
                startActivity(Oeaw3);
            }
        });
        oeaw4 = (ImageButton) findViewById(R.id.ioeaw2);
        oeaw4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Oeaw4 = new Intent(Oeaw.this,Bagudtea.class);
                startActivity(Oeaw4);
            }
        });
    }
}

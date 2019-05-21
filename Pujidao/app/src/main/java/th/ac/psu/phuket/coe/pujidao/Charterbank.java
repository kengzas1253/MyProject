package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Charterbank extends AppCompatActivity {
    ImageButton charter1,charter2,charter3,charter4;
    ImageView charter5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charterbank);
        charter1 = (ImageButton) findViewById(R.id.ictb1);
        charter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ctgo1 = new Intent(Charterbank.this,Banpraaram.class);
                startActivity(Ctgo1);
            }
        });
        charter2 = (ImageButton) findViewById(R.id.ictb3);
        charter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ctgo2 = new Intent(Charterbank.this,PagePlace.class);
                startActivity(Ctgo2);
            }
        });
        charter3 = (ImageButton) findViewById(R.id.ictb5);
        charter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ctgo3 = new Intent(Charterbank.this,CharterbankMap.class);
                startActivity(Ctgo3);
            }
        });
        charter4 = (ImageButton) findViewById(R.id.ictb2);
        charter4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ctgo4 = new Intent(Charterbank.this,Policebox.class);
                startActivity(Ctgo4);
            }
        });
        charter5 = (ImageView) findViewById(R.id.CharterView);
        charter5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ctgo5 = new Intent(Charterbank.this,CharterbankView.class);
                startActivity(Ctgo5);
            }
        });
    }
}

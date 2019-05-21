package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Policebox extends AppCompatActivity {
    ImageButton pbox1,pbox2,pbox3;
    ImageView pbox4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policebox);
        pbox1 = (ImageButton) findViewById(R.id.iplb1);
        pbox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Pbox1 = new Intent(Policebox.this,Charterbank.class);
                startActivity(Pbox1);
            }
        });
        pbox2 = (ImageButton) findViewById(R.id.iplb3);
        pbox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Pbox2 = new Intent(Policebox.this,PagePlace.class);
                startActivity(Pbox2);
            }
        });
        pbox3 = (ImageButton) findViewById(R.id.iplb5);
        pbox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Pbox3 = new Intent(Policebox.this,PoliceboxMap.class);
                startActivity(Pbox3);
            }
        });
        pbox4 = (ImageView) findViewById(R.id.PoliceView);
        pbox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Pbox4 = new Intent(Policebox.this,PoliceboxView.class);
                startActivity(Pbox4);
            }
        });

    }
}

package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Promtepcape extends AppCompatActivity {
    ImageButton lamprom1,lamprom2,lamprom3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promtepcape);
        lamprom1 = (ImageButton) findViewById(R.id.ipromtep1);
        lamprom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Glp1 = new Intent(Promtepcape.this,khaokhad.class);
                startActivity(Glp1);
            }
        });
        lamprom2 = (ImageButton) findViewById(R.id.ipromtep3);
        lamprom2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Glp2 = new Intent(Promtepcape.this,Viewpoint.class);
                startActivity(Glp2);
            }
        });
        lamprom3 = (ImageButton) findViewById(R.id.ipromtep2);
        lamprom3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Glp3 = new Intent(Promtepcape.this,Khaoprayai.class);
                startActivity(Glp3);
            }
        });
    }
}

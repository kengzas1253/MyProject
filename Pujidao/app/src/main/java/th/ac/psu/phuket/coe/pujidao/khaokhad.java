package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class khaokhad extends AppCompatActivity {
    ImageButton khaokhad1,khaokhad2,khaokhad3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khaokhad);
        khaokhad1 = (ImageButton) findViewById(R.id.ikhaokhad1);
        khaokhad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gh1 = new Intent(khaokhad.this,Khaoranghill.class);
                startActivity(Gh1);
            }
        });
        khaokhad2 = (ImageButton) findViewById(R.id.ikhaokhad3);
        khaokhad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gh2 = new Intent(khaokhad.this,Viewpoint.class);
                startActivity(Gh2);
            }
        });
        khaokhad3 = (ImageButton) findViewById(R.id.ikhaokhad2);
        khaokhad3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gh3 = new Intent(khaokhad.this,Promtepcape.class);
                startActivity(Gh3);
            }
        });
    }
}

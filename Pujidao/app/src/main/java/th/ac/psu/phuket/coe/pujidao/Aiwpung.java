package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Aiwpung extends AppCompatActivity {
    ImageButton aiw1,aiw2,aiw3,aiw4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aiwpung);
        aiw1 = (ImageButton) findViewById(R.id.iaiw1);
        aiw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A1 = new Intent(Aiwpung.this,Koybangka.class);
                startActivity(A1);
            }
        });
        aiw2 = (ImageButton) findViewById(R.id.iaiw3);
        aiw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A2 = new Intent(Aiwpung.this,Candy.class);
                startActivity(A2);
            }
        });
        aiw3 = (ImageButton) findViewById(R.id.iaiw5);
        aiw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A3 = new Intent(Aiwpung.this,BuntekoyMap.class);
                startActivity(A3);
            }
        });
        aiw4 = (ImageButton) findViewById(R.id.iaiw2);
        aiw4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  A4 = new Intent(Aiwpung.this,Bietaybark.class);
                startActivity(A4);
            }
        });
    }
}

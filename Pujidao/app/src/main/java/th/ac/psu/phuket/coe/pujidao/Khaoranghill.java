package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Khaoranghill extends AppCompatActivity {
    ImageButton khaorang1,khaorang2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khaoranghill);
        khaorang1 = (ImageButton) findViewById(R.id.ikhaorang3);
        khaorang1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gr1 = new Intent(Khaoranghill.this,Viewpoint.class);
                startActivity(Gr1);
            }
        });
        khaorang2 = (ImageButton) findViewById(R.id.ikhaorang2);
        khaorang2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gr2 = new Intent(Khaoranghill.this,khaokhad.class);
                startActivity(Gr2);
            }
        });
    }
}

package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Bangniewshrine extends AppCompatActivity {
    ImageButton bangniew1,bangniew2,bangniew3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangniewshrine);
        bangniew1 = (ImageButton) findViewById(R.id.ibangniew1);
        bangniew1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gbn1 = new Intent(Bangniewshrine.this,NaithuShrine.class);
                startActivity(Gbn1);
            }
        });
        bangniew2 = (ImageButton) findViewById(R.id.ibangniew3);
        bangniew2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gbn2 = new Intent(Bangniewshrine.this,Shrine.class);
                startActivity(Gbn2);
            }
        });
        bangniew3 = (ImageButton) findViewById(R.id.ibangniew2);
        bangniew3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gbn3 = new Intent(Bangniewshrine.this,Samkongshrine.class);
                startActivity(Gbn3);
            }
        });
    }
}

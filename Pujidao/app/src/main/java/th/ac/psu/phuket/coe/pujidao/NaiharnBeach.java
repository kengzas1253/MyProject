package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class NaiharnBeach extends AppCompatActivity {
    ImageButton naiharn1,naiharn2,naiharn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naiharn_beach);
        naiharn1 = (ImageButton) findViewById(R.id.inaiharn1);
        naiharn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gnh1 = new Intent(NaiharnBeach.this,KatanoiBeach.class);
                startActivity(Gnh1);
            }
        });
        naiharn2 = (ImageButton) findViewById(R.id.inaiharn3);
        naiharn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gnh2 = new Intent(NaiharnBeach.this,Beaches.class);
                startActivity(Gnh2);
            }
        });
        naiharn3 = (ImageButton) findViewById(R.id.inaiharn2);
        naiharn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gnh3 = new Intent(NaiharnBeach.this,YanuiBeach.class);
                startActivity(Gnh3);
            }
        });
    }
}

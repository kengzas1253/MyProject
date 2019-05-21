package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Chaitawkoy extends AppCompatActivity {
    ImageButton ctk1, ctk2, ctk3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaitawkoy);
        ctk1 = (ImageButton) findViewById(R.id.ictk1);
        ctk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ch1 = new Intent(Chaitawkoy.this, Seaguokoy.class);
                startActivity(Ch1);
            }
        });
        ctk2 = (ImageButton) findViewById(R.id.ictk3);
        ctk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ch2 = new Intent(Chaitawkoy.this, Candy.class);
                startActivity(Ch2);
            }
        });
        ctk3 = (ImageButton) findViewById(R.id.ictk5);
        ctk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ch3 = new Intent(Chaitawkoy.this, BuntekoyMap.class);
                startActivity(Ch3);
            }
        });

    }
}

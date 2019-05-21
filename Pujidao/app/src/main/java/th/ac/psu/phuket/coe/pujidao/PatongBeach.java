package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PatongBeach extends AppCompatActivity {
    ImageButton patong1,patong2,patong3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patong_beach);
        patong1 = (ImageButton) findViewById(R.id.ipatong1);
        patong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gpt1 = new Intent(PatongBeach.this,KatanoiBeach.class);
                startActivity(Gpt1);
            }
        });
        patong2 = (ImageButton) findViewById(R.id.ipatong3);
        patong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gpt2 = new Intent(PatongBeach.this,Beaches.class);
                startActivity(Gpt2);
            }
        });
        patong3 = (ImageButton) findViewById(R.id.ipatong2);
        patong3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gpt3 = new Intent(PatongBeach.this,NaiharnBeach.class);
                startActivity(Gpt3);
            }
        });
    }
}

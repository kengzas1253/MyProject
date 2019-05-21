package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Samkongshrine extends AppCompatActivity {
    ImageButton samkong1,samkong2,samkong3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samkongshrine);
        samkong1 = (ImageButton) findViewById(R.id.isamkong1);
        samkong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gsk1 = new Intent(Samkongshrine.this,Bangniewshrine.class);
                startActivity(Gsk1);
            }
        });
        samkong2 = (ImageButton) findViewById(R.id.isamkong3);
        samkong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gsk2 = new Intent(Samkongshrine.this,Shrine.class);
                startActivity(Gsk2);
            }
        });
        samkong3 = (ImageButton) findViewById(R.id.isamkong2);
        samkong3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gsk3 = new Intent(Samkongshrine.this,HlorongShrine.class);
                startActivity(Gsk3);
            }
        });
    }
}

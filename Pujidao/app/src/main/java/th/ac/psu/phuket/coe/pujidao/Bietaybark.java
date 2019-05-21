package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Bietaybark extends AppCompatActivity {
    ImageButton btb1,btb2,btb3,btb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bietaybark);
        btb1 = (ImageButton) findViewById(R.id.ibtb1);
        btb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bie1 = new Intent(Bietaybark.this,Aiwpung.class);
                startActivity(Bie1);
            }
        });
        btb2 = (ImageButton) findViewById(R.id.ibtb3);
        btb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bie2 = new Intent(Bietaybark.this,Candy.class);
                startActivity(Bie2);
            }
        });
        btb3 = (ImageButton) findViewById(R.id.ibtb5);
        btb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bie3 = new Intent(Bietaybark.this,BuntekoyMap.class);
                startActivity(Bie3);
            }
        });
        btb4 = (ImageButton) findViewById(R.id.ibtb2);
        btb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  A4 = new Intent(Bietaybark.this,Seaguokoy.class);
                startActivity(A4);
            }
        });
    }
}

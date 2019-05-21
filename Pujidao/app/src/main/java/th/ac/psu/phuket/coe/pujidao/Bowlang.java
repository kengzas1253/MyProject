package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Bowlang extends AppCompatActivity {
    ImageButton bowlang1,bowlang2,bowlang3,bowlang4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bowlang);
        bowlang1 = (ImageButton) findViewById(R.id.ibowlang1);
        bowlang1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bl1 = new Intent(Bowlang.this,Abong.class);
                startActivity(Bl1);
            }
        });
        bowlang2 = (ImageButton) findViewById(R.id.ibowlang3);
        bowlang2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bl2 = new Intent(Bowlang.this,Candy.class);
                startActivity(Bl2);
            }
        });
        bowlang3 = (ImageButton) findViewById(R.id.ibowlang5);
        bowlang3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bl3 = new Intent(Bowlang.this,BuntekoyMap.class);
                startActivity(Bl3);
            }
        });
        bowlang4 = (ImageButton) findViewById(R.id.ibowlang2);
        bowlang4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  Bl4 = new Intent(Bowlang.this,beaheji.class);
                startActivity(Bl4);
            }
        });
    }
}

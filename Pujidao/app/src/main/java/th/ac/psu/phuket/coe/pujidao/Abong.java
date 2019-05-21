package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Abong extends AppCompatActivity {
    ImageButton abong1,abong2,abong3,abong4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abong);
        abong1 = (ImageButton) findViewById(R.id.iabong1);
        abong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ag1 = new Intent(Abong.this,Anggu.class);
                startActivity(Ag1);
            }
        });
        abong2 = (ImageButton) findViewById(R.id.iabong3);
        abong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ag2 = new Intent(Abong.this,Candy.class);
                startActivity(Ag2);
            }
        });
        abong3 = (ImageButton) findViewById(R.id.iabong5);
        abong3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ag3 = new Intent(Abong.this,BuntekoyMap.class);
                startActivity(Ag3);
            }
        });
        abong4 = (ImageButton) findViewById(R.id.iabong2);
        abong4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  Ag4 = new Intent(Abong.this,Bowlang.class);
                startActivity(Ag4);
            }
        });
    }
}

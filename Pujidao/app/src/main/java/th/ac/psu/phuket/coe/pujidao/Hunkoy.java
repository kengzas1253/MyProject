package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Hunkoy extends AppCompatActivity {
    ImageButton hk1,hk2,hk3,hk4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hunkoy);
        hk1 = (ImageButton) findViewById(R.id.ihk1);
        hk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Hk1 = new Intent(Hunkoy.this,Daopaokoy.class);
                startActivity(Hk1);
            }
        });
        hk2 = (ImageButton) findViewById(R.id.ihk3);
        hk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Hk2 = new Intent(Hunkoy.this,Candy.class);
                startActivity(Hk2);
            }
        });
        hk3 = (ImageButton) findViewById(R.id.ihk5);
        hk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Hk3 = new Intent(Hunkoy.this,BuntekoyMap.class);
                startActivity(Hk3);
            }
        });
        hk4 = (ImageButton) findViewById(R.id.ihk2);
        hk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Hk4 = new Intent(Hunkoy.this,Youjakoy.class);
                startActivity(Hk4);
            }
        });
    }
}

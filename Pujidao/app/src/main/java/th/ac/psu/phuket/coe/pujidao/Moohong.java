package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Moohong extends AppCompatActivity {
    ImageButton moo1,moo2,moo3,moo4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moohong);
        moo1 = (ImageButton) findViewById(R.id.imh1);
        moo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Moo1 = new Intent(Moohong.this,Loba.class);
                startActivity(Moo1);
            }
        });
        moo2 = (ImageButton) findViewById(R.id.imh3);
        moo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Moo2 = new Intent(Moohong.this,Food.class);
                startActivity(Moo2);
            }
        });
        moo3 = (ImageButton) findViewById(R.id.imh5);
        moo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Moo3 = new Intent(Moohong.this,MoohongMap.class);
                startActivity(Moo3);
            }
        });
        moo4 = (ImageButton) findViewById(R.id.imh2);
        moo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Moo4 = new Intent(Moohong.this,Kian.class);
                startActivity(Moo4);
            }
        });
    }
}

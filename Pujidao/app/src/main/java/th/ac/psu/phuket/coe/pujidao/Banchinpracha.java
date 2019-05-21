package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Banchinpracha extends AppCompatActivity {
    ImageButton chgo1,chgo2,chgo3,chgo4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banchinpracha);
        chgo1 = (ImageButton) findViewById(R.id.ichb1);
        chgo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Chgo1 = new Intent(Banchinpracha.this,Thaihua.class);
                startActivity(Chgo1);
            }
        });
        chgo2 = (ImageButton) findViewById(R.id.ichb3);
        chgo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Chgo2 = new Intent(Banchinpracha.this,PagePlace.class);
                startActivity(Chgo2);
            }
        });
        chgo3 = (ImageButton) findViewById(R.id.ichb5);
        chgo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Chgo3 = new Intent(Banchinpracha.this,BanchinprachaMap.class);
                startActivity(Chgo3);
            }
        });
        chgo4 = (ImageButton) findViewById(R.id.ichb2);
        chgo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Chgo3 = new Intent(Banchinpracha.this,Banprapisai.class);
                startActivity(Chgo3);
            }
        });
    }
}

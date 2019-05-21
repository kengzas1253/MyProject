package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Thaihua extends AppCompatActivity {
    ImageButton thgo1,thgo2,thgo3;
    ImageView thgo4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thaihua);
        thgo1 = (ImageButton) findViewById(R.id.ihb3);
        thgo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Thgo1 = new Intent(Thaihua.this,PagePlace.class);
                startActivity(Thgo1);
            }
        });
        thgo2 = (ImageButton) findViewById(R.id.ihb5);
        thgo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Thgo2 = new Intent(Thaihua.this,ThaihuaMap.class);
                startActivity(Thgo2);
            }
        });
        thgo3 = (ImageButton) findViewById(R.id.ihb2);
        thgo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Thgo3 = new Intent(Thaihua.this,Banchinpracha.class);
                startActivity(Thgo3);
        }
        });
        thgo4 = (ImageView) findViewById(R.id.ThaihuaView);
        thgo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Thgo4 = new Intent(Thaihua.this,ThaihuaView.class);
                startActivity(Thgo4);
            }
        });
    }
}

package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Banprapisai extends AppCompatActivity {
    ImageButton psgo1,psgo2,psgo3,psgo4;
    ImageView psgo5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banprapisai);
        psgo1 = (ImageButton) findViewById(R.id.ipsb1);
        psgo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Psgo1 = new Intent(Banprapisai.this,Banchinpracha.class);
                startActivity(Psgo1);
            }
        });
        psgo2 = (ImageButton) findViewById(R.id.ipsb3);
        psgo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Psgo2 = new Intent(Banprapisai.this,PagePlace.class);
                startActivity(Psgo2);
            }
        });
        psgo3 = (ImageButton) findViewById(R.id.ipsb5);
        psgo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Psgo3 = new Intent(Banprapisai.this,BanprapisaiMap.class);
                startActivity(Psgo3);
            }
        });
        psgo4 = (ImageButton) findViewById(R.id.ipsb2);
        psgo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Psgo4 = new Intent(Banprapisai.this,Sangtam.class);
                startActivity(Psgo4);
            }
        });
        psgo5 = (ImageView) findViewById(R.id.BanprapisaiView);
        psgo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Psgo5 = new Intent(Banprapisai.this,BanprapisaiView.class);
                startActivity(Psgo5);
            }
        });
    }
}

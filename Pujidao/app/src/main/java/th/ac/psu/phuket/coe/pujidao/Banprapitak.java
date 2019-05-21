package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Banprapitak extends AppCompatActivity {
    ImageButton prapitak1,prapitak2,prapitak3,prapitak4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banprapitak);
        prapitak1 = (ImageButton) findViewById(R.id.iptb1);
        prapitak1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ptgo1 = new Intent(Banprapitak.this,Sangtam.class);
                startActivity(Ptgo1);
            }
        });
        prapitak2 = (ImageButton) findViewById(R.id.iptb3);
        prapitak2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ptgo2 = new Intent(Banprapitak.this,PagePlace.class);
                startActivity(Ptgo2);
            }
        });
        prapitak3 = (ImageButton) findViewById(R.id.iptb5);
        prapitak3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ptgo3 = new Intent(Banprapitak.this,BanprapitakMap.class);
                startActivity(Ptgo3);
            }
        });
        prapitak4 = (ImageButton) findViewById(R.id.iptb2);
        prapitak4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ptgo4 = new Intent(Banprapitak.this,Banpraaram.class);
                startActivity(Ptgo4);
            }
        });
    }
}

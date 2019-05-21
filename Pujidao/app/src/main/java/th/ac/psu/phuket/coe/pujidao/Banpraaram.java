package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Banpraaram extends AppCompatActivity {
    ImageButton banpraaram1,banpraaram2,banpraaram3,banpraaram4;
    ImageView banpraaram5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banpraaram);
        banpraaram1 = (ImageButton) findViewById(R.id.iprb1);
        banpraaram1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Prgo1 = new Intent(Banpraaram.this,Banprapitak.class);
                startActivity(Prgo1);
            }
        });
        banpraaram2 = (ImageButton) findViewById(R.id.iprb3);
        banpraaram2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Prgo2 = new Intent(Banpraaram.this,PagePlace.class);
                startActivity(Prgo2);
            }
        });
        banpraaram3 = (ImageButton) findViewById(R.id.iprb5);
        banpraaram3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Prgo3 = new Intent(Banpraaram.this,BanpraaramMap.class);
                startActivity(Prgo3);
            }
        });
        banpraaram4 = (ImageButton) findViewById(R.id.iprb2);
        banpraaram4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Prgo4 = new Intent(Banpraaram.this,Charterbank.class);
                startActivity(Prgo4);
            }
        });
        banpraaram5 = (ImageView) findViewById(R.id.PraaramView);
        banpraaram5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Prgo5 = new Intent(Banpraaram.this,BanpraaramView.class);
                startActivity(Prgo5);
            }
        });
    }
}

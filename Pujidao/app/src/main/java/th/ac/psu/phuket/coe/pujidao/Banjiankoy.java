package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Banjiankoy extends AppCompatActivity {
    ImageButton bjk1,bjk2,bjk3,bjk4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banjiankoy);
        bjk1 = (ImageButton) findViewById(R.id.ibjk1);
        bjk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bj1 = new Intent(Banjiankoy.this,Beatongkoy.class);
                startActivity(Bj1);
            }
        });
        bjk2 = (ImageButton) findViewById(R.id.ibjk3);
        bjk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bj2 = new Intent(Banjiankoy.this,Candy.class);
                startActivity(Bj2);
            }
        });
        bjk3 = (ImageButton) findViewById(R.id.ibjk5);
        bjk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bj3 = new Intent(Banjiankoy.this,BuntekoyMap.class);
                startActivity(Bj3);
            }
        });
        bjk4 = (ImageButton) findViewById(R.id.ibjk2);
        bjk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bj4 = new Intent(Banjiankoy.this,Daopaokoy.class);
                startActivity(Bj4);
            }
        });
    }
}

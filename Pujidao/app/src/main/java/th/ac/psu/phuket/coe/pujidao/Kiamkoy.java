package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Kiamkoy extends AppCompatActivity {
    ImageButton kmk1,kmk2,kmk3,kmk4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiamkoy);
        kmk1 = (ImageButton) findViewById(R.id.ikmk1);
        kmk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent km1 = new Intent(Kiamkoy.this,Kiakoy.class);
                startActivity(km1);
            }
        });
        kmk2 = (ImageButton) findViewById(R.id.ikmk3);
        kmk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent km2 = new Intent(Kiamkoy.this,Candy.class);
                startActivity(km2);
            }
        });
        kmk3 = (ImageButton) findViewById(R.id.ikmk5);
        kmk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent km3 = new Intent(Kiamkoy.this,BuntekoyMap.class);
                startActivity(km3);
            }
        });
        kmk4 = (ImageButton) findViewById(R.id.ikmk2);
        kmk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  km4 = new Intent(Kiamkoy.this,Koytalam.class);
                startActivity(km4);
            }
        });
    }
}

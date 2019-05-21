package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Daopaokoy extends AppCompatActivity {
    ImageButton dpk1,dpk2,dpk3,dpk4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daopaokoy);
        dpk1 = (ImageButton) findViewById(R.id.idpk1);
        dpk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dp1 = new Intent(Daopaokoy.this,Banjiankoy.class);
                startActivity(Dp1);
            }
        });
        dpk2 = (ImageButton) findViewById(R.id.idpk3);
        dpk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dp2 = new Intent(Daopaokoy.this,Candy.class);
                startActivity(Dp2);
            }
        });
        dpk3 = (ImageButton) findViewById(R.id.idpk5);
        dpk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dp3 = new Intent(Daopaokoy.this,BuntekoyMap.class);
                startActivity(Dp3);
            }
        });
        dpk4 = (ImageButton) findViewById(R.id.idpk2);
        dpk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dp4 = new Intent(Daopaokoy.this,Huadkoy.class);
                startActivity(Dp4);
            }
        });
    }
}

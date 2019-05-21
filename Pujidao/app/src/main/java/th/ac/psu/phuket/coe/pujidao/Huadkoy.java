package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Huadkoy extends AppCompatActivity {
    ImageButton hdk1,hdk2,hdk3,hdk4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huadkoy);
        hdk1 = (ImageButton) findViewById(R.id.ihdk1);
        hdk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dk1 = new Intent(Huadkoy.this,Daopaokoy.class);
                startActivity(Dk1);
            }
        });
        hdk2 = (ImageButton) findViewById(R.id.ihdk3);
        hdk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dk2 = new Intent(Huadkoy.this,Candy.class);
                startActivity(Dk2);
            }
        });
        hdk3 = (ImageButton) findViewById(R.id.ihdk5);
        hdk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dk3 = new Intent(Huadkoy.this,BuntekoyMap.class);
                startActivity(Dk3);
            }
        });
        hdk4 = (ImageButton) findViewById(R.id.ihdk2);
        hdk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dk4 = new Intent(Huadkoy.this,Hunkoy.class);
                startActivity(Dk4);
            }
        });
    }
}
